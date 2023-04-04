package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FunctionsPage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;

    By homePageby = By.xpath("//*[@id=\"et-secondary-nav\"]/li[1]/a");
    By contentby = By.xpath("//*[@id=\"et-secondary-nav\"]/li[2]/a");
    By signby = By.xpath("//*[@id=\"post-162\"]/div/div/div/div[1]/div/div[2]/div[1]/div/h1[2]/strong");

    public FunctionsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void pageFunctions() throws InterruptedException{
        WebElement clickOnHomePage = driver.findElement(homePageby);
        clickOnHomePage.click();
        WebElement checkSign = driver.findElement(signby);
        Assert.assertEquals(checkSign.getText(), "KERESKEDŐ KÖZÖSSÉG?");

        WebElement clickOnContentBtn = driver.findElement(contentby);
        clickOnContentBtn.click();

    }


}
