package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasePage;

public class RegisterElements {
    WebDriver driver = BasePage.getInstance().driver;

    public RegisterElements(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[id='gender-male']")
    public WebElement gender;

    @FindBy(css = "input[id='FirstName']")
    public WebElement name;

    @FindBy(css = "input[id='LastName']")
    public WebElement lastname;

    @FindBy(css = "select[name='DateOfBirthDay']")
    public WebElement birthDay;

    @FindBy(css = "select[name='DateOfBirthMonth']")
    public WebElement birthMonth;

    @FindBy(css = "select[name='DateOfBirthYear']")
    public WebElement birthYear;

    @FindBy(css = "input[id='Email']")
    public WebElement email;

    @FindBy(css = "input[id='Company']")
    public WebElement company;

    @FindBy(css = "input[id='Newsletter']")
    public WebElement newsletter;

    @FindBy(css= "input[id='Password']")
    public WebElement password;

    @FindBy(css= "input[id='ConfirmPassword']")
    public WebElement confirmPassword;

    @FindBy(css= "button[id='register-button']")
    public WebElement registerButton;


}
