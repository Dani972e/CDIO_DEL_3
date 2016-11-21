package spil.entity.field;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.Player;

/* 
 * final class so nobody accidently inherits from this class.
 */
public final class Refugee extends Field {

	/* 
	 * Variable to hold the Field bonus amount.
	 */
	private int bonus;

	/* 
	 * Refugee constructor which sets variable bonus.
	 */
	public Refugee(int bonus) {
		this.bonus = bonus;
	}

	/* 
	 * Prints out information about receiving the 
	 * bonus and adds it to the player coin sum.
	 */
	@Override
	public void landOnField(Player player) {
		GUIBoundary.print(TextBoundary.bonusMessage(player, bonus));
		player.addBalance(bonus);
	}
	
	/*
	 * Returns the owner of the particular field.
	 * null, since Refugee can not be owned.
	 */
	@Override
	public Player getOwner() {
		return null;
	}

	/*
	 * Sets the owner object equal to null.
	 */
	@Override
	public void deleteOwner() {

	}

}