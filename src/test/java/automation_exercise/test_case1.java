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

public class test_case1 {

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
        email.sendKeys(userinfo.NewEmail);


    }
    @Test//7.Click 'Signup' button
    public void test06() {
        WebElement signupbutton= driver.findElement(new By.ByXPath("//button[text()='Signup']"));
        signupbutton.click();

    }
    @Test//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    public void test07() {
        WebElement enterinf= driver.findElement(new By.ByXPath("//b[text()='Enter Account Information']"));
        Assert.assertTrue(enterinf.isDisplayed());

    }

    @Test//9. Fill details: Title, Name, Email, Password, Date of birth
    public void test08() {

        WebElement gender= driver.findElement(new By.ById("uniform-id_gender2"));
        gender.click();
        WebElement password= driver.findElement(new By.ById("password"));
        password.sendKeys(userinfo.RegisteredPassword);

        WebElement day= driver.findElement(new By.ById("days"));
        day.sendKeys(userinfo.Day);
        WebElement month= driver.findElement(new By.ByXPath("//select[@data-qa='months']"));
        month.sendKeys(userinfo.Month);
        WebElement year= driver.findElement(new By.ById("years"));
        year.sendKeys(userinfo.Year);

    }
    @Test//10. Select checkbox 'Sign up for our newsletter!'
    public void test09() {
        WebElement newsletter= driver.findElement(new By.ById("newsletter"));
        newsletter.click();

    }
    @Test//11. Select checkbox 'Receive special offers from our partners!'
    public void test10() {
        WebElement offer= driver.findElement(new By.ById("optin"));
        offer.click();


    }
    @Test//12.  Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    public void test11() {
        WebElement first_name= driver.findElement(new By.ById("first_name"));
        first_name.sendKeys(userinfo.NewFirstName);

        WebElement last_name= driver.findElement(new By.ById("last_name"));
        last_name.sendKeys(userinfo.NewLastName);

        WebElement company= driver.findElement(new By.ById("company"));
        company.sendKeys(userinfo.Company);

        WebElement address1= driver.findElement(new By.ById("address1"));
        address1.sendKeys(userinfo.NewAddress1);

        WebElement address2= driver.findElement(new By.ById("address2"));
        address2.sendKeys(userinfo.NewAddress1);

        WebElement country= driver.findElement(new By.ById("country"));
        country.sendKeys(userinfo.NewCountry);

        WebElement state= driver.findElement(new By.ById("state"));
        state.sendKeys(userinfo.NewState);

        WebElement city= driver.findElement(new By.ById("city"));
        city.sendKeys(userinfo.NewCity);

        WebElement zipcode= driver.findElement(new By.ById("zipcode"));
        zipcode.sendKeys(userinfo.NewZipCode);

        WebElement mobile_number= driver.findElement(new By.ById("mobile_number"));
        mobile_number.sendKeys(userinfo.NewMobileNumber);



    }
    @Test//13. Click 'Create Account button'
    public void test12() {
        WebElement createacc= driver.findElement(new By.ByXPath("//button[@data-qa=\"create-account\"]"));
        createacc.click();

    }

    @Test//14. Verify that 'ACCOUNT CREATED!' is visible
    public void test13() {
        WebElement created= driver.findElement(new By.ByXPath("//b[text()='Account Created!']"));
        Assert.assertEquals("ACCOUNT CREATED!",created.getText());

    }
    @Test//15. Click 'Continue' button
    public void test14() {
        WebElement continuebutton= driver.findElement(new By.ByXPath("//a[text()='Continue']"));
        continuebutton.click();

    }
    @Test//16. Verify that 'Logged in as username' is visible
    public void test15() {
        WebElement loggedin= driver.findElement(new By.ByXPath("//a[text()=' Logged in as ']"));
        Assert.assertEquals("Logged in as "+ userinfo.NewName,loggedin.getText());

    }

    @Test//17. Click 'Delete Account' button
    public void test16() {
        WebElement delete= driver.findElement(new By.ByXPath("//a[text()=' Delete Account']"));
        delete.click();

    }



}
