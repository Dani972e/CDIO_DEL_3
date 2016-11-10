package spil.entity.field;

import spil.entity.Player;

public final class Fleet extends Ownable {

	private int[] rents = { 500, 1000, 2000, 4000 };

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