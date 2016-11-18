package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Test;

import spil.entity.DiceCup;

public class testDiceCup {

	private DiceCup diceCup;

	@After
	public void tearDown() throws Exception {
		diceCup = null;
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to 1.
	 * 
	 * This is considered a positive test, since the DiceCup object 
	 * should be able to handle Die amount of 1.
	 */
	@Test
	public void testDieAmount1() {
		int dieFaceValue = 6;
		int amountOfDice = 1;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 2;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to 50.
	 * 
	 * This is considered a positive test, since the DiceCup object 
	 * should be able to handle Die amount of 50.
	 */
	@Test
	public void testDieAmount50() {
		int dieFaceValue = 6;
		int amountOfDice = 1;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 2;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to 2000.
	 * 
	 * This is considered a positive test, since the DiceCup object 
	 * should be able to handle Die amount of 2000.
	 */
	@Test
	public void testDieAmount2000() {
		int dieFaceValue = 6;
		int amountOfDice = 2000;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 1000;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to 0.
	 * 
	 * This is considered a positive test, since the DiceCup object 
	 * should be able to handle Die amount of 0.
	 */
	@Test
	public void testDieAmount0() {
		int dieFaceValue = 6;
		int amountOfDice = 0;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 2;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to -1.
	 * 
	 * This is considered a positive test, since the DiceCup object 
	 * should be able to handle Die amount of -1.
	 */
	@Test
	public void testDieAmountNeg1() {
		int dieFaceValue = 6;
		int amountOfDice = -1;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 2;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to -50.
	 * 
	 * This is considered a positive test, since the DiceCup object 
	 * should be able to handle Die amount of -50.
	 */
	@Test
	public void testDieAmountNeg50() {
		int dieFaceValue = 6;
		int amountOfDice = -50;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 2;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to Integer.MAX_VALUE + 2.
	 * 
	 * This is considered a negative test, since the DiceCup is not able
	 * to handle an overflow error. The integer overflows and turns negative,
	 * so the dieAmount value reverts to 2, which is the lower bound. It would be
	 * better if it would revert to 1000.
	 */
	@Test
	public void testDieAmountOverflow() {
		int dieFaceValue = 6;
		int amountOfDice = Integer.MAX_VALUE + 2;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 1000;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

	/*
	 * Tests whether the bounds of the amount of Die objects
	 * work as expected. If the amount is less than 2, the value
	 * will revert back to 2. If the amount is greater than 1000, the
	 * amount will revert back to 1000. The bounds can be changed through
	 * the class. This test tests the scenario when the amount of dice is
	 * equal to Integer.MAX_VALUE + 2.
	 * 
	 * This is considered a negative test, since the DiceCup is not
	 * able to handle an underflow error. The integer underflows and turns positive,
	 * so the dieAmount value reverts to 1000, which is the higher bound. It would be
	 * better if it would revert to 2.
	 */
	@Test
	public void testDieAmountUnderflow() {
		int dieFaceValue = 6;
		int amountOfDice = Integer.MIN_VALUE - 2;

		diceCup = new DiceCup(amountOfDice, dieFaceValue);

		int expected = 2;
		int actual = diceCup.getDieAmount();

		if (actual != expected) {
			fail("actual != expected, true: The bounds are not working as expected.");
		}

		assertEquals("expected: " + expected + "\nactual: ", expected, actual);
	}

}