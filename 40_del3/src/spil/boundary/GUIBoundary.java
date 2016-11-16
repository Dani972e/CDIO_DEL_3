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

	public static boolean taxChoice(Player player, int taxAmount) {
		String btn1 = Integer.toString(taxAmount);
		String btn2 = TextBoundary.btnBalancePercentage;

		String result = GUI.getUserButtonPressed(TextBoundary.taxChoiceMessage(player), btn1, btn2);

		if (result.equals(btn1))
			return true;
		return false;
	}

	public static int decidePlayerAmount() {
		String result = GUI.getUserSelection(TextBoundary.welcomeMessage, TextBoundary.btnArray[0],
				TextBoundary.btnArray[1], TextBoundary.btnArray[2], TextBoundary.btnArray[3], TextBoundary.btnArray[4],
				TextBoundary.btnArray[5], TextBoundary.btnArray[6], TextBoundary.btnArray[7], TextBoundary.btnArray[8]);
		return Integer.parseInt(result);
	}
}