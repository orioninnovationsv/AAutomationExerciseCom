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

public class loggedinhomepage {
    WebDriver driver;
    public loggedinhomepage(WebDriver driver){

        this.driver =driver;
        PageFactory.initElements(this.driver, this);

    }

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement LoggedIn;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement DeleteAccButton;
    public String getLoggedInText(){

        String getLoggedInText = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
        return getLoggedInText;

    }
    public void LoggedInPageAutomationExercise() {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoggedIn));
        String control = getLoggedInText().toString();
        Assert.assertEquals("Logged in as "+ userinfo.NewName, control);

        wait.until(ExpectedConditions.visibilityOf(DeleteAccButton));
        wait.until(ExpectedConditions.elementToBeClickable(DeleteAccButton));
        DeleteAccButton.click();
    }


    }
