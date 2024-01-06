package work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selena {
    public static void main(String[] args) {
        //Invoking browser
        //Chrome - ChromeDriver --> Methods close
        //Firefox - FirefoxDriver --> methods close
        //Safari - SafariDriver --> methods close get
        //same methods across drivers
       // WebDriver exposes some methods that are implemented in the drivers

        // chromedriver.exe --> Chrome Browser
        // this is called a middleman proxy

        //Selenium Manager - automatically grabs our .exe
        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new EdgeDriver();


        //Firefox Launch
        //geckodriver
        driver2.get("https://youtube.com/@berleezy");
        var title2 = driver2.getTitle();
        System.out.println(title2);
        System.out.println("Current FF URL: " + driver2.getCurrentUrl()+ "\n");
        driver2.close();



        //Chrome Launch
        driver.get("https://youtube.com/@berleezy");
        var title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current CB URL: " + driver.getCurrentUrl()+ "\n");
        driver.close();

        //Edge Launch
        driver3.get("https://youtube.com/@berleezy");
        var title3 = driver3.getTitle();
        System.out.println(title3);
        System.out.println("Current EDGE URL: " + driver3.getCurrentUrl());
        driver3.quit();


    }
}
