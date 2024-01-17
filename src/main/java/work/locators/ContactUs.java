package work.locators;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ContactUs {
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


    @Given("I access the webdriver university contact page")
    public void i_access_the_webdriver_university_contact_page() {
        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

    }
    @When("I enter a first name")
    public void i_enter_a_first_name()  {
        driver.findElement(By.cssSelector("[name=\"first_name\"]")).sendKeys("Jordan");

    }
    @And("I enter a last name")
    public void i_enter_a_last_name()  {
        driver.findElement(By.cssSelector("[name=\"last_name\"]")).sendKeys("Mitchell");

    }
    @And("I enter a email address")
    public void i_enter_a_email_address(){
        driver.findElement(By.name("email")).sendKeys("TheEmail@hotmail.com");

    }
    @And("I enter a comment")
    public void i_enter_a_comment() {
    driver.findElement(By.name("message")).sendKeys("Hello world");
    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
    driver.findElement(By.cssSelector("[value=\"SUBMIT\"]")).click();
    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        WebElement contactUs_sub_message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(contactUs_sub_message.getText(), "Thank You for your Message!");
    }



}
