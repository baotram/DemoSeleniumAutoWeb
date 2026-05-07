package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.List;

public class DashboardTest extends BaseTest {
    @Test
    public void testMenuAdmin() {
        DashboardPage dashboardPage = new LoginPage(driver).loginAdmin();
        List<String> listItems = List.of("Posts", "Media", "Pages", "Users", "Tools", "Settings", "Comment");
        for (String item : listItems) {
            By xpathMenu = dashboardPage.xpathMenu(item);
            System.out.println(">>>>>"+xpathMenu);
            Assert.assertTrue(dashboardPage.isMenuItemAdminDisplayed(xpathMenu));
        }
    }
}
