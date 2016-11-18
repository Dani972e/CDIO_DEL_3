package spil.entity;

import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;

public class PlayerList {

	private final int MAX_PLAYER_COUNT = 6;
	private final int MIN_PLAYER_COUNT = 2;

	private Player[] playerList;

	public PlayerList(int playerCount, int maxCoinAmount, int minCoinAmount, int coins, int position) {

		if (playerCount > MAX_PLAYER_COUNT) {
			playerCount = MAX_PLAYER_COUNT;
		} else if (playerCount < MIN_PLAYER_COUNT) {
			playerCount = MIN_PLAYER_COUNT;
		}

		playerList = new Player[playerCount];

		for (int i = 0; i < playerCount; i++) {
			playerList[i] = new Player(TextBoundary.playerName + " " + (i + 1), maxCoinAmount, minCoinAmount, coins,
					position);
			GUIBoundary.addPlayer(playerList[i]);
		}
	}

	public void movePlayer(int playerIndex, int amount) {
		int newPosition = playerList[playerIndex].getPosition() + amount;
		int numberOfFields = FieldBoundary.FIELD_COUNT;

		while (newPosition > numberOfFields) {
			newPosition -= numberOfFields;
		}

		// Spaghetti/ghetto solution?
		GUIBoundary.removePlayerCar(playerList[playerIndex]);
		playerList[playerIndex].setPosition(newPosition);
		GUIBoundary.placePlayerCar(playerList[playerIndex]);
	}

	// Spaghetti/ghetto solution?
	public void setHomeCars() {
		System.out.println(playerList.length);
		for (Player player : playerList) {
			player.setPosition(1);
			GUIBoundary.placePlayerCar(player);
			player.setPosition(0);
		}
	}

	public Player getPlayer(int index) {
		return playerList[index];
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