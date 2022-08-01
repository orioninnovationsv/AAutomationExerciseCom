import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationExerciseLoggedUseronHomePage
{
        WebDriver driver;

        public AutomationExerciseLoggedUseronHomePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
        }
        @FindBy(xpath = "//b[contains(text(),'Baris3')]")
        public WebElement LoggedInAsUsername;

        public String getLoggedUseronHomePageText() {

            String LoggedUseronHomePageText = driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]")).getText();
            return LoggedUseronHomePageText;

        }
        public void LoggedUseronHomePage() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(LoggedInAsUsername));
            String EnterAccountInformationText = getLoggedUseronHomePageText();
            Assert.assertEquals(LoggedInAsUsername, "Baris3");

        }
    }

