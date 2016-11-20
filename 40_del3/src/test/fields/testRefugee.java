package test.fields;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.entity.Player;
import spil.entity.field.Refugee;

public class testRefugee {

	private Refugee refugeeB3000;
	private Refugee refugeeB1000;
	private Player p1;

	@Before
	public void setUp() throws Exception {
		refugeeB3000 = new Refugee(3000);
		refugeeB3000 = new Refugee(1000);
		p1 = new Player("p1", 100000, 0, 30000, 0);

	}

	@After
	public void tearDown() throws Exception {
		refugeeB3000 = null;
		refugeeB1000 = null;
		p1 = null;

	}

	@Test
	public void refugeeB3000() {
		int bonus = 3000;
		int expected = p1.getBalance() + bonus;
		p1.setPosition(10);
		refugeeB3000.landOnField(p1);
		int actual = p1.getBalance();

		assertEquals("Player does not get af bonus of 3000 coins", expected, actual);
	}

}
