package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

    public static void main(String[] args) throws InterruptedException {

        String exepath = "C:\\Chromedriver\\Chromedriver79.exe";
        // Executing chrome driver
        System.setProperty("webdriver.chrome.driver",exepath);

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("http://www.shop.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        Thread.sleep(10000);
        //Wait for 5 Sec
        Thread.sleep(5000);

        // Close the driver
        driver.quit();
    }
}
