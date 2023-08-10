package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class Login_obj {

        @FindBy(xpath = "//a[text()='Sign in']") WebElement SigninBtn;
        @FindBy(xpath = "//input[@type='text']") WebElement UsernameTxt;
        @FindBy(xpath = "//input[@type='password']") WebElement PasswrodTxt;
        @FindBy(xpath = "//input[@type='submit']") WebElement SubmitBtn;
        @FindBy(xpath = "//div[@role='alert']") WebElement SigninMsg;
        WebDriver driver = BaseClass.setDriver();


        public void SigninPage()
        {
            PageFactory.initElements(driver,this);
            SigninBtn.click();

        }

        public void InputSigninData()
        {
            UsernameTxt.sendKeys("point1");
            PasswrodTxt.sendKeys("Point0987");
            SubmitBtn.click();
        }

        public void CheckSignin()
        {
            boolean status = SigninMsg.isDisplayed();
            assertTrue(status);
        }



}
