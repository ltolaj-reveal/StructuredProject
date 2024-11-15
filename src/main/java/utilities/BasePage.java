package utilities;

import globals.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasePage {

    // qasje statike vetem brenda klases
    private static WebDriver driver;


    public static BasePage getBasePage(){
        return new BasePage();
    }


    public static WebDriver getDriver(){
        if (driver == null){
            String browserType = GlobalVariables.browserType.toLowerCase();
            switch (browserType){
                case "chrome" -> {
                    System.setProperty(GlobalVariables.webdriverKey_chrome, GlobalVariables.webdriverPath_chrome);
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                }
                case "safari" -> {
                    System.setProperty(GlobalVariables.webdriverKey_safari, GlobalVariables.webdriverPath_safari);
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                }
                default -> throw new WebDriverException("Check your webdriver properties");
            }
        }
        return driver;
    }
}
