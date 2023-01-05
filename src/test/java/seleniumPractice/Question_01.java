package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_01 {
    /*
            1. Visit https://www.amazon.com/ webpage
            2. Print title of the WebPage
            3. Test if page title contains "Amazon"
            4. Print page adress (url)
            5. Test if page url contains "www.amazon.com"
            6. Print page handle value
            7. Test if page HTML codes contains "Shop"
            8. Close page
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Visit https://www.amazon.com/ webpage
        driver.get("https://www.amazon.com/");

        // 2. Print title of the WebPage
        System.out.println(driver.getTitle());

        // 3. Test if page title contains "Amazon"
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        } else
            System.out.println("Test FAILED");

        // 4. Print page adress (url)
        System.out.println(driver.getCurrentUrl());

        // 5. Test if page url contains "Amazon"
        String expectedUrl = "www.amazon.com";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        } else
            System.out.println("Test FAILED");

        //6. Print page handle value
        System.out.println(driver.getWindowHandle());

        //7. Test if page HTML codes contains "Shop"

        String pageSource = driver.getPageSource();
        String expectedWord = "Shop";

        if (pageSource.contains(expectedWord)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        // 8. Close page
        driver.close();
    }
}
