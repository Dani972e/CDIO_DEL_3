package spil.entity.field;

import java.util.ArrayList;
import java.util.List;

import spil.entity.Player;

public abstract class Ownable extends Field {

	private static List<Player> ownerList = new ArrayList<Player>(); 
	
	protected int price;
	protected Player owner;
	
	public Ownable(int price) {
		this.price = price;
	}

	public abstract int getRent();

}