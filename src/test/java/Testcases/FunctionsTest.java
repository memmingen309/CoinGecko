package Testcases;

import Driver.DriverBase;
import Pages.FunctionsPage;
import Pages.HomePage;
import Pages.LogInPage;
import org.testng.annotations.Test;

public class FunctionsTest extends DriverBase {
    LogInPage logInPage;
    HomePage homePage;

    FunctionsPage functionsPage;

    @Test
    public void functionTests() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        logInPage = new LogInPage(driver, wait);
        functionsPage = new FunctionsPage(driver, wait);

        homePage.loadHomePage();
        homePage.logIn();
        functionsPage.pageFunctions();

    }
}
