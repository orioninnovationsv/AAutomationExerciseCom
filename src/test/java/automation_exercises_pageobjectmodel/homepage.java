package automation_exercises_pageobjectmodel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homepage {
    WebDriver driver;
    public homepage(WebDriver driver){

        this.driver =driver;
        PageFactory.initElements(this.driver, this);

    }

    @FindBy(linkText = "Signup / Login")
    public WebElement SignupLoginText;

    public void HomeAutomationExercise(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Automation Exercise"));
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");

        wait.until(ExpectedConditions.elementToBeClickable(SignupLoginText));
        SignupLoginText.click();

    }
}
