package spil.controller;

import desktop_resources.GUI;
import spil.entity.DiceCup;
import spil.entity.GameBoard;
import spil.entity.PlayerList;
import spil.entity.field.Field;
import spil.entity.field.Tax;
import spil.entity.field.Territory;

public class GameController {

	private DiceCup diceCup;
	private PlayerList playerList;
	private GameBoard gameBoard;

	public GameController() {
		diceCup = new DiceCup(2, 6);
		playerList = new PlayerList(6, 100000, 0, 30000);
		gameBoard = new GameBoard();

		spil.entity.Player p1 = new spil.entity.Player("p1", 10000, 0, 5000);
		spil.entity.Player p2 = new spil.entity.Player("p2", 10000, 0, 5000);
		GUI.addPlayer(p1.getName(), p1.getBalance());
		GUI.addPlayer(p2.getName(), p2.getBalance());

		Field f1 = new Territory(1000, 100);
		Field f2 = new Territory(1000, 100);

		f1.landOnField(p1);
		GUI.setBalance(p1.getName(), p1.getBalance());
		f1.landOnField(p2);
		GUI.setBalance(p2.getName(), p2.getBalance());

	}

}