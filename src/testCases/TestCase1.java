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
		
		//Create Gamboard, testPlayer1 and set field to not owned
		game.createGameBoard();
		testPlayer1 = new Player ("testPlayer1", 1, 1, 0);
		((Ownable)game.getBoardFieldsArray().get(2)).getOwner();
		
		//Assert
		assertEquals(10, ((Ownable)game.getBoardFieldsArray().get(2)).getOwner());
		
	}
	
	//Test - Test case 1.1
	@Test
	public void test() {
		
		//testPlayer1 buy the field and pay for the field
		((Ownable)game.getBoardFieldsArray().get(2).
	}
	
	//Postcondition Test case 1.1
	@After
	public void after(){
		

	}

}
