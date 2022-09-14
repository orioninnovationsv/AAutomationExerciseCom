package Test;

import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class JUnitAssertion
{
    @Test
    public void test1()
    {
        //browser ı çalıştırın
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //1 navigate to url
        driver.get("https://www.automationexercise.com/");
        //2 verify that home page is visible successfully
        WebElement logoElement = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElement.isDisplayed());
        //3 click on "Signup / Login" button
        WebElement signuplinki= driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signuplinki.click();
        //4 Verify  "login to your account" is visible
        WebElement loginyaziElementi= driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginyaziElementi.isDisplayed());
        //5 enter correct email address and password
         WebElement emailadresskutusu= driver.findElement(By.xpath("//input[@data-qa='login-email']"));
         emailadresskutusu.sendKeys("ahmet@nehaber.com");
         WebElement passwordkutusu= driver.findElement(By.xpath("//input[@data-qa='login-password']"));
         passwordkutusu.sendKeys("12345");
         //6 Click login button
        driver.findElement(By.xpath("//button[@data-qa= 'login-button']")).click();
        //7 verify that "logged in as username" is visible
        WebElement loggedinyazısı=driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        Assert.assertTrue(loggedinyazısı.isDisplayed());
        //8 click log out button
        driver.findElement(By.xpath("//a[text()=' Logout']")).click();
        //9 verify that user is navigated to login page
        String expectedUrl="https://www.automationexercise.com/login";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //close driver
        driver.close();


    }
}
