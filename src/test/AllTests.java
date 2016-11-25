/**
 * @author Morten N
 */

package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BalanceTest.class, ShakerTestFrequency.class, ShakerTestPairs.class })
public class AllTests {

}
