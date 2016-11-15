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
		if (owner == null) {
			if (GUIBoundary.purchaseField(player)) {
				owner = player;
				owner.removeBalance(price);
			}
		} else {
			GUIBoundary.print(TextBoundary.alreadyPurchasedMessage(owner));
			player.removeBalance(rent);
		}
	}

	@Override
	public int getRent() {
		return rent;
	}

}