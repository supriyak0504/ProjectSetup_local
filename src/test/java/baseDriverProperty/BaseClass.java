package baseDriverProperty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

     public static WebDriver getDriver()
    {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver setDriver() {
        BaseClass.driver = driver;
        return driver;
    }

}
