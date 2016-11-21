package spil.controller;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.DiceCup;
import spil.entity.GameBoard;
import spil.entity.Player;
import spil.entity.PlayerList;

public class GameController {

	/*
	 * Objects from the entities package.
	 * diceCup holds all the dice in the game.
	 * playerList holds all the players in the game.
	 * gameBoard manages the fields in the game.
	 */
	private DiceCup diceCup;
	private PlayerList playerList;
	private GameBoard gameBoard;

	/*
	 * Constructor that initializes the above objects, and 
	 * starts the game loop.
	 */
	public GameController() {
		diceCup = new DiceCup(2, 6);

		gameBoard = new GameBoard();

		gameBoard.initFields();

		int playerAmount = GUIBoundary.decidePlayerAmount();

		// Position used to be 0, changed it to 1 for debugging purposes.
		playerList = new PlayerList(playerAmount, 10000000, 0, 15000, 1, gameBoard.getRandomUniqueCars());
		playerList.setHomeCars();

		GUIBoundary.print(TextBoundary.playerAmountMessage(playerAmount));

		initGameLoop();
	}

	/*
	 * The actual game loop of the system. Will run each player through a turn
	 * until there is only one player left, who then is the winner.
	 */
	private void initGameLoop() {
		int index = 0;

		while (playerList.getPlayersLeft() > 1) {
			while (playerList.getPlayer(index) == null)
				index = calculateIndex(index);

			Player currentPlayer = playerList.getPlayer(index);

			GUIBoundary.print(TextBoundary.rollInfoMessage(currentPlayer));

			int[] rollList = diceCup.rollDice(currentPlayer);
			int rollTotal = diceCup.getTotalRoll(rollList);

			currentPlayer.setLatestRoll(rollTotal);
			GUIBoundary.print(TextBoundary.rollMessage(currentPlayer, rollList));

			GUIBoundary.removePlayerCar(currentPlayer);
			gameBoard.movePlayer(currentPlayer, rollTotal);
			GUIBoundary.placePlayerCar(currentPlayer);

			gameBoard.landOnField(currentPlayer);
			GUIBoundary.updatePlayer(currentPlayer);

			if (currentPlayer.isBankrupt()) {
				GUIBoundary.print(TextBoundary.removePlayerMessage(currentPlayer));
				GUIBoundary.removePlayerCar(currentPlayer);
				playerList.removePlayer(currentPlayer);
			}
			index = calculateIndex(index);
		}

		GUIBoundary.print(TextBoundary.winnerMessage(playerList.getLastPlayer()));

		System.exit(0);
	}

	/*
	 * Calculate the Player index, so that it is always in the array limit.
	 */
	private int calculateIndex(int index) {
		if (index == (playerList.getTotalPlayers() - 1)) {
			return index = 0;
		}
		return index + 1;
	}

}