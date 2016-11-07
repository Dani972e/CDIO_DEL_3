package spil.fields;

import java.awt.Color;

import spil.models.Player;

public final class Fleet extends Ownable {

	protected Fleet(Color bgColor, Color fgColor, String title, String subText, String desc, Player owner, int price) {
		super(bgColor, fgColor, title, subText, desc, owner, price);
	}

	@Override
	public void landOnField(Player player) {
		
	}

}