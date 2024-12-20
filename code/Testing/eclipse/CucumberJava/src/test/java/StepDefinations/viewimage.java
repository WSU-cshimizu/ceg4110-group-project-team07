package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class viewimage {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I am on the Index page")
    public void iAmOnTheIndexPage() {
        
    	System.setProperty("webdriver.gecko.driver", "/Users/prabeshbhattarai/Downloads/eclipse/CucumberJava/src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();

        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Navigate to the Index page
        driver.get("https://geosyncra.netlify.app");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("I click on the {string} link")
    public void iClickOnTheLink(String linkText) {
        try {
            // Use XPath to find the link text dynamically, ignoring trailing/leading spaces
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + linkText.trim() + "')]")));
            link.click();
        } catch (TimeoutException e) {
            // Debug: Print all links to identify issues
            System.out.println("Available links:");
            driver.findElements(By.tagName("a")).forEach(link -> System.out.println(link.getText()));
            throw new AssertionError("Link with text '" + linkText + "' not found or clickable.");
        }
    }


    @Then("I should be redirected to the Random Images page")
    public void iShouldBeRedirectedToTheRandomImagesPage() {
        try {
            // Wait for URL to change (use expected URL or dynamic validation)
            String expectedUrl = "https://geosyncra.netlify.app/randomimages"; // Update this to match the actual deployment URL
            String actualUrl = wait.until(driver -> driver.getCurrentUrl());
            
            // Validate the URL
            if (!actualUrl.equals(expectedUrl)) {
                throw new AssertionError("Expected URL: " + expectedUrl + ", but got: " + actualUrl);
            }
        } catch (TimeoutException e) {
            throw new AssertionError("Timeout while waiting for redirection to the Random Images page.");
        }
    }


    @When("I click on the {string} button")
    public void iClickOnTheButton(String buttonText) {
        try {
            // Wait for the button to be clickable with longer timeout
            WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='" + buttonText + "']")));
            
            // Wait until the element is clickable
            WebDriverWait clickableWait = new WebDriverWait(driver, Duration.ofSeconds(20));
            clickableWait.until(ExpectedConditions.elementToBeClickable(button));
            
            button.click();
        } catch (TimeoutException e) {
            throw new AssertionError("Button with text '" + buttonText + "' not found or not clickable.");
        }
    }


    @Then("the image should be displayed in the image container")
    public void theImageShouldBeDisplayedInTheImageContainer() {
        // Verify that the image is displayed in the container
        WebElement imageContainer = driver.findElement(By.id("imageContainer"));
        WebElement image = imageContainer.findElement(By.tagName("img"));

        if (!image.isDisplayed()) {
            throw new AssertionError("Image is not displayed in the container.");
        }
    }

    @When("I close the gallery")
    public void iCloseTheGallery() {
        // Close the gallery (assuming there's a close button or similar element)
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("closeGalleryButton")));
        closeButton.click();
    }

    @Then("the image container should be empty")
    public void theImageContainerShouldBeEmpty() {
        // Verify the image container is empty
        WebElement imageContainer = driver.findElement(By.id("imageContainer"));

        if (!imageContainer.getText().isEmpty() || !imageContainer.findElements(By.tagName("img")).isEmpty()) {
            throw new AssertionError("Image container is not empty.");
        }
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
