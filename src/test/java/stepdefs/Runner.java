package stepdefs;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefs"}
        /*plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json"
        }*/
)


public class Runner extends AbstractTestNGCucumberTests {
}
