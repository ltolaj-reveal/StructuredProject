package registerTests;

import globals.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.RegisterPageSteps;
import utilities.BasePage;

public class TC01_Register {
    private final WebDriver driver = BasePage.getDriver();
    RegisterPageSteps register = new RegisterPageSteps();

    public TC01_Register(){
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
    public void testRegister(){
        register.registerAndSetCredentials(
                GlobalVariables.name,
                GlobalVariables.lastname,
                GlobalVariables.email,
                GlobalVariables.password
        );
    }

    @AfterTest
    public void terminate(){
        driver.close();
        driver.quit();
    }
}
