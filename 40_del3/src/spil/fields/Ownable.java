package spil.fields;

import spil.models.Player;

public abstract class Ownable extends Field {

	protected int price;
	protected Player owner;

	public abstract int getRent();

}