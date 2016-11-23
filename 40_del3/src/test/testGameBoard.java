package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.GameBoard;
import spil.entity.Player;
import spil.entity.PlayerList;

public class testGameBoard {

	private PlayerList playerList;
	private GameBoard gameBoard;

	@Before
	public void setUp() throws Exception {
		gameBoard = new GameBoard();
		playerList = new PlayerList(2, 100000, 0, 30000, 0, gameBoard.getRandomUniqueCars());
	}

	@After
	public void tearDown() throws Exception {
		gameBoard = null;
		playerList = null;
	}

	/*
	 * Tests whether the movePlayer() method is working correctly.
	 * Positive test, since the movePlayer method should be able to 
	 * handle a value of 10.
	 */
	@Test
	public void testMovePlayer10() {
		int moveAmount = 10;
		Player player = playerList.getPlayer(0);
		int expected = player.getPosition() + moveAmount;
		player.setPosition(0);
		gameBoard.movePlayer(player, moveAmount);
		int actual = player.getPosition();
		assertEquals("Player position is not correct.", expected, actual);
	}

	/*
	 * Tests whether the movePlayer() method is working correctly.
	 * Positive test, since the movePlayer method should be able to 
	 * handle a value of 25.
	 * 
	 * The expected value is 3, since there is 22 Fields in the GameBoard
	 * class, and the move variable will automatically wrap around the 
	 * value when it reaches over 22. So 22 + 3 = 25, therefore expected 3.
	 */
	@Test
	public void testMovePlayer25() {
		int moveAmount = 25;
		Player player = playerList.getPlayer(0);
		int expected = 3;
		player.setPosition(0);
		gameBoard.movePlayer(player, moveAmount);
		int actual = player.getPosition();
		assertEquals("Player position is not correct.", expected, actual);
	}

	/*
	 * Tests whether the movePlayer() method is working correctly.
	 * Positive test, since the movePlayer method should be able to 
	 * handle a negative value of -25.
	 * 
	 * This is a negative test, since the movePlayer method should
	 * not be able to handle negative positions. 
	 */
	@Test
	public void testMovePlayerNeg25() {
		int moveAmount = -25;
		Player player = playerList.getPlayer(0);
		int expected = 0;
		player.setPosition(0);
		gameBoard.movePlayer(player, moveAmount);
		int actual = player.getPosition();
		assertEquals("Player position is not correct.", expected, actual);
	}

	/*
	 * Tests whether the movePlayer() method is working correctly.
	 * negative test, since the movePlayer method should not be able to 
	 * handle a value of -50.
	 * 
	 * This is a negative test, since the movePlayer method should
	 * not be able to handle negative positions. 
	 */
	@Test
	public void testMovePlayerNeg50() {
		int moveAmount = -50;
		Player player = playerList.getPlayer(0);
		int expected = 0;
		player.setPosition(0);
		gameBoard.movePlayer(player, moveAmount);
		int actual = player.getPosition();
		assertEquals("Player position is not correct.", expected, actual);
	}

}