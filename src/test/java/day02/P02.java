package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) {
/*
Senaryo: Bir kullanıcı olarak sepete eklediğim ürünü daha sonra sepetten kaldırabilmek istiyorum.

Test Adımları:
        Giriş işlemini yap
        “Sauce Labs Backpack” ürünü sepete ekle
        Sağ üstteki sepete tıkla
        Açılan sepette "Remove" butonuna tıkla
        Ürünün artık sepette olmadığını doğrula (remove butonu kaybolmalı)

 */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user"+ Keys.TAB);
        driver.findElement(By.id("password")).sendKeys("secret_sauce"+ Keys.ENTER);


    }
}
