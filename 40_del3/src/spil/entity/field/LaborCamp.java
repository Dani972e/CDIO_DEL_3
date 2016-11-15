package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class LaborCamp extends Ownable {

	private List<Player> ownerList = new ArrayList<Player>();

	private int baseRent;

	public LaborCamp(int price) {
		super(price);
	}

	//	Dette tal skal så ganges med antallet af Labor camps med den samme ejer.

	@Override
	public void landOnField(Player player) {
		int rent = (FieldBoundary.DICE_MULTIPLIER * player.getCurrentRoll());
		if (super.purchaseField(player, price, rent)) {
			ownerList.add(player);
		}

	}

	@Override
	public int getRent() {
		return baseRent;
	}

}