package test.fields;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.Player;
import spil.entity.field.Refugee;

public class testRefugee {

	private Refugee refugeeB3000;
	private Refugee refugeeB1000;
	private Refugee refugeeNeg1000;
	private Refugee refugeeOverflow;
	private Refugee refugeeUnderflow;
	private Player p1;

	@Before
	public void setUp() throws Exception {
		refugeeB3000 = new Refugee(3000);
		refugeeB1000 = new Refugee(1000);
		refugeeNeg1000 = new Refugee(-1000);
		refugeeOverflow = new Refugee(Integer.MAX_VALUE + 1);
		refugeeUnderflow = new Refugee(Integer.MIN_VALUE - 1);

		p1 = new Player("p1", 100000, 0, 30000, 0);
	}

	@After
	public void tearDown() throws Exception {
		refugeeB3000 = null;
		refugeeB1000 = null;
		refugeeNeg1000 = null;
		refugeeOverflow = null;
		p1 = null;
	}

	/*
	 * Testing to see if Refugee can add a bonus of 3000 to the player.
	 * This is a positive test since the system should be able to add 3000 coins. 
	 */
	@Test
	public void refugeeB3000() {
		int bonus = 3000;
		int expected = p1.getBalance() + bonus;
		p1.setPosition(10);
		refugeeB3000.landOnField(p1);
		int actual = p1.getBalance();

		assertEquals("Player does not get af bonus of 3000 coins", expected, actual);
	}

	/*
	 * Testing to see if Refugee can add a bonus of 1000 to the player. 
	 * This is also a positive test because the system should be able to handle it.
	 */
	@Test
	public void refugeeB1000() {
		int bonus = 1000;
		int expected = p1.getBalance() + bonus;
		p1.setPosition(10);
		refugeeB1000.landOnField(p1);
		int actual = p1.getBalance();

		assertEquals("Player does not get af bonus of 1000 coins", expected, actual);
	}

	/*
	 * Testing for a negative balance to see if the Refugee landOnField method can add -1000 to the balance. 
	 * This is a negative test because the field Refugee should not be able to add a negative number to
	 * the score.
	 */
	@Test
	public void refugeeNeg1000() {
		int bonus = -1000;
		int expected = p1.getBalance() + bonus;
		p1.setPosition(10);
		refugeeNeg1000.landOnField(p1);
		int actual = p1.getBalance();

		assertEquals("Player does not get af bonus of -1000 coins", expected, actual);
	}

	/*
	 * Testing for overflow to see if the Refugee landOnField method can add an overflow balance to the player. 
	 * This is a negative test because we are adding the maximum value of an integer + 1. It will wrap  to negative
	 * numbers. 
	 */
	@Test
	public void refugeeOverflow() {
		int bonus = Integer.MAX_VALUE + 1;
		int expected = p1.getBalance() + bonus;
		p1.setPosition(10);
		refugeeOverflow.landOnField(p1);
		int actual = p1.getBalance();

		assertEquals("Player does not get af bonus of Interger.MAX_VALUE + 1 coins", expected, actual);
	}

	/*
	 * Testing for underflow  to see if the Refugee landOnField method can add an underflow balance to the player. 
	 * This is a negative test because we are adding the minimum value of an integer - 1. It will wrap to negative
	 * numbers. 
	 */
	@Test
	public void refugeeUnderflow() {
		int bonus = Integer.MIN_VALUE - 1;
		int expected = p1.getBalance() + bonus;
		p1.setPosition(10);
		refugeeUnderflow.landOnField(p1);
		int actual = p1.getBalance();

		assertEquals("Player does not get af bonus of Interger.MAX_VALUE - 1 coins", expected, actual);
	}

}