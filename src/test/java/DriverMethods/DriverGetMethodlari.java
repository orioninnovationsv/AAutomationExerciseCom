package DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        // 1 driver.get() yazdığımız url ye gider.
        driver.get("https://www.amazon.com");

        // 2 driver.getTitle() içinde olduğumuz sayfanın başlığını döndürür
        System.out.println("Sayfa Title : "+ driver.getTitle());

        //3 driver.getCurrentUrl içinde olduğu sayfanın url ini dödürür.
        System.out.println("Sayfa URL : "+ driver.getCurrentUrl());

        // 4 driver.getPageSource() sayfanın kaynak kodlarını verir
        System.out.println("---------------------------------------");
        System.out.println(driver.getPageSource());
        System.out.println("---------------------------------------");

        // 5 driver.getWindowHandle() sayfanın unique hash kodunu döndürür. Her sayfada değişir
        System.out.println(driver.getWindowHandle());

        // 6 driver.getWindowHandles() eğer driver çalışırken birden fazla sayfa varsa hepsinin hash ini verir
        System.out.println(driver.getWindowHandles());

    }
}
