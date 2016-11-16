package spil.entity.field;

import spil.entity.Player;

public final class Territory extends Ownable {

	/* Rent for the Territory field */
	private int rent;

	/* Rent constructor with field price and field rent */
	public Territory(int price, int rent) {
		super(price);
		this.rent = rent;
	}

	@Override
	public void landOnField(Player player) {
		super.purchaseField(player, price, rent);
	}

	@Override
	public int getRent() {
		return rent;
	}

}