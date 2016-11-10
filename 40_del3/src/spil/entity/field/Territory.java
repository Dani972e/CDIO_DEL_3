package spil.entity.field;

import spil.entity.Player;

public final class Territory extends Ownable {

	private int rent;

	public Territory(int price, int rent) {
		super(price);
		this.rent = rent;
	}

	@Override
	public void landOnField(Player player) {

	}

	@Override
	public int getRent() {
		return rent;
	}

}