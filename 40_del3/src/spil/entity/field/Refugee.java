package spil.entity.field;

import spil.entity.Player;

public final class Refugee extends Field {

	private int bonus;

	public Refugee(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void landOnField(Player player) {
		player.addCoins(bonus);
	}

}