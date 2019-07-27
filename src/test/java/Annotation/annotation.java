package Annotation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class annotation {
    WebDriver driver = null;

    @Given("^I am go to the home page$")
    public void goToSite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I search goods with name \"(.*)\"$")
    public void searchGoodsName(String arg1) {
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(arg1);
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='heading-counter']")));
        Assert.assertTrue("Smth wrong when user searches goods", driver.findElement(By.xpath("//span[@class='heading-counter']")).getText().contains("been found.") );
    }

    @Then("^I am close the browser page$")
    public void iAmCloseTheBrowserPage() {
        // Use sleep method to debug only
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().deleteAllCookies();
        driver.close();
    }

    @When("I am on the contact_us page")
    public void iAmOnTheContact_usPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='contact-link']")));
        driver.findElement(By.xpath("//div[@id='contact-link']")).click();
        Assert.assertEquals("We couldn't open the \"Contact Us\" page ", "Contact us - My Store", driver.getTitle());
    }
}