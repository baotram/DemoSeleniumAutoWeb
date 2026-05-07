package tests;

import base.BaseSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

public class BaseTest {

    public WebDriver driver;
    @BeforeMethod
    public void createDriver(){
        // Lấy trình duyệt từ file config thay vì hard-code
        driver = BaseSetup.setupDriver();
    }

    @AfterMethod
    public void closeDriver(){
        if(driver != null) driver.quit();
    }
}
