package StepDefinations;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to the feature files
        glue = "stepdefinitions", // Package containing step definitions
        plugin = {"pretty", "html:target/cucumber-reports"}, // Reporting options
        monochrome = true // Makes console output more readable
)
public class TestRunner {
}
