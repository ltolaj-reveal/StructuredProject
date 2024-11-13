package registerTests;

import globals.GlobalVariables;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.RegisterPageSteps;
import utilities.BasePage;

public class TC01_Register {
    RegisterPageSteps register = new RegisterPageSteps();

    WebDriver driver = BasePage.getInstance().driver;

    public TC01_Register(){
        PageFactory.initElements(driver, this);
    }

    @BeforeTest
    public void init(){
        driver.get(GlobalVariables.registerUrl);
    }

    @Test
    public void testRegister() throws InterruptedException {
        register.registerAndSetCredentials(
                GlobalVariables.name,
                GlobalVariables.lastname,
                GlobalVariables.day,
                GlobalVariables.month,
                GlobalVariables.year,
                GlobalVariables.email,
                GlobalVariables.company,
                GlobalVariables.password
        );
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void terminate(){
        driver.quit();
        driver.close();
    }
}
