package work.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        var actual = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
        var actual2 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
        System.out.println(actual + " " + actual2);

    }
}
