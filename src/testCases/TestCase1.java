/**
 * @author Morten N
 */

package testCases;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import game.*;

public class TestCase1 {
	
	//Define attributes for test
	GameBoard game = new GameBoard();
	private Player testPlayer1;
	private Player testPlayer2;
	
	
	
	//Precondition - Test case 1.1
	@Before
	public void setUp() throws Exception {
		testPlayer1 = new Player ("testPlayer1", 1, 1, 0);
		game.createGameBoard();
		
	}
	
	//Test - Test case 1.1
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Postcondation Test case 1.1
	@After
	public void after(){
		

	}

}
