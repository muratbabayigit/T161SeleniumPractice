package day02;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) {
     // 1. Launch browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Faker faker=new Faker();

     // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

     // 3. Verify that home page is visible successfully
        driver.findElement(By.xpath("//*[@href='/login']")).isDisplayed();

     // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();

     // 5. Verify 'New User Signup!' is visible
        driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed();

     // 6. Enter name and email address
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(faker.name().fullName());
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(faker.internet().emailAddress());


     // 7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

     // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
     // 9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.id("password")).sendKeys(faker.internet().password(3,15,true));

     // 10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.id("newsletter")).click();
     // 11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.id("optin")).click();
     // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.id("first_name")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("last_name")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("company")).sendKeys(faker.company().name());
        driver.findElement(By.id("address1")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.id("state")).sendKeys(faker.address().state());
        driver.findElement(By.id("city")).sendKeys(faker.address().city());
        driver.findElement(By.id("zipcode")).sendKeys(faker.address().zipCode());
        driver.findElement(By.id("mobile_number")).sendKeys(faker.phoneNumber().phoneNumber());

        // 13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
     // 14. Verify that 'ACCOUNT CREATED!' is visible
        driver.findElement(By.xpath("//h2[@data-qa='account-created']")).isDisplayed();


     // 15. Click 'Continue' button
        driver.findElement(By.xpath("//*[@data-qa='continue-button']")).click();
     // 16. Verify that 'Logged in as username' is visible
        driver.findElement(By.xpath("//*[@class='fa fa-user']")).isDisplayed();

     // 17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@class='fa fa-trash-o']")).click();
     // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        driver.findElement(By.xpath("//*[@data-qa='account-deleted']")).isDisplayed();
     // 19. Quit Window
       driver.quit();

/*
        Locate alırken en önemli şey aldığımız locate2in uniq olması yani benzersiz locate almalılyız
        xpath ile locate alırken
        //* : bu kavram tüm öğeler içinde ara demektir
        yani bir class='title' öğesini tüm taglar içinde arar. kimi zaman bu ifadenin aynısından birkaç tane olabilir
        bunu benzersiz hale getirmek için * yerine aradığımız öğenin tag'ı kullanılabilir
        //input    //h2   //img  //a   //input gibi

        eğer bir attributte ile locate alıyorsak
        //*[@class='titleVerisi'] ile alırsak hangi attributte ise class yerine onun key'i yazılır
        eğer sadece yazı ile alınabilecek bir durumda ise
        //*[text()='aranan metin']
        şeklinde locate alıyoruz.
 */

    }
}
