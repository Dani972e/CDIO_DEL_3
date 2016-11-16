package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class LaborCamp extends Ownable {

	private static List<String> ownerNameList = new ArrayList<String>();

	private int baseRent;

	public LaborCamp(int price) {
		super(price);
	}

	// Dette tal skal så ganges med antallet af Labor camps med den samme ejer.

	@Override
	public void landOnField(Player player) {

		// int sameOwnerCount = getSameOwnerCount();

		// TESTING PURPOSES!!!
		player.setCurrentRoll(6);

		baseRent = ((FieldBoundary.DICE_MULTIPLIER * player.getCurrentRoll()) * sameOwnerCount);
		if (super.purchaseField(player, price, baseRent)) {
			ownerNameList.add(player.getName());
		}

	}

	@Override
	public int getRent() {
		return baseRent;
	}

}