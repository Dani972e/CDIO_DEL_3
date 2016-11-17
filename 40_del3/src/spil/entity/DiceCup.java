package spil.entity;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;

public class DiceCup {

	private final int MAX_DIE_COUNT = 1000;
	private final int MIN_DIE_COUNT = 2;

	private Die[] diceList;

	public DiceCup(int dieCount, int maxFaceValue) {
		diceList = new Die[dieCount];

		if (dieCount > MAX_DIE_COUNT) {
			dieCount = MAX_DIE_COUNT;
		} else if (dieCount < MIN_DIE_COUNT) {
			dieCount = MIN_DIE_COUNT;
		}

		for (int i = 0; i < dieCount; i++) {
			diceList[i] = new Die(maxFaceValue);
		}
	}

	public int rollDice(Player player) {
		int[] rollList = new int[diceList.length];
		int total = 0;
		for (int i = 0, n = rollList.length; i < n; i++) {
			rollList[i] = diceList[i].roll();
			total += rollList[i];
		}
		// Spaghetti/ghetto solution?
		GUIBoundary.print(TextBoundary.rollMessage(player, rollList));
		return total;
	}

}