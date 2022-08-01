import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class AutomationExerciseSignupPage {
    WebDriver driver;

    public AutomationExerciseSignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    public WebElement EnterAccountInformationText;

    @FindBy(id="id_gender1")
    public WebElement Mr;

    @FindBy(id="id_gender2")
    public WebElement Mrs;

    @FindBy(id="name")
    public WebElement Name;

    @FindBy(id="email")
    public WebElement Email;

    @FindBy(id="password")
    public WebElement Password;

    @FindBy(id="days")
    public WebElement DayofBirth;

    @FindBy(id="months")
    public WebElement MonthofBirth;

    @FindBy(id="years")
    public WebElement YearofBirth;

    @FindBy(xpath = "//select[@id=\"days\"]//option[26]")
    public WebElement DayofBirthDropDown;

    @FindBy(xpath = "//option[contains(text(),'March')]")
    public WebElement MonthofBirthDropDown;

    @FindBy(xpath = "//option[contains(text(),'1993')]")
    public WebElement YearofBirthDropDown;

    @FindBy(id="first_name")
    public WebElement FirstName;

    @FindBy(id="last_name")
    public WebElement LastName;

    @FindBy(id="address1")
    public WebElement Address1;

    @FindBy(xpath="//option[contains(text(),'Canada')]")
    public WebElement Country;

    @FindBy(id="state")
    public WebElement State;

    @FindBy(id="city")
    public WebElement City;

    @FindBy(id="zipcode")
    public WebElement ZipCode;

    @FindBy(id="mobile_number")
    public WebElement MobileNumber;

    @FindBy(xpath = "//option[contains(text(),'Canada')]")
    public WebElement CountryDropDown;

    @FindBy(id="newsletter")
    public WebElement SignupforournewsletterCheckBox;


    @FindBy(id="optin")
    public WebElement ReceivespecialoffersfromourpartnersCheckBox;


    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement CreateAccountButton;

    public String getEnterAccountInformationText() {

        String getEnterAccountInformationText = driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]")).getText();
        return getEnterAccountInformationText;

    }
    public void SignupPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(EnterAccountInformationText));
        String EnterAccountInformationText = getEnterAccountInformationText();
        Assert.assertEquals(EnterAccountInformationText, "ENTER ACCOUNT INFORMATION");

        wait.until(ExpectedConditions.visibilityOf(Mr));
        Mr.click();

        wait.until(ExpectedConditions.visibilityOf(Name));
        Assert.assertEquals(AutomationExerciseAccountInfo.NewName,"Baris3");

        wait.until(ExpectedConditions.visibilityOf(Email));
        // wait.until(ExpectedConditions.elementToBeClickable(Email)); Elementin clickable olmadığını verify et??
        Assert.assertEquals(AutomationExerciseAccountInfo.NewEmailAddress,"baris3@hotmail.com");

        wait.until(ExpectedConditions.visibilityOf(Password));
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        Password.sendKeys(AutomationExerciseAccountInfo.NewPassword);

       // wait.until(ExpectedConditions.visibilityOf(DayofBirth));
       // wait.until(ExpectedConditions.elementToBeClickable(DayofBirth));
       // DayofBirth.click();

        wait.until(ExpectedConditions.visibilityOf(DayofBirthDropDown));
        wait.until(ExpectedConditions.elementToBeClickable(DayofBirthDropDown));
        DayofBirthDropDown.click();

        // wait.until(ExpectedConditions.visibilityOf(MonthofBirth));
        // wait.until(ExpectedConditions.elementToBeClickable(MonthofBirth));
        // MonthofBirth.click();

        wait.until(ExpectedConditions.visibilityOf(MonthofBirthDropDown));
        wait.until(ExpectedConditions.elementToBeClickable(MonthofBirthDropDown));
        MonthofBirthDropDown.click();

        // wait.until(ExpectedConditions.visibilityOf(YearofBirth));
        // wait.until(ExpectedConditions.elementToBeClickable(YearofBirth));
        // YearofBirth.click();

        wait.until(ExpectedConditions.visibilityOf(YearofBirthDropDown));
        wait.until(ExpectedConditions.elementToBeClickable(YearofBirthDropDown));
        YearofBirthDropDown.click();

        wait.until(ExpectedConditions.visibilityOf(FirstName));
        wait.until(ExpectedConditions.elementToBeClickable(FirstName));
        FirstName.sendKeys(AutomationExerciseAccountInfo.NewFirstName);

        wait.until(ExpectedConditions.visibilityOf(LastName));
        wait.until(ExpectedConditions.elementToBeClickable(LastName));
        LastName.sendKeys(AutomationExerciseAccountInfo.NewLastName);

        wait.until(ExpectedConditions.visibilityOf(Address1));
        wait.until(ExpectedConditions.elementToBeClickable(Address1));
        Address1.sendKeys(AutomationExerciseAccountInfo.NewAddress1);


        wait.until(ExpectedConditions.visibilityOf(CountryDropDown));
        wait.until(ExpectedConditions.elementToBeClickable(CountryDropDown));
        CountryDropDown.click();

        wait.until(ExpectedConditions.visibilityOf(SignupforournewsletterCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(SignupforournewsletterCheckBox));
        SignupforournewsletterCheckBox.click();

        wait.until(ExpectedConditions.visibilityOf(ReceivespecialoffersfromourpartnersCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(ReceivespecialoffersfromourpartnersCheckBox));
        ReceivespecialoffersfromourpartnersCheckBox.click();

        wait.until(ExpectedConditions.visibilityOf(State));
        wait.until(ExpectedConditions.elementToBeClickable(State));
        State.sendKeys(AutomationExerciseAccountInfo.NewState);

        wait.until(ExpectedConditions.visibilityOf(City));
        wait.until(ExpectedConditions.elementToBeClickable(City));
        City.sendKeys(AutomationExerciseAccountInfo.NewCity);

        wait.until(ExpectedConditions.visibilityOf(ZipCode));
        wait.until(ExpectedConditions.elementToBeClickable(ZipCode));
        ZipCode.sendKeys(AutomationExerciseAccountInfo.NewZipCode);

        wait.until(ExpectedConditions.visibilityOf(MobileNumber));
        wait.until(ExpectedConditions.elementToBeClickable(MobileNumber));
        MobileNumber.sendKeys(AutomationExerciseAccountInfo.NewMobileNumber);

        wait.until(ExpectedConditions.visibilityOf(CreateAccountButton));
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccountButton));
        CreateAccountButton.click();

        //select[@id="days"]//option[26]
        //b[contains(text(),'Account Created!')]
       // List<WebElement> allElements=driver.findElements(By.tagName("days"));
        // for(WebElement ele :allElements) {
        // “Burada list methodları ile birçok farklı test yapılabilir”

        }


    }
