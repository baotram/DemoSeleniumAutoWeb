package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserPage extends BasePage{
    By addUserBtn = By.xpath("//*[@href=\"https://pw-practice-dev.playwrightvn.com/wp-admin/user-new.php\" and normalize-space() = \"Add User\"]");

    public UserPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAddUserBtnDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(addUserBtn)).isDisplayed();
    }
}
