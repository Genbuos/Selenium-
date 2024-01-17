package work.dropdown;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class StaticDropDown2 {
    private WebDriver driver;

    @Before
    public void setUp(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }


    @Given("I access the spicejet page")
    public void i_access_the_spicejet_page() {
        driver.get("https://spicejet.com");
    }
    @When("I select the passenger drop down")
    public void i_select_the_passenger_drop_down() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[1]")).click();
    }
    @And("I add to more adults")
    public void i_add_to_more_adults() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();    }
    @And("I click done")
    public void i_click_done() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
    }
    @Then("I should should have 3 adults in the passenger div")
    public void i_should_should_have_adults_in_the_passenger_div() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]/div[1]")).getText(), "3 Adults");

    }

    public static void main(String[] args) {
        //choosing 3 adults
        WebDriver driver = new ChromeDriver();

        driver.get("https://spicejet.com");
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[1]")).click();

        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();

    }
}
