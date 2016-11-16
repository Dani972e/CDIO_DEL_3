package spil.boundary;

import spil.entity.Player;

public class TextBoundary {

	private TextBoundary() {

	}

	public static final String[][] fieldText = { { "1. Tribe Encampment", "Territory", "Rent: 100 ~ Price: 1000" },
			{ "2. Crater", "Territory", "Rent: 300 ~ Price: 1500" },
			{ "3. Mountain", "Territory", "Rent: 500 ~ Price: 2000" },
			{ "4. Cold Desert", "Territory", "Rent: 700 ~ Price: 3000" },
			{ "5. Black Cave", "Territory", "Rent: 1000 ~ Price: 4000" },
			{ "6. The Werewall", "Territory", "Rent: 1300 ~ Price: 4300" },
			{ "7. Mountain Village", "Territory", "Rent: 1600 ~ Price: 4750" },
			{ "8. South Citadel", "Territory", "Rent: 2000 ~ Price: 5000" },
			{ "9. Palace Gates", "Territory", "Rent: 2600 ~ Price: 5500" },
			{ "10. Tower", "Territory", "Rent: 3200 ~ Price: 6000" },
			{ "11. Castle", "Territory", "Rent: 4000 ~ Price: 8000" },
			{ "12. Walled city", "Refugee", "Receive: 5000" }, { "13. Monastery", "Refugee", "Receive: 500" },
			{ "14. Huts in the Mountain", "Labor camp", "Pay: 100 * dice ~ Price: 2500" },
			{ "15. The Pit", "Labor camp", "Pay: 100 * dice ~ Price: 2500" }, { "16. Gold Mine", "Tax", "Pay: 2000" },
			{ "17. Caravan", "Tax", "Pay: 4000 or 10% of your coins" },
			{ "18. Second Sail", "Fleet", "Pay: 500-4000 ~ Price: 4000" },
			{ "19. Sea Grover", "Fleet", "Pay: 500-4000 ~ Price: 4000" },
			{ "20. The Buccaneers", "Fleet", "Pay: 500-4000 ~ Price: 4000" },
			{ "21. Privateer Armade", "Fleet", "Pay: 500-4000 ~ Price: 4000" }, };

	public static final String title = "Treasure Hunt 2";

	public static final String welcomeMessage = "Welcome to " + title
			+ "!\n\nPlease choose the amount of players for the game.";

	public static final String playerName = "Player";

	public static final String[] btnArray = { "2", "3", "4", "5", "6", "7", "8", "9", "10", };

	public static final String buttonYesMessage = "Yes";
	public static final String buttonNoMessage = "No";

	public static final String btnBalancePercentage = "10% of balance";

	public static final String purchaseFieldMessage(Player player, int price) {
		return landMessage(player) + getFieldName(player) + " is available for purchase. Does " + player.getName()
				+ " want to purchase this field for " + price + " coins?";
	}

	public static final String purchaseConfirmedMessage(Player player, int price) {
		return player.getName() + " successfully bought " + getFieldName(player) + " for the price of " + price
				+ " coins.";
	}

	public static final String purchaseDeniedMessage(Player player) {
		return player.getName() + " did not purchase " + getFieldName(player) + ".";
	}

	public static String alreadyPurchasedMessage(Player owner, int rent) {
		return getFieldName(owner) + " is already purchased. You'll need to pay a rent of " + rent + " to the owner, "
				+ owner.getName() + ".";
	}

	public static String bonusMessage(Player player, int bonus) {
		return landMessage(player) + player.getName() + " earned a bonus of " + bonus + "!";
	}

	public static String taxMessage(Player player, int rent) {
		return player.getName() + " pay " + rent + " for landing on " + getFieldName(player);
	}

	public static String taxChoiceMessage(Player player) {
		return player.getName() + " choose one button.";
	}

	public static String getFieldName(Player player) {
		return TextBoundary.fieldText[player.getPosition()][0];
	}

	public static String landMessage(Player player) {
		return player.getName() + " lands on " + getFieldName(player) + "!\n\n";
	}

};