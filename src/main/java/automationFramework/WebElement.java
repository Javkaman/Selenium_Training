package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

    public static void main(String[] args) throws InterruptedException {

        webelement1();
    }


    public static void webelement1() throws InterruptedException {

        String exepath = "C:\\Chromedriver\\Chromedriver79.exe";
        // Executing chrome driver
        System.setProperty("webdriver.chrome.driver",exepath);

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("goltrix@gmail.com");
        driver.findElement(By.className("RveJvd")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("whsOnd")).sendKeys("rival");
        driver.findElement(By.className("RveJvd")).click();


    }


}
