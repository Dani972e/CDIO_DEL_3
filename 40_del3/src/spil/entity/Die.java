package spil.entity;

/**
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 * @author Peter El-Habr (s165202)
 * @author Loui Southwick (s161788)
 * @version 1.2
 */

public final class Die {

	private int maxFaceValue = 6;
	private int faceValue = 1;

	public Die(int maxFaceValue) {
		this.maxFaceValue = maxFaceValue;
	}

	public int roll() {
		faceValue = (int) (Math.random() * maxFaceValue) + 1;
		return getFaceValue();
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setMaxFaceValue(int maxFaceValue) {
		this.maxFaceValue = maxFaceValue;
	}

}