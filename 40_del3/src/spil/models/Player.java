package spil.models;

/**
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 * @author Peter El-Habr (s165202)
 * @author Loui Southwick (s161788)
 * @version 1.2
 */

public final class Player {

	private String name;
	private final BankAccount acc;

	public Player(String name, int maxCoinAmount, int minCoinAmount, int coins) {
		this.name = name;
		acc = new BankAccount(maxCoinAmount, minCoinAmount, coins);
	}

	public void addCoins(int amount) {
		acc.addCoins(amount);
	}

	public String getName() {
		return name;
	}

	public int getCoins() {
		return acc.getCoins();
	}

}