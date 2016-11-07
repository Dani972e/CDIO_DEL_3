package spil.fields;

import spil.models.Player;

public final class Fleet extends Ownable {

	private int[] rents = { 500, 1000, 2000, 4000 };

	@Override
	public void landOnField(Player player) {

	}

	@Override
	public int getRent() {
		return 0;
	}

}