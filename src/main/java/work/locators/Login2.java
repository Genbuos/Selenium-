package work.locators;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Login2 {
    WebDriver driver = new ChromeDriver();

    @Given("I access the Academy's page")
    public void i_access_the_academy_s_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }
    @When("I enter an username")
    public void i_enter_an_username() {
        driver.findElement(By.id("inputUsername")).sendKeys("jordy");

    }
    @And("I enter  a password")
    public void i_enter_a_password() {
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

    }
    @And("I click the submit button")
    public void i_click_the_submit_button() {
        driver.findElement(By.className("submit")).click();

    }
    @Then("I should be presented with a successful Signed in message")
    public void i_should_be_presented_with_a_successful_signed_in_message() throws InterruptedException {
        Thread.sleep(1000);

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello Jordy,");
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //solves sync issue
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       var password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Jordy");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
         driver.findElement(By.className("submit")).click();
         Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");

        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

        driver.close();

    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        var passwordTxt = driver.findElement(By.cssSelector("form p")).getText();
       String[] pwArray = passwordTxt.split("'");
       var password = pwArray[1].split("'")[0];

       return password;


    }
}
