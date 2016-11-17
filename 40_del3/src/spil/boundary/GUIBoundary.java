package spil.boundary;

import desktop_fields.Field;
import desktop_resources.GUI;
import spil.entity.Player;

public class GUIBoundary {

	private GUIBoundary() {

	}

	public static boolean purchaseField(Player player, int price) {
		String result = GUI.getUserButtonPressed(TextBoundary.purchaseFieldMessage(player, price),
				TextBoundary.buttonYesMessage, TextBoundary.buttonNoMessage);
		if (result.equals(TextBoundary.buttonYesMessage)) {
			print((TextBoundary.purchaseConfirmedMessage(player, price)));
			return true;
		}
		return false;
	}

	public static void print(String message) {
		GUI.showMessage(message);
	}

	public static void initFields(Field[] fields) {
		GUI.create(fields);
	}

	public static void addPlayer(Player player) {
		GUI.addPlayer(player.getName(), player.getBalance());
	}

	public static void updatePlayer(Player player) {
		GUI.setBalance(player.getName(), player.getBalance());
	}

	public static void placePlayerCar(Player player) {
		GUI.setCar(player.getPosition(), player.getName());
	}

	public static void removePlayerCar(Player player) {
		int pos = player.getPosition();
		if (pos == 0) {
			player.setPosition(1);
		}
		GUI.removeCar(player.getPosition(), player.getName());
	}

	public static boolean decideTaxChoice(Player player, int taxAmount) {
		String btn1 = Integer.toString(taxAmount);
		String btn2 = TextBoundary.btnBalancePercentage;

		String result = GUI.getUserButtonPressed(TextBoundary.taxChoiceMessage(player), btn1, btn2);

		if (result.equals(btn1))
			return true;
		return false;
	}

	public static int decidePlayerAmount() {
		String result = GUI.getUserSelection(TextBoundary.welcomeMessage, TextBoundary.btnArray[0],
				TextBoundary.btnArray[1], TextBoundary.btnArray[2], TextBoundary.btnArray[3], TextBoundary.btnArray[4]);
		return Integer.parseInt(result);
	}
}