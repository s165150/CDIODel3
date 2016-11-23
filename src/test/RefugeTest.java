import org.junit.*;

import game.*;

public class RefugeTest {

private Player player;

private Field refuge200;

private Field refuge0;

private Field refugeNeg200;

@Before

public void setUp() throws Exception {

this.player = new Player("Anders And", 1, 1000, 0);

this.refuge200 = new Refuge(1, "Helle +200", 200);

this.refuge0 = new Refuge(2, "Helle 0", 0);

this.refugeNeg200 = new Refuge(3, "Helle -200", -200);

}

@After

public void tearDown() throws Exception {

this.player = new Player("Anders And", 1, 1000);

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

int actual = this.player.getBalance();

Assert.assertEquals(expected, actual);

//Perform the action to be tested

this.refuge200.landOnField(this.player);

expected = 1000 + 200;

actual = this.player.getBalance();

Assert.assertEquals(expected, actual);

}

@Test

public void testLandOnField200Twice() {

int expected = 1000;

int actual = this.player.getBalance();

Assert.assertEquals(expected, actual);

//Perform the action to be tested

this.refuge200.landOnField(this.player);

this.refuge200.landOnField(this.player);

expected = 1000 + 200 + 200;

actual = this.player.getBalance();

Assert.assertEquals(expected, actual);

}

@Test

public void testLandOnField0() {

int expected = 1000;

int actual = this.player.getBalance();

Assert.assertEquals(expected, actual);