package spil.entity;

public class BankAccount {

	/*
	 * Lower bound and higher bounds for the balance variable.
	 * Balance variable is the current balance of the BankAccount.
	 */
	private final int MAX_BALANCE;
	private final int MIN_BALANCE;
	private int balance;

	/*
	 * Constructor that sets all of the above values to the
	 * current instance of the BankAccount.
	 */
	public BankAccount(int maxBalance, int minBalance, int balance) {
		this.MAX_BALANCE = maxBalance;
		this.MIN_BALANCE = minBalance;
		this.balance = balance;
	}

	/*
	 * Method that adds a specific amount to the balance variable,
	 * IFF the lower bounds and higher bounds are met.
	 */
	public void addBalance(int amount) {
		int newBalance = balance + amount;

		if (newBalance < MIN_BALANCE) {
			newBalance = MIN_BALANCE;
		} else if (newBalance > MAX_BALANCE) {
			newBalance = MAX_BALANCE;
		}

		balance = newBalance;
	}

	/*
	 * Method that removes a specific amount from the balance variable,
	 * IFF the lower bounds and higher bounds are met.
	 */
	public void removeBalance(int amount) {
		int newBalance = balance - amount;

		if (newBalance < MIN_BALANCE) {
			newBalance = MIN_BALANCE;
		} else if (newBalance > MAX_BALANCE) {
			newBalance = MAX_BALANCE;
		}

		balance = newBalance;
	}

	/*
	 * Returns a boolean value about the state of the 
	 * account. If the balance is equal to the minimum, 
	 * then the the BankAccount is declared bankrupt.
	 */
	public boolean isBankrupt() {
		if (balance == MIN_BALANCE) {
			return true;
		}
		return false;
	}

	/*
	 * Returns the current value of the balance variable.
	 */
	public int getBalance() {
		return balance;
	}

}