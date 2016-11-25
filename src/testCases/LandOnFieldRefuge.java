package testCases;

import static org.junit.Assert.*;

import java.awt.Color;

import game.*;

import org.junit.*;
public class LandOnFieldRefuge {
	private GameBoard game = new GameBoard();
	private Player player;
	private MUI mui;
	private Shaker shake;
	private Field refuge200;

	private Field refuge0;

	private Field refugeNeg200;

	@Before

	public void setUp() throws Exception {

	this.player = new Player("Anders And", 1, 1, 0);
	player.getAccount().setBalance(1000);
	game.getPlayerlistArray().add(player);
	this.refuge200 = new Refuge("1. Helle", "Helle +200", null, null, null, 200);
	game.getBoardFieldsArray().add(refuge200);
	this.refuge0 = new Refuge("2. Helle", "Helle +200", null, null, null, 0);
	game.getBoardFieldsArray().add(refuge0);
	this.refugeNeg200 = new Refuge("3. Helle", "Helle +200", null, null, null, -200);
	game.getBoardFieldsArray().add(refugeNeg200);
	}

	@After

	public void tearDown() throws Exception {

	this.player = new Player("Anders And", 1, 1, 0);

	//The fields are unaltered

	}

	@Test

	public void testEntities() {

	Assert.assertNotNull(this.player);

	Assert.assertNotNull(this.refuge200);

	Assert.assertNotNull(this.refuge0);

	Assert.assertNotNull(this.refugeNeg200);

	Assert.assertTrue(this.refuge200 instanceof Refuge);

	Assert.assertTrue(this.refuge0 instanceof Refuge);

	Assert.assertTrue(this.refugeNeg200 instanceof Refuge);

	}

	@Test

	public void testLandOnField200() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	this.refuge200.landOnField(game, 0, 0, mui, shake);;

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

	this.refuge200.landOnField(game, 0, 0, mui, shake);

	this.refuge200.landOnField(game, 0, 0, mui, shake);

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

	this.refuge0.landOnField(game, 0, 0, mui, shake);

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

	this.refuge0.landOnField(game, 0, 0, mui, shake);

	this.refuge0.landOnField(game, 0, 0, mui, shake);

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

	this.refugeNeg200.landOnField(game, 0, 0, mui, shake);

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

	this.refugeNeg200.landOnField(game, 0, 0, mui, shake);

	this.refugeNeg200.landOnField(game, 0, 0, mui, shake);

	//It is still not possible to deposit a negative amount

	expected = 1000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	}
