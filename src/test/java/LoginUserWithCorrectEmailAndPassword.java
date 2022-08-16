import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginUserWithCorrectEmailAndPassword {

    static WebDriver driver;

    @BeforeClass
    public static void setup()

    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://automationexercise.com/");
    }
    @Test
    public void LoginUserWithCorrectCredentials(){
        AutomationExerciseHomePage homePage = new AutomationExerciseHomePage(driver);
        homePage.HomeAutomationExercise();

        AutomationExerciseLoginLoginPage loginPage = new AutomationExerciseLoginLoginPage(driver);
        loginPage.CorrectLoginCredentialsAutomationExercise();

        AutomationExerciseLoggedUseronHomePage loggedUseronHomePage = new AutomationExerciseLoggedUseronHomePage(driver);
        loggedUseronHomePage.LoggedUser2onHomePage();

    }
}
