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

	public void addCoins(int amount) {
		int newBalance = coins + amount;

		if (MIN_COIN_AMOUNT <= newBalance && MAX_COIN_AMOUNT >= newBalance)
			coins = newBalance;
	}

	public int getCoins() {
		return coins;
	}

}