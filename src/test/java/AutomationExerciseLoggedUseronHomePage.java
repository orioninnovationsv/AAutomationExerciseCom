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
        @FindBy(xpath = "//b[contains(text(),'Baris12')]")
        public WebElement LoggedInAsUsername;

        @FindBy(xpath = "//b[contains(text(),'Kandy SV1')]")
        public WebElement LoggedInAsUsername2;

        public String getLoggedUseronHomePageText() {

            String LoggedUseronHomePageText = driver.findElement(By.xpath("//b[contains(text(),'Baris12')]")).getText();
            return LoggedUseronHomePageText;

        }


        public String getLoggedUser2onHomePageText() {

        String LoggedUseronHomePageText = driver.findElement(By.xpath("//b[contains(text(),'Kandy SV1')]")).getText();
        return LoggedUseronHomePageText;

        }
        public void LoggedUseronHomePage() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(LoggedInAsUsername));
            String EnterAccountInformationText = getLoggedUseronHomePageText();
            Assert.assertEquals(EnterAccountInformationText, "Baris12");
            System.out.println("OK");

        }

        public void LoggedUser2onHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoggedInAsUsername2));
        String EnterAccountInformationText = getLoggedUser2onHomePageText();
        Assert.assertEquals(EnterAccountInformationText, "Kandy SV1");
        System.out.println("test");
    }
    }

