package test;

import spil.entity.PlayerList;

public class testPlayerList {

	public static void main(String[] args) {
		PlayerList players = new PlayerList(2);
		
		players.move(0, 21);
		
		System.out.println(players.getPosition(0));
		
		players.move(0, 6);
		
		System.out.println(players.getPosition(0));
		
		players.move(0, 10);
		
		System.out.println(players.getPosition(0));
		
		players.move(0, 10);
		
		System.out.println(players.getPosition(0));

	}

}
