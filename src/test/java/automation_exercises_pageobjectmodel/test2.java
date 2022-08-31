package automation_exercises_pageobjectmodel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test2 {

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://automationexercise.com/");

        homepage HomePage= new homepage(driver);
        HomePage.HomeAutomationExercise();

        loginpage LoginPage= new loginpage(driver);
        LoginPage.LoginPageAutomationExercise();

        loggedinhomepage LoggedInHomePage = new loggedinhomepage(driver);
        LoggedInHomePage.LoggedInPageAutomationExercise();


    }
}
