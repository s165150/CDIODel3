package testCases;

import static org.junit.Assert.*;

import java.awt.Color;

import game.*;

import org.junit.*;
public class LandOnFieldTax {
	private GameBoard game = new GameBoard();
	private Player player1;
	private Player player2;
	private MUI mui;
	private Shaker shake;
	private Field tax300;

	private Field tax10percent;

	private Field taxNeg200;

	@Before

	public void setUp() throws Exception {

	this.player1 = new Player("Anders And", 1, 1, 0);
	player1.getAccount().setBalance(1000);
	game.getPlayerlistArray().add(player1);
	this.player2 = new Player("Andersine And", 2, 2, 0);
	player2.getAccount().setBalance(1000);
	game.getPlayerlistArray().add(player2);
	this.tax300 = new Tax("1. Skat", "Skat 300", null, null, null, 300, 300);
	game.getBoardFieldsArray().add(tax300);
	this.tax10percent = new Tax("2. Skat", "Skat 10%", null, null, null, 0, 0.10);
	game.getBoardFieldsArray().add(tax10percent);
	this.taxNeg200 = new Tax("3. Skat", "Skat -300", null, null, null, -200, -200);
	game.getBoardFieldsArray().add(taxNeg200);
	}

	@After

	public void tearDown() throws Exception {

	this.player1 = new Player("Anders And", 1, 1, 0);
	this.player2 = new Player("Andersine And", 2, 2, 0);

	//The fields are unaltered

	}

	@Test

	public void testEntities() {

	Assert.assertNotNull(this.player1);
	
	Assert.assertNotNull(this.player2);

	Assert.assertNotNull(this.tax300);

	Assert.assertNotNull(this.tax10percent);

	Assert.assertNotNull(this.taxNeg200);

	Assert.assertTrue(this.tax300 instanceof Tax);

	Assert.assertTrue(this.tax10percent instanceof Tax);

	Assert.assertTrue(this.taxNeg200 instanceof Tax);

	}

	@Test

	public void testLandOnField300() {

	int expected = 1000;

	int actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	((Tax)game.boardFields.get(0)).payTaxAmount(game, 0, 0);

	expected = 1000 - 300;

	actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnField300Twice() {

	int expected = 1000;

	int actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	((Tax)game.boardFields.get(0)).payTaxAmount(game, 0, 0);

	((Tax)game.boardFields.get(0)).payTaxAmount(game, 0, 0);

	expected = 1000 - 300 - 300;

	actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnField10percent() {

	int expected = 1000;

	int actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	//Perform the action to be tested

	((Tax)game.boardFields.get(1)).payTaxRate(game, 1, 0);

	expected = 1000 - 100;

	actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnField10percentTwice() {

	int expected = 1000;

	int actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	((Tax)game.boardFields.get(1)).payTaxRate(game, 1, 0);

	((Tax)game.boardFields.get(1)).payTaxRate(game, 1, 0);

	expected = 1000 - 100 - 90;

	actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnFieldNeg300() {

	int expected = 1000;

	int actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	((Tax)game.boardFields.get(0)).payTaxAmount(game, 2, 0);

	//It is not possible to deposit a negative amount

	expected = 1000;

	actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	@Test

	public void testLandOnFieldNeg300Twice() {

	int expected = 1000;

	int actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	//Perform the action to be tested

	((Tax)game.boardFields.get(0)).payTaxAmount(game, 2, 0);
	((Tax)game.boardFields.get(0)).payTaxAmount(game, 2, 0);

	//It is still not possible to deposit a negative amount

	expected = 1000;

	actual = this.player1.getAccount().getBalance();

	Assert.assertEquals(expected, actual);

	}

	}
