package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_04 {
    /*
        1. Visit https://www.amazon.com/
        3. Print size and position of the webpage
        4. Change the position and size of the page
        5. Test if the webpage is same with your settlements
        6. Close page
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //1. Visit https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Print size and position of the webpage
        System.out.println("size of the page :" + driver.manage().window().getSize());
        System.out.println("position of the page :" + driver.manage().window().getPosition());

        //4. Change the position and size of the page
        driver.manage().window().setSize(new Dimension(200,200));
        driver.manage().window().setPosition(new Point(100,100));

        //5. Test if the webpage is same with your settlements
        System.out.println("new size of the page :" + driver.manage().window().getSize() );
        System.out.println("new size of the page :" + driver.manage().window().getPosition() );

        //6. Close page
        driver.close();
    }
}
