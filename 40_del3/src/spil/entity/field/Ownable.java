package spil.entity.field;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

/* 
 * abstract class since an Ownable field is a concept,
 * and other Fields will inherit from this class.
 */
public abstract class Ownable extends Field {

	/* 
	 * The price variable represents the price of the Field.
	 * The player variable represents
	 */
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
			return true; /*
							 * TODO Test this return statement. Does the code
							 * really work as intended?
							 */
		} else {
			if (player.getName().equals(owner.getName())) {
				GUIBoundary.print(TextBoundary.ownFieldMessage(player));
			} else {
				GUIBoundary.print(TextBoundary.alreadyPurchasedMessage(owner, rent));
				player.removeBalance(rent);
				owner.addBalance(rent);
			}
			return false;
		}

	}

}