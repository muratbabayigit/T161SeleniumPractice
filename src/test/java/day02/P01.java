package day02;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class P01 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    /*
    https://babayigit.net/test adresine gidip adres çubuğuna
    1-Vizontele aratıp sonuç sayısını yazdırın
    2-12 Angry men aratıp sonuç sayısını yazdırın
    3-Saving Private Ryan aratıp sonuç sayısını yazdırın
    4-3 Idiots aratıp sonuç sayısını yazdırın

     */
     List<String> filmler=new ArrayList<>();
     filmler.add("Vizontele");
     filmler.add("12 Angry Men");
     filmler.add("Saving Private Ryan");
     filmler.add("3 Idiots");
     filmler.add("Neşeli Günler");
     filmler.add("Her çocuk Özeldir");
     filmler.add("Esaretin Bedeli");

     for (String film:filmler) {
         driver.get("https://babayigit.net/test");
         driver.findElement(By.id("babayigit")).sendKeys(film+ Keys.ENTER);
         String sonuc=driver.findElement(By.xpath("//*[@style='color:#999']")).getText();
         System.out.println(film+" isimli film için bulunan sonuç sayısı: "+sonuc);
         System.out.println("-------------------------------------------------------------------------");
     }
     //  driver.get("https://babayigit.net/test");
     //  String film="vizontele";
     //  driver.findElement(By.id("babayigit")).sendKeys(film+ Keys.ENTER);
     // String sonuc=driver.findElement(By.xpath("//*[@style='color:#999']")).getText();
     //  System.out.println(film+" isimli film için bulunan sonuç sayısı: "+sonuc);

     //  driver.quit();

    }
}
