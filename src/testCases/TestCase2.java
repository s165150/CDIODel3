/**
 * @author Morten N
 */

package testCases;
import game.*;
import org.junit.*;

public class TestCase2 {
	
	//Define attributes for test
	private Player testPlayer1;
	private GameBoard game = new GameBoard();
	
	//Precondition
	@Before
	public void setUp(){
		//Create playerArray, testPlayer1 and adding him to the array and set field to not owned
		testPlayer1 = new Player ("testPlayer1", 0, 1, 0);
		testPlayer1.getAccount().setBalance(2000);
		game.getPlayerlistArray().add(testPlayer1);
		testPlayer1.setPosition(21);

	}
	//Test
	@Test
	public void testMove(){
		
		testPlayer1.setPosition(1);
		int expectedPosition = 1;
		int actualPosition = testPlayer1.getPosition();
		Assert.assertEquals(expectedPosition, actualPosition);
		
	}
	
	//Postcondition
	@After
	public void after() throws Exception{


	
	}

}
