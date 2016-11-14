package spil.entity.field;

import desktop_resources.GUI;
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
			}
		} else {
			GUIBoundary.alreadyPurchased(owner);
		}
	}

	@Override
	public int getRent() {
		return rent;
	}

}