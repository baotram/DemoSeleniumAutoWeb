package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginSuccess() throws InterruptedException {
        driver.get(ConfigReader.getValue("url"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("betterbytes.academy.admin","StrongPass@BetterBytesAcademy");
        Assert.assertTrue(driver.getCurrentUrl().contains("wp-admin"));
    }

}
