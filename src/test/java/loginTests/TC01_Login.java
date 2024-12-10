package loginTests;

import globals.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.LoginPageSteps;
import utilities.BasePage;

public class TC01_Login {

    private final WebDriver driver = BasePage.getDriver();
    LoginPageSteps login = new LoginPageSteps();

    public TC01_Login(){
        PageFactory.initElements(driver, this);
        init();
    }

    @BeforeTest
    public void init(){
        if (Boolean.FALSE.equals(GlobalVariables.isUrlOpened)){
            driver.get(GlobalVariables.loginUrl);
            GlobalVariables.isUrlOpened = true;
        }
    }

    @Test
    public void testLoginWithCredentials(){
        login.setEmail(GlobalVariables.email);
        login.setPassword(GlobalVariables.password);
        login.clickLoginButton();
    }

    @AfterTest
    public void terminate(){
        driver.close();
        driver.quit();
    }
}
