package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageElements.RegisterElements;
import utilities.BasePage;
import globals.GlobalVariables;

import java.time.Duration;

public class RegisterPageSteps {
    RegisterElements registerElements = new RegisterElements();

    public RegisterPageSteps(){
        PageFactory.initElements(BasePage.getDriver(), this);
    }

    public void setName(String name){
        registerElements.name.sendKeys(name);
    }

    public void setLastName(String lastname){
        registerElements.lastname.sendKeys(lastname);
    }

    public void setEmail(String email){
        registerElements.email.sendKeys(email);
    }

    public void setPassword(String password){
        registerElements.password.sendKeys(password);
    }

    public void setConfirmPassword(String password){
        registerElements.confirmPassword.sendKeys(password);
    }

    public void clickRegisterButton(){
        registerElements.registerButton.click();
        //new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='register-continue-button']")));
    }

    public void registerAndSetCredentials(String name, String lastname, String email, String password) {
        setName(name);
        setLastName(lastname);
        setEmail(email);
        setPassword(password);
        setConfirmPassword(password);

        clickRegisterButton();

        GlobalVariables.email = email;
        GlobalVariables.password = password;
    }
}
