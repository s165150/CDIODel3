package testCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LandOnFieldFleet.class, LandOnFieldLaborCamp.class, LandOnFieldRefuge.class, LandOnFieldTax.class,
		LandOnFieldTerritory.class, TestCase1.class, TestCase2.class, TestCase3.class })
public class AllTestCases {

}
