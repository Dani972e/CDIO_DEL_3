package spil.entity.field;

import spil.entity.Player;

public abstract class Ownable extends Field {

	protected int price;
	protected Player owner;
	
	public Ownable(int price) {
		this.price = price;
	}

	public abstract int getRent();

}