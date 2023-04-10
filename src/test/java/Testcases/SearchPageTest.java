package Testcases;

import Driver.DriverBase;
import Pages.HomePage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class SearchPageTest extends DriverBase {
    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void searchTest() throws InterruptedException{
        homePage = new HomePage(driver, wait);
        searchPage = new SearchPage(driver, wait);

        homePage.loadHomePage();
        searchPage.searchTest();
    }
}
