package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.BankAccount;

public class testBankAccount {
	private BankAccount b1;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		b1 = null;
	}

	@Test
	public void testUpperBound100000() {
		b1 = new BankAccount(100000, 0, 500000);
		int expected = 100000;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	@Test
	public void testLowerBound0() {
		b1 = new BankAccount(100000, 0, -500000);
		int expected = 0;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);
	}

	@Test
	public void testLowerBoundNeg500() {
		b1 = new BankAccount(100000, -500, -500000);
		int expected = -500;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testUnderflow() {
		b1 = new BankAccount(100000, 0, Integer.MIN_VALUE - 1);
		int expected = 0;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testOverflow() {
		b1 = new BankAccount(100000, 0, Integer.MAX_VALUE + 1);
		int expected = 100000;
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testAddBalance100() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = 100;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testAddBalance0() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = 0;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testAddBalanceNeg500() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = -500;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testAddBalanceMaxInt() {
		b1 = new BankAccount(100000, 0, 0);
		int add = Integer.MAX_VALUE;
		int expected = 100000;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testAddBalanceMinInt() {
		b1 = new BankAccount(100000, 0, 0);
		int add = Integer.MIN_VALUE;
		int expected = 0;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testAddBalance1() {
		b1 = new BankAccount(100000, 0, 30000);
		int add = 1;
		int expected = b1.getBalance() + add;
		b1.addBalance(add);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testRemoveBalance1() {
		b1 = new BankAccount(100000, 0, 30000);
		int remove = 1;
		int expected = b1.getBalance() - remove;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testRemoveBalance30000() {
		b1 = new BankAccount(100000, 0, 30000);
		int remove = 30000;
		int expected = b1.getBalance() - remove;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testRemoveBalance0() {
		b1 = new BankAccount(100000, 0, 30000);
		int remove = 0;
		int expected = b1.getBalance() - remove;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testRemoveBalanceMinInt() {
		b1 = new BankAccount(100000, 0, 0);
		int remove = Integer.MIN_VALUE;
		int expected = 0;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testRemoveBalanceMaxInt() {
		b1 = new BankAccount(100000, 0, 0);
		int remove = Integer.MAX_VALUE;
		int expected = 0;
		b1.removeBalance(remove);
		int actual = b1.getBalance();

		assertEquals("BankAccount balance is not correct", expected, actual);

	}

	@Test
	public void testIsBankrupt0() {
		b1 = new BankAccount(100000, 0, 5000);
		b1.removeBalance(6000);
		boolean actual = b1.isBankrupt();
		boolean expected = true;

		assertEquals("BankAccount is not bankrupt when it should be", expected, actual);

	}

	@Test
	public void testIsBankrupt1() {
		b1 = new BankAccount(100000, 0, 5000);
		b1.removeBalance(4999);
		boolean actual = b1.isBankrupt();
		boolean expected = false;

		assertEquals("BankAccount is not bankrupt when it should be", expected, actual);

	}
}
