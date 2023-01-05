package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_02 {
            /*
            1. Visit YouTube webpage https://www.youtube.com/
            2. Visit Amazon webpage https://www.amazon.com/
            3. Turn back to Youtube webpage
            4. Visit Amazon webpage again
            5. Refresh page
            6. CLose all pages
             */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Visit YouTube webpage https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");

        //2. Visit Amazon webpage https://www.amazon.com/
        driver.get("https://www.amazon.com");


        //3. Turn back to Youtube webpage
        driver.navigate().back();


        //4. Visit Amazon webpage again
        driver.navigate().forward();

        //5. Refresh page
        driver.navigate().refresh();

        //6. CLose all pages
        driver.quit();
    }
}
