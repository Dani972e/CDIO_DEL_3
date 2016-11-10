package spil.boundary;

public final class TextBoundary {

	private TextBoundary() {

	}

	public static String[][] fieldText = { { "1. Tribe Encampment", "Territory", "Rent: 100\nPrice: 1000" },
			{ "2. Crater", "Territory", "Rent: 300 - Price: 1500" },
			{ "3. Mountain", "Territory", "Rent: 300 -- Price: 1500" },
			{ "4. Territory", "Cold Desert", "Rent: 300/nPrice: 1500" },
			{ "5. Black cave", "Territory", "Rent: 300\nPrice: 1500" },
			{ "6. The Werewall", "Territory", "Rent: 300\nPrice: 1500" },
			{ "7. Mountain village", "Territory", "Rent: 300\nPrice: 1500" },
			{ "8. South Citadel", "Territory", "Rent: 300\nPrice: 1500" },
			{ "9. Palace gates", "Territory", "Rent: 300\nPrice: 1500" },
			{ "10. Tower", "Territory", "Rent: 300\nPrice: 1500" },
			{ "11. Castle", "Territory", "Rent: 300\nPrice: 1500" }, { "12. Walled city", "Refugee", "Receive: 5000" },
			{ "13. Monastery", "Refugee", "Receive: 500" },
			{ "14. Huts in the mountain", "Labor camp", "Pay: 100 * dice\nPrice: 2500" },
			{ "15. The pit", "Labor camp", "Pay: 100 * dice\nPrice: 2500" }, { "16. Goldmine", "Tax", "Pay: 2000" },
			{ "17. Caravan", "Tax", "Pay: 4000 or 10% of your coins" },
			{ "18. Second Sail", "Fleet", "Pay: 500-4000\nPrice: 4000" },
			{ "19. Sea Grover", "Fleet", "Pay: 500-4000\nPrice: 4000" },
			{ "20. The Buccaneers", "Fleet", "Pay: 500-4000\nPrice: 4000" },
			{ "21. Privateer armade", "Fleet", "Pay: 500-4000\nPrice: 4000" }, };

	public static String playerName = "Player";

}