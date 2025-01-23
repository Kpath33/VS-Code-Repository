package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo02 extends demo01 {
    @BeforeMethod
    public void setUp() {
        // Initialize a new ChromeDriver instance
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Set the path to the chromedriver executable
       // System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");

        // Initialize a new ChromeDriver instance
       // WebDriver driver = new ChromeDriver();


        // Navigate to a website
        driver.get("https://google.com");

        // Find an element by its name attribute
    /*     WebElement element = driver.findElement(By.xpath("//*[@id='input']"));
        // Perform actions on the element
        element.sendKeys("Selenium WebDriver");
        element.submit();
*/
        // Close the browser
        driver.quit();
    }
}