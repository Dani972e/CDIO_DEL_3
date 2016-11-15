package spil.boundary;

import desktop_fields.Field;
import desktop_resources.GUI;
import spil.entity.Player;

public class GUIBoundary {

	private GUIBoundary() {

	}

	public static boolean purchaseField(Player player) {
		String result = GUI.getUserButtonPressed(TextBoundary.purchaseFieldMessage(player),
				TextBoundary.buttonYesMessage, TextBoundary.buttonNoMessage);
		if (result.equals(TextBoundary.buttonYesMessage)) {
			print((TextBoundary.purchaseConfirmedMessage(player)));
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

}