package spil.controller;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.DiceCup;
import spil.entity.GameBoard;
import spil.entity.PlayerList;

public class GameController {

	private DiceCup diceCup;
	private PlayerList playerList;
	private GameBoard gameBoard;

	public GameController() {

		diceCup = new DiceCup(2, 6);
		gameBoard = new GameBoard();

		gameBoard.initFields();

		int playerAmount = GUIBoundary.decidePlayerAmount();

		playerList = new PlayerList(playerAmount, 10000000, 0, 30000);

		GUIBoundary.print(TextBoundary.playerAmountMessage(playerAmount));

		
		
		playerList.getPlayer(0).setPosition(14);

		gameBoard.landOnField(playerList.getPlayer(0));

		gameBoard.landOnField(playerList.getPlayer(0));

		playerList.getPlayer(0).setPosition(13);

		gameBoard.landOnField(playerList.getPlayer(0));

		playerList.getPlayer(1).setCurrentRoll(5);
		playerList.getPlayer(1).setPosition(13);
		gameBoard.landOnField(playerList.getPlayer(1));

	}

}