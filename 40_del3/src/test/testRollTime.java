package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.DiceCup;
import spil.entity.Player;

public class testRollTime {

	private DiceCup diceCup;
	private Player player;

	@Before
	public void setUp() throws Exception {
		diceCup = new DiceCup(2, 6);
		player = new Player("Player 1", 100000, 0, 30000, 0);
	}

	@After
	public void tearDown() throws Exception {

	}

	/*
	 * This test will determine the time between when the user clicks "OK" to roll
	 * the dice, and when the system is done executing the roll. A total of 100 
	 * rolls are tested to get a more accurate result.
	 */
	@Test
	public void test() {

		long deltaMax = 0;
		int iterations = 100;

		for (int i = 0; i < iterations; i++) {
			System.out.println("Turn: " + i);
			GUIBoundary.print(TextBoundary.rollInfoMessage(player));

			long before = System.currentTimeMillis();
			System.out.println("Before: " + before + "\n");

			int[] rollList = diceCup.rollDice(player);
			int rollTotal = diceCup.getTotalRoll(rollList);

			player.setLatestRoll(rollTotal);
			GUIBoundary.showDice(rollList);
			GUIBoundary.print(TextBoundary.rollMessage(player, rollList));

			long after = System.currentTimeMillis();
			System.out.println("After: " + after + "\n");

			long delta = after - before;
			System.out.println("Delta: " + delta + "\n");

			deltaMax += delta;
		}
		System.out.println("- - - - Final Result - - - -");
		System.out.println("Average delta: " + (double) (deltaMax / iterations) + " millis");
	}

}