package spil.entity.field;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

public final class Territory extends Ownable {

	private int rent;

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