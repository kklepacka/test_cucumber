package testcscu4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

/**
 * Unit test for simple App.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty","json:target/json/results.json"},
    features = {"src/test/java/testcscu4"}
) 
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void logCS()
    {
        assertTrue( true );
    }
}
