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
	
	//Precondition - Test case 1.1
	@Before
	public void setUp(){
		
		//Create Gamboard, testPlayer1 and set field to not owned
		testPlayer1 = new Player ("testPlayer1", 1, 1, 0);
		testPlayer1.getAccount().setBalance(2000);
		Territory testField = new Territory("TitleTest", "TitleTest Description", "ValueTest: 1000", "icons/Tribe_Encampment.png", Color.WHITE, 10, 1000, 100);

	}
	//Test - Test case 1.1
	@Test
	public void test(){

		testField.setOwner(testPlayer1.getPlayerNumber());
		testField.payRent(testField.getPrice(), testPlayer1.getAccount(), testPlayer1.getPlayerNumber());
	}
	
	//Postcondition Test case 1.1
	@After
	public void after() throws Exception{

		int expectedOwner = testField.getOwner();
		int actualOwner = testPlayer1.getPlayerNumber();
		Assert.assertEquals(expectedOwner, actualOwner);
		int expectedValue = 2000 - 1000;
		int actualValue = testPlayer1.getAccount().getBalance();
		Assert.assertEquals(expectedValue, actualValue);
	
	}

}
