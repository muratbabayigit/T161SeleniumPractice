package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_driverGet {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://babayigit.net/test");
    }
}
