package spil.entity.field;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

public abstract class Ownable extends Field {

	protected int price;
	protected Player owner = null;

	public Ownable(int price) {
		this.price = price;
	}

	public abstract int getRent();

	public boolean purchaseField(Player player, int price, int rent) {
		if (owner == null) {
			if (GUIBoundary.purchaseField(player, price)) {
				owner = player;
				owner.removeBalance(price);
			} else {
				GUIBoundary.print(TextBoundary.purchaseDeniedMessage(player));
			}
			return true;
		} else {
			GUIBoundary.print(TextBoundary.alreadyPurchasedMessage(owner, rent));
			player.removeBalance(rent);
			owner.addBalance(rent);
			return false;
		}

	}

}
