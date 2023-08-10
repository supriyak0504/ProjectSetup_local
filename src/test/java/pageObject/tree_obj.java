package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Optional;
import utilities.LoggerLoad;

public class tree_obj {

    @FindBy(xpath = "//pre[@id='output']")
    WebElement OutputChk;
    @FindBy(xpath = "//form[@id='answer_form']//div//div//div//textarea")
    WebElement Editorbx;

    @FindBy(xpath = "//button[@type='button']")
    WebElement RunBtn;

    @FindBy(xpath = "//a[@href='/tryEditor']")
    WebElement TryHereBtn;
    @FindBy(xpath = "//a[@href='tree']")
    WebElement TreeGetStartedBtn;
    @FindBy(xpath = "//h4[text()='Tree']")
    WebElement TreeGetStartedMsg;
    @FindBy(xpath = "//a[@href='overview-of-trees']")
    WebElement OvTreeBtn;
    @FindBy(xpath = "//p[text()='Overview of Trees']")
    WebElement OvTreeMsg;

    WebDriver driver = BaseClass.setDriver();
    Boolean status;

    public void LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public void TreeGetStarted() {
        PageFactory.initElements(driver, this);
        TreeGetStartedBtn.click();
    }

    public void TreeLandpageChk() {
        status = TreeGetStartedMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void OverTreeLink() {
        PageFactory.initElements(driver, this);
        OvTreeBtn.click();
    }

    public void OverTreeLinkChk() {
        status = OvTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void TryHereButton() {
        PageFactory.initElements(driver, this);
        TryHereBtn.click();

    }

    public void EditorBoxInput() {
        PageFactory.initElements(driver, this);

        //    CursorBtn.click();
        Editorbx.sendKeys("a=10\n b=20\nc=a+b\nprint c");

    }

    public void RunBtnclick() {
        PageFactory.initElements(driver, this);
        RunBtn.click();

        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("ERROR: (ALERT BOX DETECTED) - ALERT MSG : " + alertText);
            alert.accept();
            LoggerLoad.error("Error Message Alert Box : " + alertText);
            //driver.navigate().back();
        } catch (Exception e) {
            String opdisplay = OutputChk.getText();
       //     System.out.printf("The output is " + opdisplay);
            LoggerLoad.info("The output value of python code is " + opdisplay);
        }
    }

    public void OutputChkMsg() throws Exception  {
      try {
          status = OutputChk.isDisplayed();
          Assert.assertTrue(status);
          LoggerLoad.info("Assert True in try editor block");
      } catch (AssertionError e) {
          LoggerLoad.error("Assert false in try editor block");
          System.out.println(e.getMessage());
      }
    }

}