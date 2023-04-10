package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;
    By searchby = By.id("et_search_icon");

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void searchTest() throws InterruptedException {

        WebElement search = driver.findElement(searchby);

    }
}
