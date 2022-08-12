package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 15 ));
        driver.get("https:www.facebook.com");
        //eposta kutusuna giriş
        WebElement epostaKutusu= driver.findElement(By.xpath("//input[@id='email']"));
        epostaKutusu.sendKeys("hajsfjasof");
        //şifre girişi
        WebElement passKutusu=driver.findElement(By.xpath("//input[@id='pass']"));
        passKutusu.sendKeys("atatatggf");
        // login butonu
        WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
        login.click();


    }
}
