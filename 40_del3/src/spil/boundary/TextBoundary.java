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

	public static final String playerName = "Player";
	public static final String buttonYesMessage = "Yes";
	public static final String buttonNoMessage = "No";

	public static final String purchaseFieldMessage(Player player) {
		StringBuilder sb = new StringBuilder();
		sb.append("This field is available. Does " + player.getName() + " want to purchase this field?");
		return sb.toString();
	}

	public static final String purchaseConfirmedMessage(Player player) {
		StringBuilder sb = new StringBuilder();
		sb.append(player.getName() + " bought the field!");
		return sb.toString();
	}

	public static String alreadyPurchasedMessage(Player owner) {
		StringBuilder sb = new StringBuilder();
		sb.append("The field is already purchased. You'll need to pay a rent to the owner, " + owner.getName() + ".");
		return sb.toString();
	}

	public static String bonusMessage(Player player) {
		StringBuilder sb = new StringBuilder();
		sb.append(player.getName() + " earned a bonus of ...!");
		return sb.toString();
	}

}