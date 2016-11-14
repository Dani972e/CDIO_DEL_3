package spil.entity.field;

import spil.boundary.GUIBoundary;
import spil.entity.Player;

public final class Territory extends Ownable {

	private int rent;

	public Territory(int price, int rent) {
		super(price);
		this.rent = rent;
	}

	@Override
	public void landOnField(Player player) {
		if (owner == null) {
			if (GUIBoundary.purchaseField()) {
				owner = player;
				owner.addBalance(-price);
			}
		} else {
			GUIBoundary.alreadyPurchased(owner);
			player.addBalance(-rent);
		}
	}

	@Override
	public int getRent() {
		return rent;
	}

}