package spil.controller;

import spil.boundary.GUIBoundary;
import spil.entity.DiceCup;
import spil.entity.GameBoard;
import spil.entity.PlayerList;

public class GameController {

	private DiceCup diceCup;
	private PlayerList playerList;
	private GameBoard gameBoard;

	public GameController() {
		diceCup = new DiceCup(2, 6);
		playerList = new PlayerList(GUIBoundary.decidePlayerAmount(), 10000000, 0, 30000);
		gameBoard = new GameBoard();
	}

}