package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_driverMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.babayigit.net/test");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.wisequarter.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("<----- Geri Dönüyoruz");
        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       //System.out.println(driver.getPageSource());
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
