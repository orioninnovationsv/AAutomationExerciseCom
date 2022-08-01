import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterUser {

    static WebDriver driver;


    @BeforeClass
    public static void setup() {
    }

    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://automationexercise.com/");
    }


    @Test
    public void AutomationExercise() {
        // AutomationExerciseLoginPage loginPage = new AutomationExerciseLoginPage(driver);
        // loginPage.LoginAutomationExercise();
        AutomationExerciseHomePage homePage = new AutomationExerciseHomePage(driver);
        homePage.HomeAutomationExercise();

        AutomationExerciseLoginPage loginPage = new AutomationExerciseLoginPage(driver);
        loginPage.LoginAutomationExercise();

        AutomationExerciseSignupPage signupPage = new AutomationExerciseSignupPage(driver);
        signupPage.SignupPage();

        AutomationExerciseNewAccountCreatedPage newAccountCreatedPage = new AutomationExerciseNewAccountCreatedPage(driver);
        newAccountCreatedPage.AccountCreatedPage();
    }
}


