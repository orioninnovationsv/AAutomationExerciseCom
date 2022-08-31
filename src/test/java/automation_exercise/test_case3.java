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

public class test_case3 {
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
    @Test//5. Verify 'Login to your account' is visible
    public void test04() {
        WebElement newuser = driver.findElement(new By.ByXPath("//h2[text()='Login to your account']"));
        Assert.assertTrue(newuser.isDisplayed());
    }
    @Test//6. Enter incorrect email address and password
    public void test05() {


        WebElement email = driver.findElement(new By.ByXPath("//input[@data-qa='login-email']"));
        email.sendKeys(userinfo.RegisteredEmail);
        WebElement password = driver.findElement(new By.ByXPath("//input[@data-qa='login-password']"));
        password.sendKeys("aaaaaaaa123");


    }

    @Test//7. Click 'login' button
    public void test06() {
        WebElement loginbutton= driver.findElement(new By.ByXPath("//button[text()='Login']"));
        loginbutton.click();

    }

    @Test//8.Verify error 'Your email or password is incorrect!' is visible
    public void test07() {
        WebElement error= driver.findElement(new By.ByXPath("//p[text()='Your email or password is incorrect!']"));
        Assert.assertEquals("Your email or password is incorrect!",error.getText());

    }
}
