package spil.entity;

public class BankAccount {

	private final int MAX_COIN_AMOUNT;
	private final int MIN_COIN_AMOUNT;
	private int coins;

	public BankAccount(int maxCoinAmount, int minCoinAmount, int coins) {
		this.MAX_COIN_AMOUNT = maxCoinAmount;
		this.MIN_COIN_AMOUNT = minCoinAmount;
		this.coins = coins;
	}

	public void addBalance(int amount) {
		int newBalance = coins + amount;

		if (newBalance < MIN_COIN_AMOUNT) {
			newBalance = MIN_COIN_AMOUNT;
		} else if (newBalance > MAX_COIN_AMOUNT) {
			newBalance = MAX_COIN_AMOUNT;
		}
		coins = newBalance;
	}

	public int getBalance() {
		return coins;
	}
	
	public boolean isBankrupt() {
		if (coins == MIN_COIN_AMOUNT) {
			return true;
		}
		return false;
	}

}