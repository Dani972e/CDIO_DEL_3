package test.fields;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.DiceCup;
import spil.entity.Player;

public class testTerritory {

	private Player player;
	private DiceCup diceCup;

	@Before
	public void setUp() throws Exception {
		player = new Player("Player T", 1000000, 0, 30000, 0);
		diceCup = new DiceCup(2, 6);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testLandOnField() {
		fail("Not yet implemented");
	}

	@Test
	public void testPurchaseField() {
		fail("Not yet implemented");
	}

}