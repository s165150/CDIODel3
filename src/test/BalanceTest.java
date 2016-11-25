/**
 * @author Morten N
 */
package test;
import game.Player;
import static org.junit.Assert.*;
import org.junit.Test;

public class BalanceTest {

	@Test
	public void testBalance() 
	{
		//Define attributes for test
		Player testPlayer = new Player("Test Player", 1, 1, 1);
		
		//Print test type
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("This will test the balance requriments");
		System.out.println("-----------------------------------------------------------------------");
		
		//Set positive and negative test balance
		System.out.println("Balance start at 30000");
		System.out.println("getBalance returned " + testPlayer.getAccount().getBalance() + " points");
		assertTrue (testPlayer.getAccount().getBalance() >= 0);
		System.out.println();
		System.out.println("Balance plus 1000");
		testPlayer.getAccount().addBalance(1000);
		System.out.println("getBalance returned " + testPlayer.getAccount().getBalance() + " points");
		assertTrue (testPlayer.getAccount().getBalance() >= 0);
		System.out.println();
		System.out.println("Balance plus 9999");
		testPlayer.getAccount().addBalance(9999);
		System.out.println("getBalance returned " + testPlayer.getAccount().getBalance() + " points");
		assertTrue (testPlayer.getAccount().getBalance() >= 0);
		System.out.println();
		System.out.println("Balance minus -1000000");
		testPlayer.getAccount().addBalance(-1000000);
		System.out.println("getBalance returned " + testPlayer.getAccount().getBalance() + " points");
		assertTrue (testPlayer.getAccount().getBalance() >= 0);
		System.out.println();
		System.out.println("Balance plus 1234");
		testPlayer.getAccount().addBalance(1234);
		System.out.println("getBalance returned " + testPlayer.getAccount().getBalance() + " points");
		assertTrue (testPlayer.getAccount().getBalance() >= 0);
		System.out.println();
		System.out.println("Balance minus -10000");
		testPlayer.getAccount().addBalance(-10000);
		System.out.println("getBalance returned " + testPlayer.getAccount().getBalance() + " points");
		assertTrue (testPlayer.getAccount().getBalance() >= 0);
		System.out.println();
		System.out.println("Balance plus 2000");
		testPlayer.getAccount().addBalance(2000);
		System.out.println("getBalance returned " + testPlayer.getAccount().getBalance() + " points");
		assertTrue (testPlayer.getAccount().getBalance() >= 0);
	}

}
