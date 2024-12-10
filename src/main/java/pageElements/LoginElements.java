package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;

public class LoginElements {

    // //method getDriver() must return a WebDriver. If not -> fail.

    public LoginElements(){
        PageFactory.initElements(BasePage.getDriver(), this);
    }

    @FindBy(css = "input[id='email']")
    public WebElement email;

    @FindBy(css = "input[id='pass']")
    public WebElement password;

    @FindBy(css = "button[id='send2']")
    public WebElement loginButton;
}
