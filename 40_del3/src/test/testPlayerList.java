package test;

import spil.entity.PlayerList;

public class testPlayerList {
	public static void main(String[] args) {
		PlayerList players = new PlayerList(2, 0, 0, 0, 0);

		players.movePlayer(0, 21);

		System.out.println(players.getPosition(0));
		players.movePlayer(0, 6);

		System.out.println(players.getPosition(0));

		players.movePlayer(0, 10);

		System.out.println(players.getPosition(0));
		players.movePlayer(0, 10);

		System.out.println(players.getPosition(0));

	}

}
