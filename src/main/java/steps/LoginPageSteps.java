package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageElements.LoginElements;
import utilities.BasePage;

public class LoginPageSteps {
    LoginElements loginElements = new LoginElements();

    WebDriver driver = BasePage.getInstance().driver;

    public LoginPageSteps(){
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String email){
        loginElements.email.sendKeys(email);
    }

    public void setPassword(String password){
        loginElements.password.sendKeys(password);
    }

    public void clickLoginButton(){
        loginElements.loginButton.click();
    }
}
