package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends DriverBase {

    WebDriver driver;
    WebDriverWait wait;

    By cookieby = By.xpath("/html/body/div[2]/div/span");
    By logInby = By.xpath("//*[@id=\"top-menu\"]/li[7]/a");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public  void loadHomePage() throws InterruptedException {
        driver.get("https://cryptofalka.hu/");
        Thread.sleep(1000);
        WebElement findTheCookieBtn = driver.findElement(cookieby);
        findTheCookieBtn.click();
    }

    public void logIn() throws InterruptedException{
        WebElement findLogInButton = driver.findElement(logInby);
        findLogInButton.click();
        Thread.sleep(1000);
    }
}
