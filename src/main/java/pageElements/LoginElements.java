package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;

public class LoginElements {
    WebDriver driver = BasePage.getInstance().driver;

    public LoginElements(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[id='Email']")
    public WebElement email;

    @FindBy(css = "input[id='Password']")
    public WebElement password;

    @FindBy(css = "button[class*='login-button']")
    public WebElement loginButton;


}
