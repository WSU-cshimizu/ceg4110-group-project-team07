package StepDefinations;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class SearchLocation {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I am on the GeoSyncra homepage")
    public void i_am_on_the_geo_syncra_homepage() {
        // Set up ChromeDriver
    	System.setProperty("webdriver.gecko.driver", "/Users/prabeshbhattarai/Downloads/eclipse/CucumberJava/src/test/resources/drivers/geckodriver");
   	 driver = new FirefoxDriver();
   	 
   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Navigate to the Index page
        driver.get("https://geosyncra.netlify.app/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("I enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String location) {
        // Find the search bar and enter the location
        WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBar")));
        searchBar.sendKeys(location);
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        // Find and click the search button
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
    }

    @Then("I should see the results for {string}")
    public void i_should_see_the_results_for(String location) {
        // Wait for results to load (modify based on the actual implementation)
        WebElement results = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchResults"))); // Replace "searchResults" with actual result container ID

        // Verify the results contain the location text
        String resultsText = results.getText();
        assertTrue(resultsText.contains(location), "Expected location not found in search results!");

        // Close the browser
        driver.quit();
    }
}
