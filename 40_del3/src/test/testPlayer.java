package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.Player;

public class testPlayer {

	private Player player;

	@Before
	public void setUp() throws Exception {
		player = new Player("Player T", 100000, 0, 30000, 0);
	}

	@After
	public void tearDown() throws Exception {
		player = null;
	}

	/*
	 * Tests whether the initial position from the Player constructor
	 * is working correctly. This is a positive test, since we expect
	 * this to work without any errors.
	 */
	@Test
	public void testPlayerPosition0() {
		int actual = player.getPosition();

		/* 0 since the initial position of the Player is 0. */
		int expected = 0;

		assertEquals("The Players position is not correct.", expected, actual);
	}

	/*
	 * Tests whether the setPosition() method works with positive variable 10.
	 * This is considered a positive test, since this is expected to work without
	 * any errors.
	 */
	@Test
	public void testPlayerPosition10() {
		int position = 10;

		player.setPosition(position);

		int actual = player.getPosition();

		int expected = position;

		assertEquals("The Players position is not correct.", expected, actual);
	}

	/*
	 * Tests whether the setPosition() method works with positive variable 1.
	 * This is considered a positive test, since this is expected to work without
	 * any errors.
	 */
	@Test
	public void testPlayerPosition1() {
		int position = 1;

		player.setPosition(position);

		int actual = player.getPosition();

		int expected = position;

		assertEquals("The Players position is not correct.", expected, actual);
	}

	/*
	 * Tests whether the setPosition() method works with negative variable -10.
	 * Since there are not any negative positions in the system where the Player object
	 * is used, the position should not have a negative position.
	 * 
	 * This is considered a negative test, since this is not expected to work without.
	 */
	@Test
	public void testPlayerPositionNeg10() {
		int position = -10;

		player.setPosition(position);

		int actual = player.getPosition();

		int expected = 0;

		assertEquals("The Players position is not correct.", expected, actual);
	}

	/*
	 * Tests whether the Players initial BankAccount balance 
	 * is assigned correctly. This is a positive test, since
	 * this is expected to work without any problems.
	 * 
	 * ATT: The getBalance() method is thoroughly tested in the
	 * testBankAccount JUnit test case. Therefore it is not tested
	 * more here.
	 */
	@Test
	public void testgetBalance30000() {
		int actual = player.getBalance();

		int expected = 30000;

		assertEquals("The Players balance is not correct.", expected, actual);
	}

	/*
	 * Tests whether the Players addBalance methods works.
	 * This is a positive test, since this is expected to 
	 * work without any problems.
	 * 
	 * ATT: The addBalance() method is thoroughly tested in the
	 * testBankAccount JUnit test case. Therefore it is not tested
	 * more here.
	 */
	@Test
	public void testAddBalance100() {
		player.addBalance(100);

		int actual = player.getBalance();

		int expected = 30100;

		assertEquals("The Players balance is not correct.", expected, actual);
	}

	/*
	 * Tests whether the Players removeBalance methods works.
	 * This is a positive test, since this is expected to 
	 * work without any problems.
	 * 
	 * ATT: The removeBalance() method is thoroughly tested in the
	 * testBankAccount JUnit test case. Therefore it is not tested
	 * more here.
	 */
	@Test
	public void testRemoveBalance1000() {
		player.removeBalance(1000);

		int actual = player.getBalance();

		int expected = 29000;

		assertEquals("The Players balance is not correct.", expected, actual);
	}

	/*
	 * Tests whether the Players isBankrupt methods works.
	 * This is a positive test, since this is expected to 
	 * work without any problems.
	 * 
	 * ATT: The isBankrupt() method is thoroughly tested in the
	 * testBankAccount JUnit test case. Therefore it is not tested
	 * more here.
	 */
	@Test
	public void testIsBankrupt() {
		boolean actual = player.isBankrupt();
		boolean expected = false;

		assertEquals("The Player is bankrupt when it should not be.", expected, actual);
	}

	/*
	 * Tests whether the setLatestRoll() and getLatestRoll() methods
	 * are working as intended with a positive value of 10.
	 */
	@Test
	public void testsetLatestRoll10() {
		int latestRoll = 10;
		player.setLatestRoll(latestRoll);

		int expected = latestRoll;
		int actual = player.getLatestRoll();

		assertEquals("The Player is not assigned the correct LastestRoll value.", expected, actual);
	}

	/*
	 * Tests whether the setLatestRoll() and getLatestRoll() methods
	 * are working as intended with a negative value of -1.
	 */
	@Test
	public void testsetLatestRollNeg1() {
		int latestRoll = -1;
		player.setLatestRoll(latestRoll);

		int expected = latestRoll;
		int actual = player.getLatestRoll();

		assertEquals("The Player is not assigned the correct LastestRoll value.", expected, actual);
	}

	/*
	 * Tests whether the setLatestRoll() and getLatestRoll() methods
	 * are working as intended with a neutral value of 0.
	 */
	@Test
	public void testsetLatestRoll0() {
		int latestRoll = 0;
		player.setLatestRoll(latestRoll);

		int expected = latestRoll;
		int actual = player.getLatestRoll();

		assertEquals("The Player is not assigned the correct LastestRoll value.", expected, actual);
	}

	/*
	 * Tests whether the setLatestRoll() and getLatestRoll() methods
	 * are working as intended with a positive value of 1000.
	 */
	@Test
	public void testsetLatestRoll1000() {
		int latestRoll = 1000;
		player.setLatestRoll(latestRoll);

		int expected = latestRoll;
		int actual = player.getLatestRoll();

		assertEquals("The Player is not assigned the correct LastestRoll value.", expected, actual);
	}

}