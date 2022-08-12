package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Bestbuy {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //BestBuy'a gidiş
        driver.get("https://www.bestbuy.com");
        //sayfada kaç buton varsa bulalım.

        List<WebElement> butonListesi=driver.findElements(By.tagName("button"));
        System.out.println(butonListesi.size());
        for (WebElement kontrol:butonListesi)
        {
            System.out.println(kontrol.getText());
        }

    }
}
