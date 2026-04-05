package main.java.com.bjsxt.cucumberTest.steps;

import dev.failsafe.internal.util.Durations;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LemoSteps {
    static FirefoxDriver driver = null;

    static {
       // System.setProperty("webdriver.chrome.driver","E:\\CucumberTest\\src\\main\\resources\\chromedriver.exe");
        //driver = new ChromeDriver();

       // System.setProperty("webdriver.ie.driver", "E:\\CucumberTest\\src\\main\\resources\\IEDriverServer.exe");
        //driver = new InternetExplorerDriver();

        //System.setProperty("webdriver.firefox.marionette","E:\\CucumberTest\\src\\main\\resources\\geckodriver.exe");
        //driver = new FirefoxDriver();
    }

    @Given("openBadu Page")
    public void open_badu_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //driver.get("https://www.baidu.com");
        Thread.sleep(2000);
        System.out.println("-----------------执行这里--------------------");


    }

    @When("input {string}")
    public void input(String query) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("-----------------执行这里-1233-------------------");
        WebElement element = driver.findElement(By.name("wd"));
        element.sendKeys(query);
        element.submit();

    }

    @Then("show  {string}")
    public void show(String title) {
        // Write code here that turns the phrase above into concrete actions
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[text()='"+title+"']")));

    }

    @After()
    public void closeBrowser() throws Exception{
        Thread.sleep(3000);
       //driver.quit();
    }

}
