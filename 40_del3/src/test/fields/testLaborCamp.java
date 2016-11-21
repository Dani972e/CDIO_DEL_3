package test.fields;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.Player;
import spil.entity.field.LaborCamp;

public class testLaborCamp {

	private LaborCamp huts;
	private LaborCamp thePit;
	private Player player;
	private Player owner;

	@Before
	public void setUp() throws Exception {
		player = new Player("Player 1", 1000000, 0, 30000, 0);
		owner = new Player("Owner", 1000000, 0, 30000, 0);
		huts = new LaborCamp(1000);
		thePit = new LaborCamp(3000);
	}

	@After
	public void tearDown() throws Exception {
		huts = null;
		thePit = null;
		player = null;
		owner = null;
	}

	/*
	 * Tests whether the landOnField method works correctly, when both
	 * LaborCamps are owned.
	 */
	@Test
	public void testLaborCamp2OwnersRent() {
		int latestRoll = 5;
		int sameOwner = 2;

		/*
		 * Make sure that the owner object owns both LaborCamp fields. 
		 */

		// Position 15 for Huts in the Mountain
		owner.setPosition(15);
		huts.landOnField(owner);

		// Position 16 for The Pit
		owner.setPosition(16);
		thePit.landOnField(owner);

		int rent = (100 * latestRoll) * sameOwner;
		int expected = player.getBalance() - rent;

		/*
		 * Sets a sample latestRoll for LaborCamp to work.
		 * Sets position to 15 to simulate that the Player
		 * lands on Huts In The Mountain.
		 */
		player.setLatestRoll(latestRoll);
		player.setPosition(15);
		huts.landOnField(player);

		int actual = player.getBalance();

		assertEquals("LaborCamp field is not removing the correct rent.", actual, expected);
	}

	/*
	 * Tests whether the landOnField method works correctly, when only one
	 * LaborCamp is owned.
	 */
	@Test
	public void testLaborCamp1OwnersRent() {
		int latestRoll = 5;
		int sameOwner = 1;

		/*
		 * Make sure that the owner object owns both LaborCamp fields. 
		 */

		// Position 15 for Huts in the Mountain
		owner.setPosition(15);
		huts.landOnField(owner);

		int rent = (100 * latestRoll) * sameOwner;
		int expected = player.getBalance() - rent;

		/*
		 * Sets a sample latestRoll for LaborCamp to work.
		 * Sets position to 15 to simulate that the Player
		 * lands on Huts In The Mountain.
		 */
		player.setLatestRoll(latestRoll);
		player.setPosition(15);
		huts.landOnField(player);

		int actual = player.getBalance();

		assertEquals("LaborCamp field is not removing the correct rent.", actual, expected);
	}

}