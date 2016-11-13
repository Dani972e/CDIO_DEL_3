package spil.main;

import spil.controller.GameController;
import spil.entity.Player;
import spil.entity.field.Territory;

public final class Main {

	public static void main(String[] args) {
		Player p1 = new Player("Daniel", 0, 0, 0);
		Territory felt = new Territory(100, 300);
		
		Player p2 = new Player("Jaroslav", 0, 0, 0);
		
		
		felt.landOnField(p1);
		felt.landOnField(p2);
		
		
		new GameController();
		
	}

}