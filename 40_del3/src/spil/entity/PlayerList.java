package spil.entity;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;

public class PlayerList {

	private final int MAX_PLAYER_COUNT = 6;
	private final int MIN_PLAYER_COUNT = 2;

	private Player[] playerList;

	public PlayerList(int playerCount, int maxCoinAmount, int minCoinAmount, int coins) {
		playerList = new Player[playerCount];

		if (playerCount > MAX_PLAYER_COUNT) {
			playerCount = MAX_PLAYER_COUNT;
		} else if (playerCount < MIN_PLAYER_COUNT) {
			playerCount = MIN_PLAYER_COUNT;
		}

		for (int i = 0; i < playerCount; i++) {
			playerList[i] = new Player(TextBoundary.playerName + " " + (i + 1), maxCoinAmount, minCoinAmount, coins);
			GUIBoundary.addPlayer(playerList[i]);
		}
	}

	public void movePlayer(int playerIndex, int amount) {
		int newPosition = playerList[playerIndex].getPosition() + amount;
		int numberOfField = 21; // TODO ROBUST

		while (newPosition > numberOfField) {
			newPosition -= numberOfField;
		}

		playerList[playerIndex].setPosition(newPosition);
		GUIBoundary.placePlayer(playerList[playerIndex]);
	}

	public Player getPlayer(int index) {
		return playerList[index];
	}

	public int getPosition(int index) {
		return playerList[index].getPosition();
	}

	public int getTotalPlayers() {
		return playerList.length;
	}

	public int getPlayersLeft() {
		int left = 0;
		for (Player player : playerList) {
			if (!player.isBankrupt())
				left++;
		}
		return left;
	}

}