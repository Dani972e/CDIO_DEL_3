package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.GameBoard;
import spil.entity.Player;
import spil.entity.PlayerList;

public class testPlayerList {

	private final int MAX_BALANCE = 100000;
	private final int MIN_BALANCE = 0;

	private PlayerList playerList;
	private GameBoard gameBoard;

	@Before
	public void setUp() throws Exception {
		gameBoard = new GameBoard();
		playerList = new PlayerList(6, MAX_BALANCE, MIN_BALANCE, 30000, 0, gameBoard.getRandomUniqueCars());
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testPlayerList() {
		/*
		 * Tests if the playerList instantiates the correct
		 * amount of Player objects.
		 */
		int expected = 6;
		int actual = playerList.getTotalPlayers();
		assertEquals("PlayerList did not create the expected amount of players.", expected, actual);

		/*
		 * Tests if the removePlayer() method removes the correct
		 * amount of Players.
		 */
		for (int i = 5; i > 0; --i) {
			playerList.removePlayer(playerList.getPlayer(i));
			expected = i;
			actual = playerList.getPlayersLeft();
			assertEquals(expected, actual);
		}

		/*
		 * Tests whether the last Player actually exists.
		 */
		Player expected2 = playerList.getPlayer(0);
		Player actual2 = playerList.getLastPlayer();
		assertEquals(expected2, actual2);
	}

}