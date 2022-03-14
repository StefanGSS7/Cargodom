package cdom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class SeleniumSetup {

    public static WebDriver chromeDriver;

    public static void init() {

        WebDriverManager.chromedriver().driverVersion("99").setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.get("http://18.156.17.83:9095/");

    }

    public static void finish() {
        chromeDriver.quit();
    }

}
