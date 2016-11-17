package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class LaborCamp extends Ownable {

	private static List<String> ownerNameList = new ArrayList<String>();

	private int rent;

	public LaborCamp(int price) {
		super(price);
	}

	@Override
	public void landOnField(Player player) {
		int sameOwnerCount = getSameOwnerCount();
		rent = ((FieldBoundary.DICE_MULTIPLIER * player.getCurrentRoll()) * sameOwnerCount);

		if (super.purchaseField(player, price, rent)) {
			ownerNameList.add(player.getName());
		}
	}

	private int getSameOwnerCount() {
		if (owner == null) {
			return 0;
		}

		int count = 0;

		if (ownerNameList.size() > 0) {
			for (String ownerName : ownerNameList) {
				if (ownerName.equals(owner.getName()))
					count++;
			}
		}
		return count;
	}

	@Override
	public int getRent() {
		return rent;
	}

}