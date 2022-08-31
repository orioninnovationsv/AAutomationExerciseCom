package automation_exercises_pageobjectmodel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginpage {
    WebDriver driver;
    public loginpage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement LoginAccText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement LoginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement LoginPassword;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement LoginButton;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement IncorrectLoginError;

    public String getLoginText(){

        String getLoginText = driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText();
        return getLoginText;

    }
    public String getIncorrectLoginText(){

        String getIncorrectLoginText = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();
        return getIncorrectLoginText;

    }

    public void LoginPageAutomationExercise(){


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoginAccText));
        String control = getLoginText().toString();
        Assert.assertEquals("Login to your account",control);

        wait.until(ExpectedConditions.visibilityOf(LoginEmail));
        wait.until(ExpectedConditions.elementToBeClickable(LoginEmail));
        LoginEmail.sendKeys(userinfo.RegisteredEmail);

        wait.until(ExpectedConditions.visibilityOf(LoginPassword));
        wait.until(ExpectedConditions.elementToBeClickable(LoginPassword));
        LoginPassword.sendKeys(userinfo.RegisteredPassword);

        wait.until(ExpectedConditions.visibilityOf(LoginButton));
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
        LoginButton.click();
    }
    public void LoginPageAutomationExercise2(){


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoginAccText));
        String control = getLoginText().toString();
        Assert.assertEquals("Login to your account",control);

        wait.until(ExpectedConditions.visibilityOf(LoginEmail));
        wait.until(ExpectedConditions.elementToBeClickable(LoginEmail));
        LoginEmail.sendKeys(userinfo.RegisteredEmail);

        wait.until(ExpectedConditions.visibilityOf(LoginPassword));
        wait.until(ExpectedConditions.elementToBeClickable(LoginPassword));
        LoginPassword.sendKeys("aaaaaaaa123");

        wait.until(ExpectedConditions.visibilityOf(LoginButton));
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
        LoginButton.click();

        wait.until(ExpectedConditions.visibilityOf(IncorrectLoginError));
        String error = getIncorrectLoginText().toString();
        Assert.assertEquals("Your email or password is incorrect!",error);

    }
}
