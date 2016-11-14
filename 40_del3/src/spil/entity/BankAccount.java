package spil.entity;

public class BankAccount {

	private final int MAX_BALANCE;
	private final int MIN_BALANCE;
	private int balance;

	public BankAccount(int maxBalance, int minBalance, int balance) {
		this.MAX_BALANCE = maxBalance;
		this.MIN_BALANCE = minBalance;
		this.balance = balance;
	}

	public void addBalance(int amount) {
		int newBalance = balance + amount;

		if (newBalance < MIN_BALANCE) {
			newBalance = MIN_BALANCE;
		} else if (newBalance > MAX_BALANCE) {
			newBalance = MAX_BALANCE;
		}
		balance = newBalance;
	}

	public int getBalance() {
		return balance;
	}

	public boolean isBankrupt() {
		if (balance == MIN_BALANCE) {
			return true;
		}
		return false;
	}

}