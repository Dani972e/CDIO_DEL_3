package spil.entity;

import spil.boundary.FieldBoundary;
import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;

public class PlayerList {

	private final int MAX_PLAYER_COUNT = 6;
	private final int MIN_PLAYER_COUNT = 2;

	private Player[] playerList;

	public PlayerList(int playerCount, int maxCoinAmount, int minCoinAmount, int coins, int position) {

		if (playerCount > MAX_PLAYER_COUNT) {
			playerCount = MAX_PLAYER_COUNT;
		} else if (playerCount < MIN_PLAYER_COUNT) {
			playerCount = MIN_PLAYER_COUNT;
		}

		playerList = new Player[playerCount];

		for (int i = 0; i < playerCount; i++) {
			playerList[i] = new Player(TextBoundary.playerName + " " + (i + 1), maxCoinAmount, minCoinAmount, coins,
					position);
			GUIBoundary.addPlayer(playerList[i]);
		}
	}

	public void movePlayer(int playerIndex, int amount) {
		int newPosition = playerList[playerIndex].getPosition() + amount;
		int numberOfFields = FieldBoundary.FIELD_COUNT;

		while (newPosition > numberOfFields) {
			newPosition -= numberOfFields;
		}

		// Spaghetti/ghetto solution?
		GUIBoundary.removePlayerCar(playerList[playerIndex]);
		playerList[playerIndex].setPosition(newPosition);
		GUIBoundary.placePlayerCar(playerList[playerIndex]);
	}

<<<<<<< HEAD
	public Player getPlayer(int index) {
		return playerList[index];
	}

	public int getPosition(int index) {
		return playerList[index].getPosition();
	}

	public int getTotalPlayers() {
		return playerList.length;
	}

=======
>>>>>>> branch 'development' of https://github.com/Dani972e/CDIO_DEL_3.git
	// Spaghetti/ghetto solution?
	public void setHomeCars() {
		for (Player player : playerList) {
			player.setPosition(1);
			GUIBoundary.placePlayerCar(player);
			player.setPosition(0);
		}
	}

<<<<<<< HEAD
	public void removePlayer(Player playerToDelete){
		int index=0;

		for(Player player : playerList){
			//System.out.println(">");
			if (playerToDelete.equals(player)){
				//System.out.println("-");
				playerList[index]=null;
			}
			++index;
		}	
=======
	public Player getPlayer(int index) {
		return playerList[index];
	}

	public int getTotalPlayers() {
		return playerList.length;
>>>>>>> branch 'development' of https://github.com/Dani972e/CDIO_DEL_3.git
	}

	public int getPlayersLeft() {
		int left = 0;
		for (Player player : playerList) {
			if (player instanceof Player){
				++left;
			}
		}
		return left;
	}
	
	public Player getLastPlayer(){
		Player last=null;
		for(Player player : playerList){
			if(player instanceof Player)
				last=player;
		}
		return last;
		
	}




}
