package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

public class LoginPage {
    WebDriver driver;
//    Locator of login page
    By usernameField = By.id("user_login");
    By passwordField = By.id("user_pass");
    By submitBtn = By.id("wp-submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
//    Interact with page
    public void enterUsername(String user){
        driver.findElement(usernameField).sendKeys(user);
    }

    public void enterPassword(String pass){
        driver.findElement(passwordField).sendKeys(pass);
    }

    public void clickBtnSubmit(){
        driver.findElement(submitBtn).click();
    }

    public DashboardPage login(String user, String pass){
        enterUsername(user);
        enterPassword(pass);
        clickBtnSubmit();
        return new DashboardPage(driver);
    }

    public DashboardPage loginAdmin(){
        driver.get(ConfigReader.getValue("url"));
        enterUsername("betterbytes.academy.admin");
        enterPassword("StrongPass@BetterBytesAcademy");
        clickBtnSubmit();
        return new DashboardPage(driver);
    }
}
