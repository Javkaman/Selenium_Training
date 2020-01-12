package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommand {

    public static void main(String[] args) throws InterruptedException {

        //navigation1();
        //navigation2();
    }

    public static void navigation1() throws InterruptedException {

        String exepath = "C:\\Chromedriver\\Chromedriver79.exe";
        // Executing chrome driver
        System.setProperty("webdriver.chrome.driver",exepath);

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ryanair.com");
        //maksymalizuje okno
        driver.manage().window().maximize();
        //otwiera strone internetowa w tym samym oknie
        driver.navigate().to("https://www.onet.pl");
        //back guzik
        driver.navigate().back();
        Thread.sleep(2000);
        //refresh
        driver.navigate().refresh();
        //forward guzik
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();
    }

    public static void navigation2(){

        String exepath = "C:\\Chromedriver\\Chromedriver79.exe";
        // Executing chrome driver
        System.setProperty("webdriver.chrome.driver",exepath);

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        String URL = "http://www.DemoQA.com";
        driver.get(URL);


    }

}
