package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;

public class RegisterElements {

    public RegisterElements(){
        PageFactory.initElements(BasePage.getDriver(), this);
    }

    @FindBy(css = "input[id='firstname']")
    public WebElement name;

    @FindBy(css = "input[id='lastname']")
    public WebElement lastname;

    @FindBy(css = "input[id='email_address']")
    public WebElement email;

    @FindBy(css= "input[id='password']")
    public WebElement password;

    @FindBy(css= "input[id='password-confirmation']")
    public WebElement confirmPassword;

    @FindBy(css= "button[class='action submit primary']")
    public WebElement registerButton;

}
