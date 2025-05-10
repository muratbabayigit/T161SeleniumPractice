package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_firstTest {
    public static void main(String[] args) {
      /*
        1- Bir driver oluşturun
        2- Driver'ı maximize yapıp bekleme süresini ayarlayın
        3- driver'da https://babayigit.net/test adresine gidiniz
        4-Sayfanın başlığında "babayigit" kelimesinin yer aldığını doğrulayın
        5-Sayfanın başlığını yazdırın
        6- Doğru Sayfada olduğunuzu doğrulayın
        7-Sayfayı kapatın
    */

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://babayigit.net/test");

        String expectedWord="BABAYIGIT";
        String actualTitle= driver.getTitle();
        System.out.println(expectedWord.toUpperCase());
        if (actualTitle.contains(expectedWord.toUpperCase())){
            System.out.println("Title Test PASSED");
        }else{
            System.out.println("Title Test FAILED");
        }

        System.out.println(driver.getTitle());


        String expectedUrl="https://babayigit.net/test/";
        String actualUrl=driver.getCurrentUrl();


        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL Test PASSED");
        }else {
            System.out.println("URL Test FAILED");
        }
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}
