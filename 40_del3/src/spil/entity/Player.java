package spil.entity;

public class Player {

	private String name;
	private int position;

	private BankAccount acc;

	public Player(String name, int maxCoinAmount, int minCoinAmount, int coins) {
		this.name = name;
		acc = new BankAccount(maxCoinAmount, minCoinAmount, coins);
		position = 0;
	}

	public void addBalance(int amount) {
		acc.addBalance(amount);
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return acc.getBalance();
	}

	public boolean isBankrupt() {
		return acc.isBankrupt();
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

}