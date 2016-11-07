package spil.models;

/**
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 * @author Peter El-Habr (s165202)
 * @author Loui Southwick (s161788)
 * @version 1.2
 */

public final class BankAccount {

	private final int MAX_COIN_AMOUNT;
	private final int MIN_COIN_AMOUNT;
	private int coins;

	public BankAccount(int maxCoinAmount, int minCoinAmount, int coins) {
		this.MAX_COIN_AMOUNT = maxCoinAmount;
		this.MIN_COIN_AMOUNT = minCoinAmount;
		this.coins = coins;
	}

	public void addCoins(int amount) {
		coins += amount;
	}

	public int getCoins() {
		return coins;
	}

}