/**
 * @author Morten N
 */

package testCases;


import java.awt.Color;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import game.*;
import org.junit.*;

public class TestCase1 {
	
	//Define attributes for test
	private Player testPlayer1;
	private Player testPlayer2;
	private Territory testField;
	private MUI mui;
	private GameBoard game = new GameBoard();
	
	//Precondition - Test case 1
	@Before
	public void setUp(){
		//Create playerArray, testPlayer1 and adding him to the array and set field to not owned
		testPlayer1 = new Player ("testPlayer1", 0, 1, 0);
		testPlayer1.getAccount().setBalance(2000);
		game.getPlayerlistArray().add(testPlayer1);
		testField = new Territory("TitleTest", "TitleTest Description", "ValueTest: 1000", "icons/Tribe_Encampment.png", Color.WHITE, 10, 1000, 100);
		game.getBoardFieldsArray().add(testField);
		testPlayer2 = new Player ("testPlayer2", 1, 2, 0);
		testPlayer2.getAccount().setBalance(2000);
		game.getPlayerlistArray().add(testPlayer2);
	}
	//Test - Test case 1.1
	@Test
	public void testBuying(){
		testField.setOwner(testPlayer1.getPlayerNumber());
		testPlayer1.getAccount().addBalance(-testField.getPrice());
		
		int expectedOwner = testField.getOwner();
		int actualOwner = testPlayer1.getPlayerNumber();
		Assert.assertEquals(expectedOwner, actualOwner);
		int expectedValue = 2000 - 1000;
		int actualValue = testPlayer1.getAccount().getBalance();
		Assert.assertEquals(expectedValue, actualValue);
	}
	//Test - Test case 1.2
	@Test
	public void testLanding()
	{
		testBuying();
		testField.payRent(testField.getRent(), game, 1);
		testField.receiveRent(testField.getRent(), game);
		
		int expectedValue = 2000 - 100;
		int actualValue = testPlayer2.getAccount().getBalance();
		Assert.assertEquals(expectedValue, actualValue);
		
		int expectedValueOwner = 1000 + 100;
		int actualValueOwner = testPlayer1.getAccount().getBalance();
		Assert.assertEquals(expectedValueOwner, actualValueOwner);
	}
	//Postcondition
	@After
	public void after() throws Exception{


	
	}

}
