package testCases;

import org.junit.*;

import game.Field;
import game.Game;
import game.GameBoard;
import game.LaborCamp;
import game.MUI;
import game.Player;

public class TestCase3 {


	//Define attributes for test
	private GameBoard game = new GameBoard();
	private Player testPlayer1;
	private Player testPlayer2;
	private Field laborCamp;
	private int ownedLaborCamps;
	private int shakeValue;
	private LaborCamp testField;
	
	//Precondition
	@Before
	public void setUp(){
		//Create playerArray, testPlayer1 and adding him to the array and set field to not owned
		testPlayer1 = new Player ("testPlayer1", 1, 1, 0);
		testPlayer1.getAccount().setBalance(2000);
		game.getPlayerlistArray().add(testPlayer1);
		testPlayer2 = new Player ("testPlayer2", 2, 2, 0);
		testPlayer2.getAccount().setBalance(2000);		
		game.getPlayerlistArray().add(testPlayer2);
		testField = new LaborCamp("1. Arbejdslejr", "Arbejdslejren +100", null, null, null, 10, 1000, 100);

	}
	//Test
	@Test
	public void testLandingOnLaborCamp(){
		
		shakeValue = 12;
		ownedLaborCamps = 1;
		this.testPlayer1.getAccount().addBalance((testField.getRent()*shakeValue*ownedLaborCamps));
		
		int expected = 2000 + 1200;
		int actual = testPlayer1.getAccount().getBalance();
		Assert.assertEquals(expected, actual);
		
		testPlayer2.getAccount().addBalance(-(testField.getRent()*shakeValue*ownedLaborCamps));
		int expectedOwner = 2000 - 1200;
		int actualOwner = testPlayer2.getAccount().getBalance();
		Assert.assertEquals(expectedOwner, actualOwner);
		
	}
	
	//Postcondition
	@After
	public void after() throws Exception{


	
	}

}
