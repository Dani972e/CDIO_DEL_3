package spil.entity.field;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class LaborCamp extends Ownable {

	private int baseRent;

	public LaborCamp(int price) {
		super(price);

	}

	@Override
	public void landOnField(Player player) {
		player.removeBalance(FieldBoundary.DICE_MULTIPLIER * player.getCurrentRoll());
	}

	@Override
	public int getRent() {
		return baseRent;
	}

}