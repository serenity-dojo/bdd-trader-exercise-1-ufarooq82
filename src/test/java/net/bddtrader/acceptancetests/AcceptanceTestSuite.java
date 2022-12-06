package net.bddtrader.acceptancetests;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "net.bddtrader.acceptancetests",
        featurers = "classpath:features",
        Plugin = {"pretty"}

)

public class AcceptanceTestSuite {
}
