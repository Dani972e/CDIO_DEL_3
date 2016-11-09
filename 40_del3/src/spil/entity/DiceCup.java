package spil.entity;

import java.util.ArrayList;
import java.util.List;

public final class DiceCup {

	private final int MAX_DIE_COUNT = 1000;
	private final int MIN_DIE_COUNT = 1;

	private List<Die> diceList = new ArrayList<Die>();

	public DiceCup(int dieCount, int maxFaceValue) {
		if (dieCount > MAX_DIE_COUNT)
			dieCount = MAX_DIE_COUNT;

		if (dieCount < MIN_DIE_COUNT)
			dieCount = MIN_DIE_COUNT;

		for (int i = 0; i < dieCount; i++) {
			diceList.add(new Die(maxFaceValue));
		}
	}

	public int[] rollDice() {
		int[] rollList = new int[diceList.size()];
		for (int i = 0, n = rollList.length; i < n; i++) {
			rollList[i] = diceList.get(i).roll();
		}
		return rollList;
	}

}