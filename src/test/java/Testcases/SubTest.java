package Testcases;

import Driver.DriverBase;
import Pages.FunctionsPage;
import Pages.HomePage;
import Pages.LogInPage;
import Pages.SubPage;
import org.testng.annotations.Test;

public class SubTest extends DriverBase {
    LogInPage logInPage;
    HomePage homePage;
    SubPage subPage;

    @Test
    public void subTests() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);
        subPage = new SubPage(driver, wait);

        homePage.loadHomePage();
        homePage.logIn();
        subPage.sub();
        subPage.sub2Page();
    }
}
