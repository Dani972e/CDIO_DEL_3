package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class Fleet extends Ownable {

	private int[] rents = { FieldBoundary.fleetRents[0], FieldBoundary.fleetRents[1], FieldBoundary.fleetRents[2],
			FieldBoundary.fleetRents[3] };

	private static List<String> ownerNameList = new ArrayList<String>();

	public Fleet(int price) {
		super(price);
	}

	@Override
	public void landOnField(Player player) {
		// TODO Create this!
	}

	@Override
	public int getRent() {
		return 0;
	}

}