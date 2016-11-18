package spil.entity.field;

import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

/* 
 * final class so nobody accidently inherits from this class.
 */
public final class Tax extends Field {

	/*
	 * Tax amount of the field.
	 */
	private int tax;

	/* 
	 * Constructor which sets the tax amount.
	 */
	public Tax(int tax) {
		this.tax = tax;
	}

	/*
	 * If the player lands on position TAX_SPECIAL_POS, then the player will be able to
	 * choose between two different effects for their coin sum. They can choose between
	 * getting tax or 10% of their coin sum removed. However, if the player does not land
	 * on TAX_SPECIAL_POS, just tax is removed.
	 */
	@Override
	public void landOnField(Player player) {
		if (player.getPosition() == FieldBoundary.TAX_SPECIAL_POS) {
			if (GUIBoundary.chooseTaxEffect(player, tax)) {
				player.removeBalance(tax);
			} else {
				player.removeBalance((int) (FieldBoundary.TAX_MULTIPLIER * player.getBalance()));
			}
		} else {
			GUIBoundary.print(TextBoundary.taxMessage(player, tax));
			player.removeBalance(tax);
		}
	}

}