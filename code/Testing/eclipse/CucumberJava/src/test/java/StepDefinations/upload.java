package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class upload {
    WebDriver driver;

    @Given("I am on the upload page")
    public void i_am_on_the_upload_page() {
        System.setProperty("webdriver.geko.driver", "/CucumberJava/src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://geosyncraa.netlify.app/upload"); 
    }

    @When("I fill in the form with valid data")
    public void i_fill_in_the_form_with_valid_data() {
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("description")).sendKeys("A sample image");
        driver.findElement(By.id("location")).sendKeys("New York");

        // Mock file upload
        WebElement fileInput = driver.findElement(By.id("imageFile"));
        fileInput.sendKeys("/Users/prabeshbhattarai/Downloads/CucumberJava/texas.webp");
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        WebElement statusMessage = driver.findElement(By.id("uploadStatus"));
        assertEquals("Upload successful", statusMessage.getText());

        driver.quit();
    }
}