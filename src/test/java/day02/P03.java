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
     // 10. Select checkbox 'Sign up for our newsletter!'
     // 11. Select checkbox 'Receive special offers from our partners!'
     // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
     // 13. Click 'Create Account button'
     // 14. Verify that 'ACCOUNT CREATED!' is visible
     // 15. Click 'Continue' button
     // 16. Verify that 'Logged in as username' is visible
     // 17. Click 'Delete Account' button
     // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     // 19. Quit Window
        driver.quit();
    }
}
