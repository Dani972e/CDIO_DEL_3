package spil.boundary;

import desktop_resources.GUI;
import spil.entity.Player;

public class GUIBoundary {

	private GUIBoundary() {

	}

	public static boolean purchaseField() {
		String result = GUI.getUserButtonPressed(TextBoundary.purchaseFieldMessage, TextBoundary.buttonYesMessage,
				TextBoundary.buttonNoMessage);
		if (result.equals(TextBoundary.buttonYesMessage)) {
			return true;
		}
		return false;
	}

	public static void alreadyPurchased(Player owner) {
		GUI.showMessage(TextBoundary.alreadyPurchasedMessage(owner));
	}

}
