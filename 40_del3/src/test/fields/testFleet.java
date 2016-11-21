package test.fields;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.Player;
import spil.entity.field.Fleet;

public class testFleet {
	
	private Fleet fleet1;
	private Fleet fleet2;
	private Fleet fleet3;
	private Fleet fleet4;

	private Player player;
	private Player player2;
	
	@Before
	public void setUp() throws Exception {
		fleet1 = new Fleet(4000);
		fleet2 = new Fleet(-6000);
		fleet3 = new Fleet(0);
		fleet4 = new Fleet(1);
		
		player = new Player("Player 1", 1000000, 0, 30000, 0);
		player2 = new Player("Player 2", 1000000, 0, 30000, 0);
			
	}

	@After
	public void tearDown() throws Exception {
		fleet1 = null;
		fleet2 = null;
		fleet3 = null;
		fleet4 = null;
		player=null;
		player2=null;
	}

	@Test
	public void testFleet1() {
		player.setPosition(1);
		int expected = player.getBalance() - 4000;
		fleet1.landOnField(player);
		int actual = player.getBalance();
		
		assertEquals("Price is not correct.", expected, actual);
	}
	
	@Test
	public void testFleet2() {
		player.setPosition(2);
		int expected = player.getBalance() + 6000;
		fleet2.landOnField(player);
		int actual = player.getBalance();
		
		assertEquals("Price is not correct.", expected, actual);
	}
	
	@Test
	public void testFleet3() {
		player.setPosition(1);
		int expected = player.getBalance();
		fleet3.landOnField(player);
		int actual = player.getBalance();
		
		assertEquals("Price is not correct.", expected, actual);
	}
	
	@Test
	public void testFleet4() {
		player.setPosition(1);
		
		int expected = player.getBalance() - 1;
		fleet4.landOnField(player);
		int actual = player.getBalance();
		
		assertEquals("Price is not correct.", expected, actual);
	}
	
	@Test
	public void testBuy3Fleets() {
		player.setPosition(1);
		player2.setPosition(2);
		
		int expected = player2.getBalance() - 2000;
		
		fleet1.landOnField(player);
		fleet2.landOnField(player);
		fleet3.landOnField(player);
		
		fleet1.landOnField(player2);
		
		int actual = player2.getBalance();
		
		assertEquals("Rent is not correct.", expected, actual);
	}
	

}
