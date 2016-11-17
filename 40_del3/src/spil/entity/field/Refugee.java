package spil.entity.field;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

public final class Refugee extends Field {

	/* Variable to hold the Field bonus amount */
	private int bonus;

	public Refugee(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void landOnField(Player player) {
		GUIBoundary.print(TextBoundary.bonusMessage(player, bonus));
		player.addBalance(bonus);
	}

}