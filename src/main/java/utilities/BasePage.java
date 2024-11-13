package utilities;

import globals.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    public static WebDriver driver;
    public static BasePage instance = null;

    public BasePage(){
        initElements();
    }

    public static BasePage getInstance(){
        if (instance == null){
            instance = new BasePage();
        }
        return instance;
    }

    public void initElements(){
        System.setProperty(GlobalVariables.webdriverKey, GlobalVariables.webdriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
