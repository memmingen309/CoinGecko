package Testcases;

import Driver.DriverBase;
import Pages.HomePage;
import Pages.LogInPage;
import org.testng.annotations.Test;

public class LogInPageTest extends DriverBase {
    LogInPage logInPage;
    HomePage homePage;

    @Test
    public void Login() throws InterruptedException{
        logInPage = new LogInPage(driver,wait);
        homePage = new HomePage(driver, wait);

        homePage.loadHomePage();
        homePage.logIn();
        logInPage.validUserNameValidPwd();
        logInPage.emptyUserNameEmptyPwd();
        logInPage.validUsernameEmptyPwd();
    }
}
