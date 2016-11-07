package spil.fields;

import java.awt.Color;

import spil.models.Player;

public abstract class Ownable extends Field {

	private Player owner;
	private int price;

	protected Ownable(Color bgColor, Color fgColor, String title, String subText, String desc, Player owner,
			int price) {
		super(bgColor, fgColor, title, subText, desc);
		this.owner = owner;
		this.price = price;
	}

	public Player getOwner() {
		return owner;
	}

	public int getPrice() {
		return price;
	}

}