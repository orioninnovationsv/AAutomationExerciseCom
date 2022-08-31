package automation_exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test_case5 {
    static WebDriver driver;
    @BeforeClass
    public  static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test //2. Navigate to url 'http://automationexercise.com'
    public void test01() {

        driver.get("http://automationexercise.com");
    }
    @Test//3. Verify that home page is visible successfully
    public void test02() {
        WebElement header = driver.findElement(new By.ByXPath("//header[@id ='header']"));
        Assert.assertTrue(header.isDisplayed());
    }
    @Test//4. Click on 'Signup / Login' button
    public void test03() {
        WebElement signupbutton = driver.findElement(new By.ByXPath("//a[@href='/login']"));
        signupbutton.click();
    }
    @Test//5. Verify 'New User Signup!' is visible
    public void test04() {
        WebElement newuser = driver.findElement(new By.ByXPath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(newuser.isDisplayed());
    }
    @Test//6. Enter name and email address
    public void test05() {
        WebElement name = driver.findElement(new By.ByXPath("//input[@data-qa='signup-name']"));
        name.sendKeys(userinfo.NewName);

        WebElement email = driver.findElement(new By.ByXPath("//input[@data-qa='signup-email']"));
        email.sendKeys(userinfo.RegisteredEmail);


    }
    @Test//7.Click 'Signup' button
    public void test06() {
        WebElement signupbutton= driver.findElement(new By.ByXPath("//button[text()='Signup']"));
        signupbutton.click();

    }
    @Test//8. Verify error 'Email Address already exist!' is visible

    public void test07() {
        WebElement enterinf= driver.findElement(new By.ByXPath("//p[text()='Email Address already exist!']"));
        Assert.assertTrue(enterinf.isDisplayed());

    }
}
