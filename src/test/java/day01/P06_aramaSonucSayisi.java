package day01;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06_aramaSonucSayisi {
    public static void main(String[] args) {
  /*
        1-https://babayigit.net/test adresine gidin
        2-search kısmına "Ahmet Bulutluöz" yazdırın
        3-arama yapın/arama butonuna tıklayın
        4-arama sonuc sayısını yazdırın
   */

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://babayigit.net/test");

        driver.findElement(By.id("babayigit")).sendKeys("Kim şampiyon olacak"+ Keys.ENTER);
        // Keys.ENTER işlevi kapalıysa driver.findElement(By.xpath("//*[@type='submit'])).click(); ile ara butonuna tıklanır


        System.out.println("Arama Sonucunda bulunan veri Sayısı:\n"+driver.findElement(By.xpath("//*[@style='color:#999']")).getText());

        driver.quit();
    }
}
