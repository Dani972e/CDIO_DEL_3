package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

/* 
 * final class so nobody accidently inherits from this class.
 */
public final class Fleet extends Ownable {

	/*
	 * Different rents of this field.
	 */
	private int[] rents = { FieldBoundary.fleetRents[0], FieldBoundary.fleetRents[1], FieldBoundary.fleetRents[2],
			FieldBoundary.fleetRents[3] };

	/*
	 * Rent variable for this field.
	 */
	private int rent;

	/*
	 * ArrayList object to keep track of Players who own
	 * instances of the Fleet field.
	 */
	private static List<Player> ownerList = new ArrayList<Player>();

	/*
	 * Constructor that sets price variable with super constructor.
	 */
	public Fleet(int price) {
		super(price);
	}

	/*
	 * Calculates the amount of Fleet fields 
	 * the owner of this specific Field owns.
	 * That is used to decide the rent in the 
	 * array above.
	 */
	@Override
	public void landOnField(Player player) {
		int sameOwnerCount = getSameOwnerCount();

		if ((sameOwnerCount - 1) < 1) {
			sameOwnerCount = 0;
		} else {
			sameOwnerCount -= 1;
		}

		rent = rents[sameOwnerCount];

		if (super.purchaseField(player, price, rent)) {
			ownerList.add(player);
		}
	}

	/*
	 * Returns the amount of LaborCamp fields with
	 * the same owner, of this specific field.
	 */
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

	/*
	 * Returns the rent variable.
	 */
	@Override
	public int getRent() {
		return rent;
	}

}