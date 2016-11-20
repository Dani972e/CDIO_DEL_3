package test.fields;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import spil.entity.DiceCup;
import spil.entity.Player;
import spil.entity.field.Territory;

public class testTerritory {

	private Player player1;
	private Player player2;
	private DiceCup diceCup;
	private Territory TerritoryP1000R100;
	private Territory TerritoryP4000R1000;
	private Territory TerritoryP6000R3200;
	private Territory TerritoryP5500R2600;

	@Before
	public void setUp() throws Exception {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);
		diceCup = new DiceCup(2, 6);
		// pos 2
		TerritoryP1000R100 = new Territory(1000, 100);
		TerritoryP4000R1000 = new Territory(4000, 1000);
		TerritoryP6000R3200 = new Territory(6000, 3200);
		TerritoryP5500R2600 = new Territory(5500, 2600);
	}

	@After
	public void tearDown() throws Exception {
		player1 = null;
		player2 = null;
		diceCup = null;
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testEntities() {
		Assert.assertNotNull(this.player1);
		Assert.assertNotNull(this.player2);
		Assert.assertNotNull(this.diceCup);
		Assert.assertNotNull(this.TerritoryP1000R100);
		Assert.assertNotNull(this.TerritoryP4000R1000);
		Assert.assertNotNull(this.TerritoryP6000R3200);
		Assert.assertNotNull(this.TerritoryP5500R2600);
	}

	@Test
	public void testLandOnFieldP1000R100() {
		final int price = 1000;
		final int rent = 100;
		System.out.println(player1.getBalance());
		player1.setPosition(2);

		/* Player 1 lands and purchases the field for 1000. */
		TerritoryP1000R100.landOnField(player1);
		

		int expected = player1.getBalance() - price;
		int actual = player1.getBalance();

		assertEquals("", expected, actual);

		/* Player 2 lands and pays rent of 100. */
		TerritoryP1000R100.landOnField(player2);
	}

}