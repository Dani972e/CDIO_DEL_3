package spil.entity;

public final class Die {

	private final int MAX_FACE_VALUE = 10;
	private final int MIN_FACE_VALUE = 6;

	private int currMaxFaceValue;
	private int faceValue = 1;

	public Die(int currMaxFaceValue) {

		if (currMaxFaceValue > MAX_FACE_VALUE) {
			currMaxFaceValue = MAX_FACE_VALUE;
		} else if (currMaxFaceValue < MIN_FACE_VALUE) {
			currMaxFaceValue = MIN_FACE_VALUE;
		}

		this.currMaxFaceValue = currMaxFaceValue;
	}

	public int roll() {
		faceValue = (int) (Math.random() * currMaxFaceValue) + 1;
		return getFaceValue();
	}

	public int getFaceValue() {
		return faceValue;
	}

	// spørg ronnie
	public String toString() {
		return Integer.toString(faceValue);
	}

}