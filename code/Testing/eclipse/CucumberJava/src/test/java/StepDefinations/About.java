package StepDefinations;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class About {

    WebDriver driver;

    @Given("I am on the About page")
    public void iAmOnTheAboutPage() {
    	System.setProperty("webdriver.gecko.driver", "/Users/prabeshbhattarai/Downloads/eclipse/CucumberJava/src/test/resources/drivers/geckodriver");
    	driver = new FirefoxDriver();
        driver.get("https://geosyncra.netlify.app/about"); 
    }

    @Then("I should see the title {string}")
    public void iShouldSeeTheTitle(String expectedTitle) {
        WebElement titleElement = driver.findElement(By.cssSelector(".title h3"));
        Assert.assertEquals("Title mismatch!", expectedTitle, titleElement.getText());
    }

    @Then("I should see the {string} section with its content")
    public void iShouldSeeTheSectionWithItsContent(String section) {
        WebElement aboutSection = driver.findElement(By.id("about"));
        Assert.assertTrue(
            "About section content is missing!",
            aboutSection.getText().contains("GeoSyncra helps people connect with others")
        );
    }

    @Then("I should see a navigation bar with links to other pages")
    public void iShouldSeeANavigationBarWithLinksToOtherPages() {
        WebElement navBar = driver.findElement(By.cssSelector(".navBar nav"));
        Assert.assertNotNull("Navigation bar is missing!", navBar);
        Assert.assertTrue(
            "Expected links are missing!",
            navBar.getText().contains("Viewpage") &&
            navBar.getText().contains("Upload") &&
            navBar.getText().contains("Home")
        );
    }

    @Then("the clock should display the current time")
    public void theClockShouldDisplayTheCurrentTime() {
        WebElement clockElement = driver.findElement(By.id("clock"));
        Assert.assertNotNull("Clock is not displayed!", clockElement.getText());
    }

    @Then("I should see a placeholder image")
    public void iShouldSeeAPlaceholderImage() {
        WebElement imageElement = driver.findElement(By.cssSelector(".photo img"));
        Assert.assertNotNull("Image is missing!", imageElement);
        Assert.assertTrue(
            "Image source is incorrect!",
            imageElement.getAttribute("src").contains("dummyPhoto.jpg")
        );
    }
}
