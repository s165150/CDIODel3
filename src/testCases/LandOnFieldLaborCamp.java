package testCases;

import static org.junit.Assert.*;

import java.awt.Color;

import game.*;

import org.junit.*;
public class LandOnFieldLaborCamp {
	private GameBoard game = new GameBoard();
	private Player player;
	private MUI mui;
	private Field laborCamp;
	private int ownedLaborCamps;
	private int shakeValue;

	@Before

	public void setUp() throws Exception {

	this.player = new Player("Anders And", 1, 1, 0);
	player.getAccount().setBalance(1000);
	game.getPlayerlistArray().add(player);
	this.laborCamp = new LaborCamp("1. Arbejdslejr", "Arbejdslejren +100", null, null, null, 10, 1000, 100);
	game.getBoardFieldsArray().add(laborCamp);
	
	}

	@After

	public void tearDown() throws Exception {

	this.player = new Player("Anders And", 1, 1, 0);

	//The fields are unaltered

	}

	@Test

	public void testEntities() {

	Assert.assertNotNull(this.player);

	Assert.assertNotNull(this.laborCamp);

	Assert.assertTrue(this.laborCamp instanceof LaborCamp);

	}

	@Test

	public void testLandOnFieldShaker12Owned1() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	shakeValue = 12;
	ownedLaborCamps = 1;
	this.player.getAccount().addBalance((((LaborCamp)laborCamp).getRent()*shakeValue*ownedLaborCamps));

	expected = 1000 + 1200;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	
	}
	
	@Test

	public void testLandOnFieldShaker12Owned2() {

	int expected = 1000;

	int actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	shakeValue = 12;
	ownedLaborCamps = 2;
	this.player.getAccount().addBalance((((LaborCamp)laborCamp).getRent()*shakeValue*ownedLaborCamps));

	expected = 1000 + 2400;

	actual = this.player.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	
	}

	}
