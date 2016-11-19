package spil.entity;

public class Player {

	/*
	 * name variable holds the name of the player.
	 * position holds the current Field position of the player.
	 * latestRoll holds the latest roll value of the player.
	 */
	private String name;
	private int position;
	private int latestRoll;

	/*
	 * The Player classes personal
	 * BankAccount instance. Servers
	 * as a coin manager.
	 */
	private BankAccount acc;

	/*
	 * Constructor of the Player class. Assign values for the Players 
	 * own name, position and BankAccount characteristics.
	 */
	public Player(String name, int maxBalance, int minBalance, int balance, int position) {
		this.name = name;
		this.position = position;
		acc = new BankAccount(maxBalance, minBalance, balance);
	}

	/*
	 * Adds the specified balance to the
	 * Players bank account.
	 */
	public void addBalance(int amount) {
		acc.addBalance(amount);
	}

	/*
	 * Removes the specified balance in the
	 * Players bank account.
	 */
	public void removeBalance(int amount) {
		acc.removeBalance(amount);
	}

	/*
	 * Returns whether the Player is
	 * bankrupt or not.
	 */
	public boolean isBankrupt() {
		return acc.isBankrupt();
	}

	/*
	 * Returns the name of the Player.
	 */
	public String getName() {
		return name;
	}

	/*
	 * Returns the players current balance.
	 */
	public int getBalance() {
		return acc.getBalance();
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public int getLatestRoll() {
		return latestRoll;
	}

	public void setLatestRoll(int currentRoll) {
		this.latestRoll = currentRoll;
	}

}