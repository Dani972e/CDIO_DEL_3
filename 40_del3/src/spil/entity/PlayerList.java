package spil.entity;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {

	private final int MAX_PLAYER_COUNT = 10;
	private final int MIN_PLAYER_COUNT = 2;

	private List<Player> playerList = new ArrayList<Player>();

	public PlayerList(int playerCount) {
		if (playerCount > MAX_PLAYER_COUNT)
			playerCount = MAX_PLAYER_COUNT;

		if (playerCount < MIN_PLAYER_COUNT)
			playerCount = MIN_PLAYER_COUNT;

		for (int i = 0; i < playerCount; i++) {
			// test
			playerList.add(new Player(Integer.toString(i), 0, 0, 0));
		}
	}

}