package spil.entity.field;

import spil.entity.Player;

public final class LaborCamp extends Ownable {

	private int baseRent;

	public LaborCamp(int price) {
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