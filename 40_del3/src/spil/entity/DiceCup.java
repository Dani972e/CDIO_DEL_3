package spil.entity;

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

	public int[] rollDice() {
		int[] rollList = new int[diceList.length];
		for (int i = 0, n = rollList.length; i < n; i++) {
			rollList[i] = diceList[i].roll();
		}
		return rollList;
	}

}