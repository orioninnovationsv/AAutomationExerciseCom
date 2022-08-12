package DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // driver.manage().window().getSize() sayfanın ölçülerini pixel olarak verir
        System.out.println(driver.manage().window().getSize());

        // driver.manage().window().getPosition() sayfanın ölçülerini pixel olarak konumunu verir
        System.out.println(driver.manage().window().getPosition());

        // driver.manage().window().setPosition(new Point(15,15)) sol alt köşeden bizim yazacağımız pixel noktasına taşır
        driver.manage().window().setPosition(new Point(15,15));

        // driver.manage().window().setSize(new Dimension(15,15)) boyutlandırır
        driver.manage().window().setSize(new Dimension(1200,600));

        //driver.manage.window.maximize  içinde olduğu sayfayı maximize yapar.
        //driver.manage.window.fullscreen içinde olduğu sayfayı fullscreen yapar.
        driver.manage().window().maximize();

        // Driver manage timeout metotları
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }
}
