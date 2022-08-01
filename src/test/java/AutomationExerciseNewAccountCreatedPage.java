import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationExerciseNewAccountCreatedPage {
        WebDriver driver;

        public AutomationExerciseNewAccountCreatedPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
        }
        @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
        public WebElement AccountCreatedText;

        @FindBy(xpath = "//a[contains(text(),'Continue')]")
        public WebElement ContinueButton;

    public String getAccountCreatedText() {

        String getAccountCreatedText = driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]")).getText();
        return getAccountCreatedText;

    }
    public void AccountCreatedPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(AccountCreatedText));
        String AccountCreatedText = getAccountCreatedText();
        Assert.assertEquals(AccountCreatedText, "ACCOUNT CREATED!");

        wait.until(ExpectedConditions.visibilityOf(ContinueButton));
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        ContinueButton.click();
    }
}
