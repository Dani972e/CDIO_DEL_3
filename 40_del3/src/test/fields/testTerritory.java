package test.fields;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import spil.entity.DiceCup;
import spil.entity.Player;
import spil.entity.field.Territory;

public class testTerritory {

	private Player player1;
	private Player player2;
	private Player playerNullTest;
	private DiceCup diceCup;
	private Territory territoryP1000R100;
	private Territory territoryP4000R1000;
	private Territory territoryP6000R3200;
	private Territory territoryP5500R2600;

	@Before
	public void setUp() throws Exception {
		playerNullTest = new Player("Player 1", 1000000, 0, 30000, 0);
		diceCup = new DiceCup(2, 6);
		// Player position 2
		territoryP1000R100 = new Territory(1000, 100);
		// Player position 6
		territoryP4000R1000 = new Territory(4000, 1000);
		// Player position 9
		territoryP6000R3200 = new Territory(6000, 3200);
		// Player position 8
		territoryP5500R2600 = new Territory(5500, 2600);
	}

	@After
	public void tearDown() throws Exception {
		player1 = null;
		player2 = null;
		diceCup = null;
	}

	/*
	 * Tests whether all the needed objects are null or not.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testEntities() {
		Assert.assertNotNull(playerNullTest);
		Assert.assertNotNull(this.diceCup);
		Assert.assertNotNull(this.territoryP1000R100);
		Assert.assertNotNull(this.territoryP4000R1000);
		Assert.assertNotNull(this.territoryP6000R3200);
		Assert.assertNotNull(this.territoryP5500R2600);
	}

	/*
	 * Tests whether the landOnField() methods works on a specific Territory field,
	 * with the price of 1000 and rent of 100. It is needed that Player 1 purchases
	 * the first field, so that when Player 2 lands on the field, he will pay the 
	 * rent to Player 1.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldP1000R100() {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);

		final int price = 1000;
		final int rent = 100;
		final int position = 2;

		player1.setPosition(position);

		int expected = player1.getBalance() - price;

		/* Player 1 lands and purchases the field for 1000. */
		territoryP1000R100.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);

		player2.setPosition(position);

		expected = player2.getBalance() - rent;

		/* Player 2 lands and pays rent of 100. */
		territoryP1000R100.landOnField(player2);

		actual = player2.getBalance();

		assertEquals("Player 2 BankAccount balance is not correct. landOnField() alreadyPurchased scenario must be manipulating it wrong.", expected,
				actual);
	}

	/*
	 * Tests whether the landOnField() methods works on a specific Territory field,
	 * with the price of 4000 and rent of 1000. It is needed that Player 1 purchases
	 * the first field, so that when Player 2 lands on the field, he will pay the 
	 * rent to Player 1.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldP4000R1000() {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);

		final int price = 4000;
		final int rent = 1000;
		final int position = 6;

		player1.setPosition(position);

		int expected = player1.getBalance() - price;

		/* Player 1 lands and purchases the field for 4000. */
		territoryP4000R1000.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);

		player2.setPosition(position);

		expected = player2.getBalance() - rent;

		/* Player 2 lands and pays rent of 1000. */
		territoryP4000R1000.landOnField(player2);

		actual = player2.getBalance();

		assertEquals("Player 2 BankAccount balance is not correct. landOnField() alreadyPurchased scenario must be manipulating it wrong.", expected,
				actual);
	}

	/*
	 * Tests whether the landOnField() methods works on a specific Territory field,
	 * with the price of 6000 and rent of 3200. It is needed that Player 1 purchases
	 * the first field, so that when Player 2 lands on the field, he will pay the 
	 * rent to Player 1.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldP6000R3200() {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);

		final int price = 6000;
		final int rent = 3200;
		final int position = 9;

		player1.setPosition(position);

		int expected = player1.getBalance() - price;

		/* Player 1 lands and purchases the field for 6000. */
		territoryP6000R3200.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);

		player2.setPosition(position);

		expected = player2.getBalance() - rent;

		/* Player 2 lands and pays rent of 3200. */
		territoryP6000R3200.landOnField(player2);

		actual = player2.getBalance();

		assertEquals("Player 2 BankAccount balance is not correct. landOnField() alreadyPurchased scenario must be manipulating it wrong.", expected,
				actual);
	}

	/*
	 * Tests whether the landOnField() methods works on a specific Territory field,
	 * with the price of 5500 and rent of 2600. It is needed that Player 1 purchases
	 * the first field, so that when Player 2 lands on the field, he will pay the 
	 * rent to Player 1.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldP5500R2600() {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);

		final int price = 5500;
		final int rent = 2600;
		final int position = 8;

		player1.setPosition(position);

		int expected = player1.getBalance() - price;

		/* Player 1 lands and purchases the field for 6000. */
		territoryP5500R2600.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);

		player2.setPosition(position);

		expected = player2.getBalance() - rent;

		/* Player 2 lands and pays rent of 3200. */
		territoryP5500R2600.landOnField(player2);

		actual = player2.getBalance();

		assertEquals("Player 2 BankAccount balance is not correct. landOnField() alreadyPurchased scenario must be manipulating it wrong.", expected,
				actual);
	}

	/*
	 * Tests whether the Player can purchase a field when the player does not
	 * have enough balance to do so.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldInsufficientBalance() {
		player1 = new Player("Player 1", 1000000, 0, 0, 0);

		final int position = 6;

		player1.setPosition(position);

		/* Nothing is removed, since the player does not purchase the field. */
		int expected = player1.getBalance();

		/* Player 1 lands and purchases the field for 4000. */
		territoryP4000R1000.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);
	}

	/*
	 * Tests if the same Player can land on the same field twice in a row 
	 * with any errors.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldTwiceSamePlayer() {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);

		final int price = 4000;
		final int position = 6;

		player1.setPosition(position);

		int expected = player1.getBalance() - price;

		/* Player 1 lands and purchases the field for 4000. */
		territoryP4000R1000.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);

		/* Player 1 lands on the Field again */
		territoryP4000R1000.landOnField(player1);
	}

	/*
	 * Tests if the same Player can land on the same field twice in a row 
	 * with any errors.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldThriceSamePlayer() {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);

		final int price = 4000;
		final int position = 6;

		player1.setPosition(position);

		int expected = player1.getBalance() - price;

		/* Player 1 lands and purchases the field for 4000. */
		territoryP4000R1000.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);

		/* Player 1 lands on the Field again */
		territoryP4000R1000.landOnField(player1);

		/* Player 1 lands on the Field AGAIN! */
		territoryP4000R1000.landOnField(player1);
	}

	/*
	 * Tests if the same Player can land on the same field three times in a row 
	 * with any errors.
	 * 
	 * This is a positive test, since the landOnField() method should be able
	 * to handle this scenario without any errors.
	 */
	@Test
	public void testLandOnFieldTwiceDifferentPlayer() {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);

		final int price = 4000;
		final int position = 6;

		player1.setPosition(position);
		player2.setPosition(position);

		int expected = player1.getBalance() - price;

		/* Player 1 lands and purchases the field for 4000. */
		territoryP4000R1000.landOnField(player1);

		int actual = player1.getBalance();

		assertEquals("Player 1 BankAccount balance is not correct. landOnField() purchase scenario must be manipulating it wrong.", expected, actual);

		/* Player 2 lands on the Field */
		territoryP4000R1000.landOnField(player2);

		/* Player 2 lands on the Field again */
		territoryP4000R1000.landOnField(player2);
	}

}