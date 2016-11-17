package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

import spil.entity.Die;

public class testDie {

	private Die die;

	@After
	public void tearDown() throws Exception {
		die = null;
	}

	@Test
	public void testRoll10() {

		die = new Die(100); // 100 inserted to check Die faceValue bounds.

		int iterations = 1000000;

		int[] rollArray = new int[10];
		int other = 0;

		for (int i = 0; i < iterations; i++) {
			int roll = die.roll();

			switch (roll) {
			case 1:
				rollArray[0]++;
				break;
			case 2:
				rollArray[1]++;
				break;
			case 3:
				rollArray[2]++;
				break;
			case 4:
				rollArray[3]++;
				break;
			case 5:
				rollArray[4]++;
				break;
			case 6:
				rollArray[5]++;
				break;
			case 7:
				rollArray[6]++;
				break;
			case 8:
				rollArray[7]++;
				break;
			case 9:
				rollArray[8]++;
				break;
			case 10:
				rollArray[9]++;
				break;
			default:
				other++;
				break;
			}

		}

		System.out.println("- - - - testRoll10 - - - -");

		for (int i = 0; i < rollArray.length; i++) {
			System.out.println((i + 1) + ": " + rollArray[i]);
		}

		System.out.println("other: " + other);

		int expected = 0;

		assertEquals(expected, other);
	}

	@Test
	public void testRoll6() {

		die = new Die(6);

		int iterations = 1000000;

		int[] rollArray = new int[6];
		int other = 0;

		for (int i = 0; i < iterations; i++) {
			int roll = die.roll();

			switch (roll) {
			case 1:
				rollArray[0]++;
				break;
			case 2:
				rollArray[1]++;
				break;
			case 3:
				rollArray[2]++;
				break;
			case 4:
				rollArray[3]++;
				break;
			case 5:
				rollArray[4]++;
				break;
			case 6:
				rollArray[5]++;
				break;
			default:
				other++;
				break;
			}

		}

		System.out.println("- - - - testRoll6 - - - -");

		for (int i = 0; i < rollArray.length; i++) {
			System.out.println((i + 1) + ": " + rollArray[i]);
		}

		System.out.println("other: " + other);

		int expected = 0;

		assertEquals(expected, other);
	}

}