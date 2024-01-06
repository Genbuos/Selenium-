package work;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {



    @Given("I access the Academy's page")
    public void i_access_the_academy_s_page() {

    }
    @When("I enter an username")
    public void i_enter_an_username() {

    }
    @And("I enter  a password")
    public void i_enter_a_password() {

    }
    @And("I click the submit button")
    public void i_click_the_submit_button() {

    }
    @Then("I should be presented with a successful Signed in message")
    public void i_should_be_presented_with_a_successful_signed_in_message() {

    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

            //solves sync issue
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.id("inputUsername")).sendKeys("jordy");
            driver.findElement(By.name("inputPassword")).sendKeys("bin44444");
            driver.findElement(By.className("submit")).click();
            //this causes sync issues
            System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
            driver.findElement(By.linkText("Forgot your password?")).click();





    }
}
