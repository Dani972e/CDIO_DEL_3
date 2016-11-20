package test.fields;

import static org.junit.Assert.fail;

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
	private Territory TerritoryP500R1000;
	private Territory TerritoryP10R20;
	private Territory TerritoryP50R5000;
	private Territory TerritoryP5000R50;

	@Before
	public void setUp() throws Exception {
		player1 = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);
		diceCup = new DiceCup(2, 6);
		TerritoryP500R1000 = new Territory(500, 1000);
		TerritoryP10R20 = new Territory(10, 20);
		TerritoryP50R5000 = new Territory(50, 5000);
		TerritoryP5000R50 = new Territory(5000, 50);
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
		Assert.assertNotNull(this.TerritoryP500R1000);
		Assert.assertNotNull(this.TerritoryP10R20);
		Assert.assertNotNull(this.TerritoryP50R5000);
		Assert.assertNotNull(this.TerritoryP50R5000);
		Assert.assertNotNull(this.TerritoryP5000R50);
	}

	@Test
	public void testLandOnFieldR5000P1000() {
		TerritoryP500R1000.landOnField(player);
	}

	@Test
	public void testPurchaseField() {
		fail("Not yet implemented");
	}

}