package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.boundary.GUIBoundary;
import spil.boundary.TextBoundary;
import spil.entity.DiceCup;
import spil.entity.GameBoard;
import spil.entity.Player;
import spil.entity.PlayerList;

public class testSICKBUG {

	private DiceCup diceCup;
	private PlayerList playerList;
	private GameBoard gameBoard;
	private Player p1;
	private Player p2;

	@Before
	public void setUp() throws Exception {
		diceCup = new DiceCup(2, 6);
		gameBoard = new GameBoard();
		gameBoard.initFields();

		p1 = new Player("Player 1", 100000, 0, 30000, 0);
		p2 = new Player("Player 2", 100000, 0, 30000, 0);
	}

	@After
	public void tearDown() throws Exception {
		diceCup = null;
		gameBoard = null;
		p1 = null;
		p2 = null;
	}

	@Test
	public void testBug() {
		// KØB 3 FELTER!
		p1.setPosition(10);
		gameBoard.landOnField(p1);

		p1.setPosition(5);
		gameBoard.landOnField(p1);

		p1.setPosition(3);
		gameBoard.landOnField(p1);

		// KILL P1
		p1.removeBalance(Integer.MAX_VALUE);
		System.out.println(p1.getBalance());

		if (p1.isBankrupt()) {

			GUIBoundary.print(TextBoundary.removePlayerMessage(p1));
			gameBoard.deleteFieldOwners(p1);
		}

		// test :)
		p2.setPosition(10);
		gameBoard.landOnField(p2);
	}

}
