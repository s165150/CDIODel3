package testCases;

import static org.junit.Assert.*;

import java.awt.Color;

import game.*;

import org.junit.*;
public class LandOnFieldTerritory {
	private GameBoard game = new GameBoard();
	private Player player;
	private MUI mui;
	private Shaker shake;
	private Field territory200;

	private Field territory0;

	private Field territoryNeg200;
	
	@Before
	public void setUp() throws Exception {

		this.player = new Player("Anders And", 1, 1, 0);
		player.getAccount().setBalance(1000);
		game.getPlayerlistArray().add(player);
		this.territory200 = new Territory("1. Helle", "Helle +200", null, null, null, 10, 1000, 100);
		game.getBoardFieldsArray().add(territory200);
		this.territory0 = new Territory("2. Helle", "Helle +200", null, null, null, 10, 1000, 100);
		game.getBoardFieldsArray().add(territory0);
		this.territoryNeg200 = new Territory("3. Helle", "Helle +200", null, null, null, 10, 1000, -200);
		game.getBoardFieldsArray().add(territoryNeg200);
		}
	
	
	@After

	public void tearDown() throws Exception {

	this.player = new Player("Anders And", 1, 1, 0);

	//The fields are unaltered

}

	@Test

	public void testEntities() {

	Assert.assertNotNull(this.player);

	Assert.assertNotNull(this.territory200);

	Assert.assertNotNull(this.territory0);

	Assert.assertNotNull(this.territory200);

	Assert.assertTrue(this.territory200 instanceof Territory);

	Assert.assertTrue(this.territory0 instanceof Territory);

	Assert.assertTrue(this.territoryNeg200 instanceof Territory);

	}
	
	@Test

	public void testLandOnField200() {

		int expected = 1000;

		int actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		//Perform the action to be tested

		this.territory200.landOnField(game, 0, 0, mui, shake);

		expected = 1000 + 200;

		actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);
	
	}

	@Test

	public void testLandOnField200Twice() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	this.territory200.landOnField(game, 0, 0, mui, shake);

	this.territory200.landOnField(game, 0, 0, mui, shake);

	expected = 1000 + 200 + 200;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnField0() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	//Perform the action to be tested

	this.territory0.landOnField(game, 0, 0, mui, shake);

	expected = 1000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnField0Twice() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	this.territory0.landOnField(game, 0, 0, mui, shake);

	this.territory0.landOnField(game, 0, 0, mui, shake);

	expected = 1000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnFieldNeg200() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	this.territoryNeg200.landOnField(game, 0, 0, mui, shake);

	//It is not possible to deposit a negative amount

	expected = 1000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnFieldNeg200Twice() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	this.territoryNeg200.landOnField(game, 0, 0, mui, shake);

	this.territoryNeg200.landOnField(game, 0, 0, mui, shake);

	//It is still not possible to deposit a negative amount

	expected = 1000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	}
