package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogInPage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;

    By usernameby = By.id("user_login");
    By pwdby = By.id("user_pass");
    By buttonby = By.id("wp-submit");
    By signoutby = By.xpath("//*[@id=\"et-secondary-nav\"]/li[4]/a");
    By logInby = By.xpath("//*[@id=\"top-menu\"]/li[7]/a");
    By errormessageby = By.xpath("//*[@id=\"mepr_jump\"]/ul/li[1]/strong");

    public LogInPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void validUserNameValidPwd() throws InterruptedException{
        WebElement fillUsername = driver.findElement(usernameby);
        WebElement fillPwd = driver.findElement(pwdby);

        fillUsername.sendKeys("adamfbn");
        fillPwd.sendKeys("FarCry5Boomer");

        WebElement clickOnButton = driver.findElement(buttonby);
        clickOnButton.click();
        WebElement clickOnSignOut = driver.findElement(signoutby);
        clickOnSignOut.click();
    }

    public void emptyUserNameEmptyPwd() throws InterruptedException{
        WebElement findLogInButton = driver.findElement(logInby);
        findLogInButton.click();
        Thread.sleep(1000);

        WebElement fillUsername = driver.findElement(usernameby);
        WebElement fillPwd = driver.findElement(pwdby);

        fillUsername.sendKeys("");
        fillPwd.sendKeys("");
        WebElement clickOnButton = driver.findElement(buttonby);
        clickOnButton.click();

        WebElement errorMessage = driver.findElement(errormessageby);
        Assert.assertEquals(errorMessage.getText(), "Figyelem");
    }

    public void validUsernameEmptyPwd() throws InterruptedException {
        WebElement findLogInButton = driver.findElement(logInby);
        findLogInButton.click();
        Thread.sleep(1000);

        WebElement fillUsername = driver.findElement(usernameby);
        WebElement fillPwd = driver.findElement(pwdby);

        fillUsername.sendKeys("adamfbn");
        fillPwd.sendKeys("");
        WebElement clickOnButton = driver.findElement(buttonby);
        clickOnButton.click();

        WebElement errorMessage = driver.findElement(errormessageby);
        Assert.assertEquals(errorMessage.getText(), "Figyelem");
    }
}
