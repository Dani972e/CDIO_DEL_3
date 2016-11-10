package spil.entity.field;

import spil.entity.Player;

public final class Tax extends Field {

	private int taxAmount;
	private final int TAX_RATE = -1;

	public Tax(int taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	@Override
	public void landOnField(Player player) {
		player.addCoins(-taxAmount);
	}

}