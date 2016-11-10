package spil.entity;

/**
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 * @author Peter El-Habr (s165202)
 * @author Loui Southwick (s161788)
 * @version 1.2
 */

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

	public String toString() {
		return Integer.toString(faceValue);
	}

}