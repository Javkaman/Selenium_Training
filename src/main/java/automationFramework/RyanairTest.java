package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RyanairTest {

    public static void main(String[] args) {

    }

    public static void metoda1(){

        String exepath = "C:\\Chromedriver\\Chromedriver79.exe";
        // Executing chrome driver
        System.setProperty("webdriver.chrome.driver",exepath);

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();




    }

}
