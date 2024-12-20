package StepDefinations;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class comment {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I am on the comments page")
    public void i_am_on_the_comments_page() {
        // Set up ChromeDriver
    	System.setProperty("webdriver.gecko.driver", "/Users/prabeshbhattarai/Downloads/eclipse/CucumberJava/src/test/resources/drivers/geckodriver");
    	 driver = new FirefoxDriver();
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();

         // Navigate to the Index page
         driver.get("https://geosyncra.netlify.app/comment.html?imageId=6");
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("I enter {string} in the comment box")
    public void i_enter_in_the_comment_box(String commentText) {
        // Find the comment text box and enter the provided text
        WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("commentText")));
        commentBox.sendKeys(commentText);
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() {
        // Find and click the submit button
        WebElement submitButton = driver.findElement(By.cssSelector("#commentForm button[type='submit']"));
        submitButton.click();
    }

    @Then("I should see {string} in the comments section")
    public void i_should_see_in_the_comments_section(String expectedComment) {
        // Wait for the comment to appear in the comments list
        WebElement commentsList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("commentsList")));
        boolean commentFound = commentsList.getText().contains(expectedComment);
        
        // Assert the comment is displayed
        assertTrue(commentFound, "Expected comment not found in the comments section!");
        
        // Close the browser
        driver.quit();
    }
}
