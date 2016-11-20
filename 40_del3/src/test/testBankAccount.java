package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import spil.entity.BankAccount;

public class testBankAccount {

	private BankAccount b1;

	@After
	public void tearDown() throws Exception {
		b1 = null;
	}

	/*
	 * Testing whether the upper bound for BankAccount is working. 
	 * This is a positive test. 
	 */
	@Test
	public void testUpperBound100000() {
		b1 = new BankAccount(100000, 0, 500000);
		int expected = 100000;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing whether the lower bound for BankAccount is working.
	 * This is a positive test.
	 */
	@Test
	public void testLowerBound0() {
		b1 = new BankAccount(100000, 0, -500000);
		int expected = 0;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing whether the lower bound for BankAccount is working with a negative value. 
	 * This is a negative test.
	 */
	@Test
	public void testLowerBoundNeg500() {
		b1 = new BankAccount(100000, -500, -500000);
		int expected = -500;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing whether the BankAccount can handle an underflow error.
	 * This is a negative test.
	 */
	@Test
	public void testUnderflow() {
		b1 = new BankAccount(100000, 0, Integer.MIN_VALUE - 1);
		int expected = 0;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing whether the BankAccount can handle an overflow error.
	 * This is a positive test.
	 */
	@Test
	public void testOverflow() {
		b1 = new BankAccount(100000, 0, Integer.MAX_VALUE + 1);
		int expected = 100000;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	/*
	 * Testing if the BankAccount can add 100 coins to it's balance. 
	 * This is a positive test.
	 */
	@Test
	public void testAddBalance100() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = 100;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing if the BankAccount can add 0 coins to it's balance.
	 * This is a positive test.
	 */
	@Test
	public void testAddBalance0() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = 0;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing if the BankAccount can add -500 coins to it's balance.
	 * This is a negative test. 
	 */
	@Test
	public void testAddBalanceNeg500() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = -500;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing if the BankAccount can add Integer.MAX_VALUE coins to it's balance.
	 * This is a negative test.
	 */
	@Test
	public void testAddBalanceMaxInt() {
		b1 = new BankAccount(100000, 0, 0);
		int add = Integer.MAX_VALUE;
		int expected = 100000;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing if the BankAccount can add Integer.MIN_VALUE coins to it's balance.
	 * This is a negative test.
	 */
	@Test
	public void testAddBalanceMinInt() {
		b1 = new BankAccount(100000, 0, 0);
		int add = Integer.MIN_VALUE;
		int expected = 0;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing if the BankAccount can add 1 coins to it's balance.
	 * This is a positive test.
	 */
	@Test
	public void testAddBalance1() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = 1;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing if the BankAccount can remove 1 coins from the balance.
	 * This is a positive test.
	 */
	@Test
	public void testRemoveBalance1() {
		b1 = new BankAccount(100000, 0, 30000);
		int remove = 1;
		int expected = b1.getBalance() - remove;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 *  Testing if the BankAccount can remove 30000 coins from the balance.
	 *  This is a positive test. 
	 */
	@Test
	public void testRemoveBalance30000() {
		b1 = new BankAccount(100000, 0, 30000);
		int remove = 30000;
		int expected = b1.getBalance() - remove;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 *  Testing if the BankAccount can remove 0 coins from the balance.
	 *  This is a positive test.
	 */
	@Test
	public void testRemoveBalance0() {
		b1 = new BankAccount(100000, 0, 30000);
		int remove = 0;
		int expected = b1.getBalance() - remove;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 *  Testing if the BankAccount can remove Integer.MIN_VALUE coins from the balance.
	 *  This is a negative test. 
	 */
	@Test
	public void testRemoveBalanceMinInt() {
		b1 = new BankAccount(100000, 0, 0);
		int remove = Integer.MIN_VALUE;
		int expected = 0;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 *  Testing if the BankAccount can remove Integer.MAX_VALUE coins from the balance.
	 *  This is a negative test. 
	 */
	@Test
	public void testRemoveBalanceMaxInt() {
		b1 = new BankAccount(100000, 0, 0);
		int remove = Integer.MAX_VALUE;
		int expected = 0;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	/*
	 * Testing if the player gets bankrupt.
	 * This is a positive test.
	 */
	@Test
	public void testIsBankrupt0() {
		b1 = new BankAccount(100000, 0, 5000);
		b1.removeBalance(6000);
		boolean actual = b1.isBankrupt();
		boolean expected = true;

		assertEquals("BankAccount is not bankrupt when it should be", expected, actual);
	}

	/*
	 * Testing if the player is not bankrupt when the balance is 1. 
	 * This is a positive test. 
	 */
	@Test
	public void testIsBankrupt1() {
		b1 = new BankAccount(100000, 0, 5000);
		b1.removeBalance(4999);
		boolean actual = b1.isBankrupt();
		boolean expected = false;

		assertEquals("BankAccount is not bankrupt when it should be", expected, actual);
	}

}