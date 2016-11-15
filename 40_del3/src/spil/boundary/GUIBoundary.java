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
		String btn2 = "10% of balance";

		String result = GUI.getUserButtonPressed(TextBoundary.taxChoiceMessage(player), btn1, btn2);

		if (result.equals(btn1))
			return true;
		return false;
	}

}