import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationExerciseLoginPage {

    WebDriver driver;
    public AutomationExerciseLoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(this.driver, this );
    }
   // @FindBy(xpath = "//input[@data-qa=\"login-email\"]")
    // public WebElement LoginEmailField;

   // @FindBy(xpath = "//input[@data-qa=\"login-password\"]")
    // public WebElement LoginPasswordField;

    // @FindBy(xpath = "//button[@data-qa=\"login-button\"]")
    //public WebElement LoginButton;

    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    public WebElement NewUserSignup;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement SignupWithName;

    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
    public WebElement SignWithEmail;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement Signup;

    public String getNewUserSignup(){

        String getNewUserSignupText = driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]")).getText();
        return getNewUserSignupText;

    }


      public void LoginAutomationExercise(){

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.elementToBeClickable(LoginEmailField));
       // LoginEmailField.sendKeys(AutomationExerciseAccountInfo.email+ Keys.ENTER);

       // LoginPasswordField.sendKeys(AutomationExerciseAccountInfo.password);
       // wait.until(ExpectedConditions.titleContains("Automation Exercise"));

        //LoginButton.submit();

          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.visibilityOf(NewUserSignup));
          String NewUserSignup = getNewUserSignup();
          Assert.assertEquals(NewUserSignup, "New User Signup!");

          wait.until(ExpectedConditions.visibilityOf(SignupWithName));
          wait.until(ExpectedConditions.elementToBeClickable(SignupWithName));
          SignupWithName.sendKeys(AutomationExerciseAccountInfo.NewName);


          wait.until(ExpectedConditions.visibilityOf(SignWithEmail));
          wait.until(ExpectedConditions.elementToBeClickable(SignWithEmail));
          SignWithEmail.sendKeys(AutomationExerciseAccountInfo.NewEmailAddress);

          wait.until(ExpectedConditions.visibilityOf(Signup));
          wait.until(ExpectedConditions.elementToBeClickable(Signup));
          Signup.click();


    }
}
