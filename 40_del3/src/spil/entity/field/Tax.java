package spil.entity.field;

import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

public final class Tax extends Field {

	private int tax;

	public Tax(int tax) {
		this.tax = tax;
	}

	@Override
	public void landOnField(Player player) {
		if (player.getPosition() == 16) { // TODO 16 ROBUST!!
			if (GUIBoundary.decideTaxChoice(player, tax)) {
				player.removeBalance(tax);
			} else {
				player.removeBalance((int) (FieldBoundary.TAX_MULTIPLICITY * player.getBalance()));
			}
		} else {
			GUIBoundary.print(TextBoundary.taxMessage(player, tax));
			player.removeBalance(tax);
		}
	}

}