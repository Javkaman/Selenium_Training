package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebCommands {
    public static void main(String[] args) throws InterruptedException {

        //method1();
        method2();
    }

        public static void method1() throws InterruptedException {


            String exepath = "C:\\Chromedriver\\Chromedriver79.exe";
            // Executing chrome driver
            System.setProperty("webdriver.chrome.driver", exepath);

            WebDriver driver = new ChromeDriver();
            //otwieranie strony
            driver.get("https://www.ryanair.com");
            //tytul strony
            String title = driver.getTitle();
            //usypianie na chwile
            //Thread.sleep(5000);
            System.out.println(title);
            //obecny adres strony
            String URL = driver.getCurrentUrl();
            System.out.println(URL);
            //zrodlo strony
            String pagesource = driver.getPageSource();
            //System.out.println(pagesource);
            System.out.println(pagesource.length());
            //zamykanie bajzelu
            driver.close();
            Thread.sleep(2000);
            System.out.println("zamykać bajzel");

        }

        public static void method2() throws InterruptedException {

        String exepath = "C:\\Chromedriver\\Chromedriver79.exe";
            // Executing chrome driver
            System.setProperty("webdriver.chrome.driver", exepath);

            WebDriver driver = new ChromeDriver();

            String URL = "https://www.toolsqa.com/automation-practice-switch-windows/";
            driver.get(URL);
            driver.manage().window().maximize();
            Thread.sleep(10000);
            driver.findElement(By.id("button1")).click();
            //driver.findElement(By.id("New Browser Window")).click();
            Thread.sleep(5000);
            //driver.close();
            driver.quit();


        }
    }

