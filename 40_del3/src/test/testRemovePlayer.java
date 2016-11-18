package test;

import spil.entity.Player;
import spil.entity.PlayerList;

public class testRemovePlayer {
	
	private static PlayerList players;

	public static void main(String[] args) {

		Player currentPlayer = players.getPlayer(0);
		
		System.out.println(players.getPlayersLeft());
		
		players.removePlayer(currentPlayer);
		
		System.out.println(players.getPlayersLeft());
		
		currentPlayer = players.getPlayer(2);
		
		players.removePlayer(currentPlayer);
		
		System.out.println(players.getPlayersLeft());
		
		currentPlayer = players.getPlayer(3);
		
		players.removePlayer(currentPlayer);
		
		System.out.println(players.getPlayersLeft());
		
		System.out.println(players.getLastPlayer().getName());
	}

}
