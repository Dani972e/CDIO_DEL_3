package spil.entity.field;

import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

/* final class so nobody accidently inherits from this class */
public final class Tax extends Field {

	/* Tax amount of the field */
	private int tax;

	/* Constructor which sets the tax amount */
	public Tax(int tax) {
		this.tax = tax;
	}

	@Override
	public void landOnField(Player player) {
		/* If player lands on position TAX_SPECIAL_POS */
		if (player.getPosition() == FieldBoundary.TAX_SPECIAL_POS) {
			/* then let the player choose which effect they want */
			if (GUIBoundary.chooseTaxEffect(player, tax)) {
				/* If above is true, the tax is removed from the players balance */
				player.removeBalance(tax);
			} else {
				/* If above is false, another number is calculated and removed from the players balance */
				player.removeBalance((int) (FieldBoundary.TAX_MULTIPLIER * player.getBalance()));
			}
		} else {
			/* If the position is not TAX_SPECIAL_POS, then just print info message */
			GUIBoundary.print(TextBoundary.taxMessage(player, tax));
			/* and remove tax amount */
			player.removeBalance(tax);
		}
	}

}