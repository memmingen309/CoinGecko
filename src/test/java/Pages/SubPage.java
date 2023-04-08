package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SubPage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;
    By usernameby = By.id("user_login");
    By pwdby = By.id("user_pass");
    By buttonby = By.id("wp-submit");
    By privateGroupby = By.xpath("//*[@id=\"top-menu\"]/li[3]/a");
    By joinby = By.xpath("//*[@id=\"post-289\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[4]/a");
    By postalCodeby = By.id("mepr_iranyitoszam1");

    public SubPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void sub() throws InterruptedException{
        WebElement fillUsername = driver.findElement(usernameby);
        WebElement fillPwd = driver.findElement(pwdby);

        fillUsername.sendKeys("adamfbn");
        fillPwd.sendKeys("FarCry5Boomer");

        WebElement clickOnButton = driver.findElement(buttonby);
        clickOnButton.click();
        WebElement clickOnPrivateGroup = driver.findElement(privateGroupby);
        clickOnPrivateGroup.click();

        WebElement joinBtn = driver.findElement(joinby);
        new Actions(driver)
                .scrollToElement(joinBtn)
                .perform();
        joinBtn.click();

    }
}
