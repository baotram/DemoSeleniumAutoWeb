package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.UserPage;

public class UsersTest extends BaseTest {

    @Test
    public void verifyUserPageDisplayed() {
        DashboardPage dashboardPage = new LoginPage(driver).loginAdmin();
        UserPage userPage = dashboardPage.goToUserPage();
        userPage.isAddUserBtnDisplayed();
    }
}
