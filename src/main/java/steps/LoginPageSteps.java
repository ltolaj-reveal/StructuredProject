package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageElements.LoginElements;
import utilities.BasePage;

public class LoginPageSteps {
    LoginElements loginElements = new LoginElements();

    public LoginPageSteps(){
        PageFactory.initElements(BasePage.getDriver(), this);
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
