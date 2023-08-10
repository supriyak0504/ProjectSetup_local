package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class HomePage_obj {

        @FindBy(xpath = "//button[@class='btn']")
        WebElement GetStartedbutton;
        @FindBy(xpath = "//div/h5[text()='Array']") WebElement DisplayCheck;

        WebDriver driver = BaseClass.getDriver();
        public void InitHomePage(String string)
        {
            driver.get(string);
            PageFactory.initElements(driver,this);
        }

        public void GetStartedBtn() throws InterruptedException {
            Thread.sleep(2000);
            GetStartedbutton.click();

        }

        public void CheckHomePageDisplay()
        {
            boolean status = DisplayCheck.isDisplayed();
            assertTrue(status);
        }

    }
