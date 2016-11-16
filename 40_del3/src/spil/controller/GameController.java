package spil.controller;

import desktop_resources.GUI;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.DiceCup;
import spil.entity.GameBoard;
import spil.entity.Player;
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
		initGameLoop();
	}

	private void initGameLoop() {

		int index = 0;
		while (true) {
			Player currentPlayer = playerList.getPlayer(index);

			int rollTotal = diceCup.rollDice(currentPlayer);

			playerList.movePlayer(currentPlayer.getPosition(), rollTotal);
			gameBoard.landOnField(currentPlayer);

			if (playerList.getPlayersLeft() == 1) {
				// TODO create this.
				GUI.showMessage("GAME IS WON!");
			}
			index++;
		}
	}
}