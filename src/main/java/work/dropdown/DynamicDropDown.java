package work.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
      //choosin locations
        WebDriver driver = new ChromeDriver();

        driver.get("http://spicejet.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);



        //click from dropdown
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();

        //click on BLR
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[10]/div[1]/div[2]")).click();

        //click on TO dropdown
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")).click();

        //click on chennai
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[12]/div[1]/div[1]")).click();

    }
}
