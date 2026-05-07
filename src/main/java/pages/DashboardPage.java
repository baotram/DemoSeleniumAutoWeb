package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage{
    String xpathMenu = "//ul[@id = 'adminmenu']//li[contains(normalize-space() , '%s')][1]";

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public By xpathMenu(String item){
        return  By.xpath(String.format(xpathMenu,item));
    }

    public boolean isMenuItemAdminDisplayed(By item){
        return isElementDisplayed(item);
    }

    public UserPage goToUserPage(){
      WebElement xpathMenuUser = wait.until(ExpectedConditions.visibilityOfElementLocated(xpathMenu("Users")));
        xpathMenuUser.click();
        return new UserPage(driver);
    }
}
