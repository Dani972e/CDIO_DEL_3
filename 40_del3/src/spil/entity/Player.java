package spil.entity;

public final class Player {

	private String name;
	private final BankAccount acc;
	private int position;
	
	public Player(String name, int maxCoinAmount, int minCoinAmount, int coins) {
		this.name = name;
		acc = new BankAccount(maxCoinAmount, minCoinAmount, coins);
		position = 0;
	}
	
	public void setPosition(int position){
		this.position=position;
	}
	
	public int getPosition(){
		return position;
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