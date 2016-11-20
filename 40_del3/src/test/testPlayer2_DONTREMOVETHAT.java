package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.GameBoard;
import spil.entity.Player;
import spil.entity.PlayerList;

public class testPlayer2_DONTREMOVETHAT {

	private Player playerTest;
	private GameBoard gameBoard;
	private PlayerList playerList;

	private final int MAX_BALANCE = 10000;
	private final int MIN_BALANCE = 0;

	@Before
	public void setUp() throws Exception {
		gameBoard = new GameBoard();
		playerList = new PlayerList(6, 10000000, 0, 30000, 1, gameBoard.getRandomUniqueCars());
		playerTest = new Player("Player Test", MAX_BALANCE, MIN_BALANCE, 1000, 0);
	}

	@After
	public void tearDown() throws Exception {
		gameBoard = null;
		playerList = null;
		playerTest = null;
	}

	@Test // Negative Test
	public void testBalanceOverflow() {

		int expected = MAX_BALANCE;

		playerTest.removeBalance(playerTest.getBalance());
		playerTest.addBalance(Integer.MAX_VALUE);
		playerTest.addBalance(1);

		int actual = playerTest.getBalance();
		assertEquals(expected, actual);
	}

	@Test // Negative Test
	public void testBalanceUnderflow() {
		int expected = MIN_BALANCE;

		playerTest.removeBalance(playerTest.getBalance());
		playerTest.addBalance(Integer.MIN_VALUE);
		playerTest.removeBalance(1);

		int actual = playerTest.getBalance();
		assertEquals(expected, actual);
	}

	@Test
	public void testPlayerList() {
		int expected = 6;
		int actual = playerList.getTotalPlayers();
		assertEquals(expected, actual);

		for (int i = 5; i > 0; --i) {
			playerList.removePlayer(playerList.getPlayer(i));
			expected = i;
			actual = playerList.getPlayersLeft();
			assertEquals(expected, actual);
		}

		Player expected2 = playerList.getPlayer(0);
		Player actual2 = playerList.getLastPlayer();
		assertEquals(expected2, actual2);
	}

	@Test // Positive Test
	public void testBalance() {
		int expected = 1500;
		playerTest.addBalance(500);
		int actual = playerTest.getBalance();
		assertEquals(expected, actual);

		expected = 500;
		playerTest.removeBalance(1000);
		actual = playerTest.getBalance();
		assertEquals(expected, actual);
	}

}
