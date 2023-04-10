package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class FunctionsPage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;

    By homePageby = By.xpath("//*[@id=\"et-secondary-nav\"]/li[1]/a");
    By signby = By.xpath("//*[@id=\"post-162\"]/div/div/div/div[1]/div/div[2]/div[1]/div/h1[2]/strong");
    By contentby = By.xpath("//*[@id=\"et-secondary-nav\"]/li[2]/a");
    By myProfileby = By.id("mepr-account-home");
    By usernameby = By.id("user_login");
    By pwdby = By.id("user_pass");
    By buttonby = By.id("wp-submit");
    By membershipby = By.id("mepr-account-payments");
    By newsby = By.xpath("//*[@id=\"top-menu\"]/li[2]/a");
    By privateGroupby = By.xpath("//*[@id=\"top-menu\"]/li[3]/a");
    By joinby = By.xpath("//*[@id=\"post-289\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[4]/a");
    By mentoringby = By.xpath("//*[@id=\"top-menu\"]/li[4]/a");
    By aboutby = By.xpath("//*[@id=\"top-menu\"]/li[6]/a");
    By partnerby = By.xpath("//*[@id=\"post-29332\"]/div/div[1]/div/div[3]/div/div[1]/div[3]/a");


    public FunctionsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void pageFunctions() throws InterruptedException{
        WebElement fillUsername = driver.findElement(usernameby);
        WebElement fillPwd = driver.findElement(pwdby);

        fillUsername.sendKeys("adamfbn");
        fillPwd.sendKeys("FarCry5Boomer");

        WebElement clickOnButton = driver.findElement(buttonby);
        clickOnButton.click();

        WebElement clickOnHomePage = driver.findElement(homePageby);
        clickOnHomePage.click();
        WebElement checkSign = driver.findElement(signby);
        Assert.assertEquals(checkSign.getText(), "KERESKEDŐ KÖZÖSSÉG?");

        WebElement clickOnContentBtn = driver.findElement(contentby);
        clickOnContentBtn.click();
        WebElement myProfileCheck = driver.findElement(myProfileby);
        Assert.assertEquals(myProfileCheck.getText(), "Saját profil");
        myProfileCheck.click();

        WebElement clickOnMembership = driver.findElement(membershipby);
        clickOnMembership.click();

        WebElement clickOnNews = driver.findElement(newsby);
        clickOnNews.click();

        WebElement clickOnPrivateGroup = driver.findElement(privateGroupby);
        clickOnPrivateGroup.click();

        WebElement joinBtn = driver.findElement(joinby);
        new Actions(driver)
                .scrollToElement(joinBtn)
                .perform();
        joinBtn.click();

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        WebElement mentor = driver.findElement(mentoringby);
        mentor.click();

        WebElement about = driver.findElement(aboutby);
        about.click();

        WebElement partner = driver.findElement(partnerby);
        new Actions(driver)
                .scrollToElement(partner)
                .perform();
        partner.click();

    }


}
