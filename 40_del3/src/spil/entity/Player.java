package spil.entity;

public class Player {

	private String name;
	private int position;
	private int currentRoll;

	private BankAccount acc;

	public Player(String name, int maxBalance, int minBalance, int balance, int position) {
		this.name = name;
		this.position = position;
		acc = new BankAccount(maxBalance, minBalance, balance);
	}

	public void addBalance(int amount) {
		acc.addBalance(amount);
	}

	public void removeBalance(int amount) {
		acc.removeBalance(amount);
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

	public int getCurrentRoll() {
		return currentRoll;
	}

	public void setCurrentRoll(int currentRoll) {
		this.currentRoll = currentRoll;
	}

}