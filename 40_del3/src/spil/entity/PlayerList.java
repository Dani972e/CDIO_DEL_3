package spil.entity;

public class PlayerList {

	private final int MAX_PLAYER_COUNT = 10;
	private final int MIN_PLAYER_COUNT = 2;

	private Player[] playerList;

	public PlayerList(int playerCount) {
		playerList = new Player[playerCount];

		if (playerCount > MAX_PLAYER_COUNT) {
			playerCount = MAX_PLAYER_COUNT;
		} else if (playerCount < MIN_PLAYER_COUNT) {
			playerCount = MIN_PLAYER_COUNT;
		}

		for (int i = 0; i < playerCount; i++)
			playerList[i] = new Player(Integer.toString(i), 0, 0, 0);
	}

}