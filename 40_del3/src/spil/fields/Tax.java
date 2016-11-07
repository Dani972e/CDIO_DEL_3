package spil.fields;

import java.awt.Color;

import spil.models.Player;

public final class Tax extends Field {

	protected Tax(Color bgColor, Color fgColor, String title, String subText, String desc) {
		super(bgColor, fgColor, title, subText, desc);
	}

	@Override
	public void landOnField(Player player) {

	}

}