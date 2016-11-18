package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class Fleet extends Ownable {

	private int[] rents = { FieldBoundary.fleetRents[0], FieldBoundary.fleetRents[1], FieldBoundary.fleetRents[2],
			FieldBoundary.fleetRents[3] };
	private int rent;

	private static List<Player> ownerList = new ArrayList<Player>();

	public Fleet(int price) {
		super(price);
	}

	@Override
	public void landOnField(Player player) {
		int sameOwnerCount = getSameOwnerCount();

		if ((sameOwnerCount - 1) < 1) {
			sameOwnerCount = 0;
		} else {
			sameOwnerCount -= 1;
		}

		rent = rents[sameOwnerCount];

		purchaseField(player, price, rent);
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