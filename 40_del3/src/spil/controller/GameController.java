package spil.controller;

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

	// Spaghetti/ghetto solution? Hvordan er denne klasse generelt? Er den OK?
	public GameController() {
		diceCup = new DiceCup(2, 6);

		gameBoard = new GameBoard();

		gameBoard.initFields();

		int playerAmount = GUIBoundary.decidePlayerAmount();

		playerList = new PlayerList(playerAmount, 10000000, 0, 30000, 0, gameBoard.getRandomUniqueCars());
		playerList.setHomeCars();

		GUIBoundary.print(TextBoundary.playerAmountMessage(playerAmount));

		initGameLoop();
	}

	private void initGameLoop() {
		int rollTotal;
		int index = 0;

		while (playerList.getPlayersLeft() > 1) {
			Player currentPlayer = playerList.getPlayer(index);

			rollTotal = diceCup.rollDice(currentPlayer);

			playerList.movePlayer(index, rollTotal);
			gameBoard.landOnField(currentPlayer);

			if (currentPlayer.isBankrupt()) {
				GUIBoundary.print(TextBoundary.removePlayerMessage(currentPlayer));
				playerList.removePlayer(currentPlayer);
			}

			index = calculateIndex(index);
		}

		GUIBoundary.print(TextBoundary.winnerMessage(playerList.getLastPlayer()));
	}

	private int calculateIndex(int index) {
		if (index == (playerList.getTotalPlayers() - 1)) {
			return index = 0;
		}
		return index + 1;
	}
}
