package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;

public class LoginElements {

    // //method getDriver() must return a WebDriver. If not -> fail. The static method that comes must be WebDriver.

    public LoginElements(){
        PageFactory.initElements(BasePage.getDriver(), this);
    }

    @FindBy(css = "input[id='Email']")
    public WebElement email;

    @FindBy(css = "input[id='Password']")
    public WebElement password;

    @FindBy(css = "button[class*='login-button']")
    public WebElement loginButton;


}
