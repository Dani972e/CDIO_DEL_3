package spil.entity.field;

import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

public final class Tax extends Field {

	private int taxAmount;

	public Tax(int taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Override
	public void landOnField(Player player) {
		if (player.getPosition() == 16) {
			if (GUIBoundary.taxChoice(player, taxAmount)) {
				player.removeBalance(taxAmount);
			} else {
				player.removeBalance((int) (FieldBoundary.TAX_MULTIPLICITY * player.getBalance()));
			}
		} else {
			GUIBoundary.print(TextBoundary.taxMessage(player, taxAmount));
			player.removeBalance(taxAmount);
		}
	}

}