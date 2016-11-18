package spil.entity.field;

import spil.entity.Player;

/* 
 * abstract class since an Ownable field is a concept,
 * and other Fields will inherit from this class.
 */
public abstract class Field {

	/*
	 * The Field constructor is protected, to make
	 * sure that it isnt possible to instantiate
	 * objects of this class.
	 */
	protected Field() {

	}

	/*
	 * When a player object lands on a field, 
	 * this method will be executed.
	 */
	public abstract void landOnField(Player player);

}