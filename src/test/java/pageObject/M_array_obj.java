package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.time.Duration;

public class M_array_obj {

    @FindBy(xpath = "//a[@href='array']")
    WebElement ArrayGetStartedBtn;

    @FindBy(xpath = "//a[@href='arrays-in-python']") WebElement ArrinPythonBtn;

    @FindBy(xpath ="//a[text()='Practice Questions']") WebElement PracQuesBtn;
    @FindBy(xpath = "//a[@href='/question/1']") WebElement SearchArrBtn;

    @FindBy(xpath = "//span[@role='presentation']") WebElement ClearDef;
    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement GetinputTxt;

    WebDriver driver = BaseClass.setDriver();
    Boolean status;
    Actions act = new Actions(driver);
    public void GestartedArr()
    {
        PageFactory.initElements(driver, this);
        ArrayGetStartedBtn.click();
    }

    public void ArrayinPythLink()
    {
        PageFactory.initElements(driver, this);
        ArrinPythonBtn.click();
    }
public void pracQuesLink()
{
    PageFactory.initElements(driver,this);
    PracQuesBtn.click();
}
public void SearcharrLink()
{
    PageFactory.initElements(driver,this);
    SearchArrBtn.click();
}


public void ClearTxtEditor() throws InterruptedException {

    PageFactory.initElements(driver, this);

            ClearDef.click();

        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();


}

public void InputPythonCode()
{
    GetinputTxt.sendKeys("print \"Hello\"");

}


}
