package DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Eğer bir sayfadan başka bir yere gidip geri döneceksek kullanılır.
        //1 drive.navigate.to("url") istenilen url ye drive.get gibi ek olarak burda geri ye ve farklı sayfaya gitmek mümkündür.
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        //2 drive.navigate().back bir önceki sayaya donus yapar.
        driver.navigate().back();

        //3 drive.navigate.forward back ile geldiği sayfaya geri gider.
        driver.navigate().forward();

        //4 refresh sayfayı yeniler
        driver.navigate().refresh();

        //5 close sayfayı kapatır.
        driver.close();

        //6 quit çalışırken birden fazla window varsa hepssini kapatır.
        driver.quit();




    }
}
