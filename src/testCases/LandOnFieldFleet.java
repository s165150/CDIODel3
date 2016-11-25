package testCases;

import static org.junit.Assert.*;

import java.awt.Color;

import game.*;

import org.junit.*;
public class LandOnFieldFleet {
	private GameBoard game = new GameBoard();
	private Player player;
	private MUI mui;
	private Shaker shake;
	private Field fleet1;

	private Field fleet0;

	private Field fleet4;
	
	@Before
	public void setUp() throws Exception {

		this.player = new Player("Anders And", 1, 1, 0);
		player.getAccount().setBalance(1000);
		game.getPlayerlistArray().add(player);
		this.fleet0 = new Fleet("1. Fleet", "Fleet 0", null, null, null, 1, 0);
		game.getBoardFieldsArray().add(fleet0);
		this.fleet1 = new Fleet("2. Fleet", "Fleet 1", null, null, null, 1, 0);
		game.getBoardFieldsArray().add(fleet1);
		this.fleet4 = new Fleet("3. Fleet", "Fleet 4", null, null, null, 1, 0);
		game.getBoardFieldsArray().add(fleet4);

		}
	
	
	@After

	public void tearDown() throws Exception {

	this.player = new Player("Anders And", 1, 1, 0);

	//The fields are unaltered

}

	@Test

	public void testEntities() {

	Assert.assertNotNull(this.player);

	Assert.assertNotNull(this.fleet0);

	Assert.assertTrue(this.fleet0 instanceof Fleet);

	}


	@Test

	public void testLandOnField0() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	//Perform the action to be tested

	this.player.setOwnedFleets(0);
	((Fleet)fleet0).getRent();
	this.player.getAccount().addBalance(((Fleet)fleet0).getRent());

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

	this.player.getAccount().addBalance(((Fleet)fleet0).getRent());

	this.player.getAccount().addBalance(((Fleet)fleet0).getRent());

	expected = 1000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}
	
	@Test

	public void testLandOnField1() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	//Perform the action to be tested

	int ownedFleets = 1;
	((Fleet)fleet1).getRentTest(ownedFleets);
	this.player.getAccount().addBalance(((Fleet)fleet1).getRentTest(ownedFleets));

	expected = 1500;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}
	
	@Test

	public void testLandOnField1Twice() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	//Perform the action to be tested

	int ownedFleets = 1;
	((Fleet)fleet1).getRentTest(ownedFleets);
	this.player.getAccount().addBalance(((Fleet)fleet1).getRentTest(ownedFleets));
	this.player.getAccount().addBalance(((Fleet)fleet1).getRentTest(ownedFleets));
	expected = 2000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}
	
	@Test

	public void testLandOnField4() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	//Perform the action to be tested

	int ownedFleets = 4;
	((Fleet)fleet4).getRentTest(ownedFleets);
	this.player.getAccount().addBalance(((Fleet)fleet4).getRentTest(ownedFleets));

	expected = 5000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}
	
	@Test

	public void testLandOnField4Twice() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	//Perform the action to be tested

	int ownedFleets = 4;
	((Fleet)fleet4).getRentTest(ownedFleets);
	this.player.getAccount().addBalance(((Fleet)fleet4).getRentTest(ownedFleets));
	this.player.getAccount().addBalance(((Fleet)fleet4).getRentTest(ownedFleets));
	expected = 9000;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

}
