package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.rmi.transport.proxy.CGIHandler;

import java.time.Duration;

public class Amazon
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //sayfayı tam sayfa yapar
        driver.manage().window().maximize();
        //sayfaya gider
        driver.get("https:www.amazon.com");
        //arama kutusu id sini aramaya atadık
        WebElement arama= driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("Nutella ");//aranan değer
        arama.submit();//enter




    }
}
