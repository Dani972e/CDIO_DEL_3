package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class LaborCamp extends Ownable {

	private static List<Player> ownerList = new ArrayList<Player>();

	private int rent;

	public LaborCamp(int price) {
		super(price);
	}

	@Override
	public void landOnField(Player player) {
		int sameOwnerCount = getSameOwnerCount();
		rent = ((FieldBoundary.DICE_MULTIPLIER * player.getCurrentRoll()) * sameOwnerCount);

		if (super.purchaseField(player, price, rent)) {
			ownerList.add(player);
		}
	}

	private int getSameOwnerCount() {
		if (owner == null) {
			return 0;
		}

		int count = 0;

		if (ownerList.size() > 0) {
			for (Player ownerP : ownerList) {
				if (ownerP.equals(owner))
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