package spil.entity.field;

import spil.boundary.FieldBoundary;
import spil.entity.Player;

public final class Fleet extends Ownable {

	private int[] rents = { FieldBoundary.fleetRents[0], FieldBoundary.fleetRents[1], FieldBoundary.fleetRents[2], FieldBoundary.fleetRents[3] };

	public Fleet(int price) {
		super(price);
	}

	@Override
	public void landOnField(Player player) {

	}

	@Override
	public int getRent() {
		return 0;
	}

}