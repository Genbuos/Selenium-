package work.locators;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

    WebDriver driver = new ChromeDriver();



    public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();

            //solves sync issue
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.id("inputUsername")).sendKeys("Jordy");
            driver.findElement(By.name("inputPassword")).sendKeys("bin44444");
            driver.findElement(By.className("submit")).click();
            //this causes sync issues
            System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
            driver.findElement(By.linkText("Forgot your password?")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jordy");
            driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("studyoverhoes@2001.com");
            driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
            driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Jordy");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("#chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();







    }
}
