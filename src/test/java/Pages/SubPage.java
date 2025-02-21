package Pages;

import Driver.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class SubPage extends DriverBase {
    WebDriver driver;
    WebDriverWait wait;
    By usernameby = By.id("user_login");
    By pwdby = By.id("user_pass");
    By buttonby = By.id("wp-submit");
    By privateGroupby = By.xpath("//*[@id=\"top-menu\"]/li[3]/a");
    By joinby = By.xpath("//*[@id=\"post-289\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[4]/a");
    By postalCodeby = By.id("mepr_iranyitoszam1");
    By cityby = By.id("mepr_varos1");
    By streetby = By.id("mepr_utca_hazszam1");
    By companyby = By.id("mepr_cegnev1");
    By taxby = By.id("mepr_adoszam1");
    By acceptby = By.id("mepr_agree_to_tos1");
    By policyby = By.id("mepr_agree_to_privacy_policy1");

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

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://cryptofalka.hu/csatlakozz-a-kriptovaluta-kozosseghez-legy-falka-tag-1-honapra/");
    }
    public void sub2Page() throws InterruptedException{
        WebElement postalCode = driver.findElement(postalCodeby);
        postalCode.sendKeys("10250");

        WebElement city = driver.findElement(cityby);
        city.sendKeys("Los Angeles");

        WebElement street = driver.findElement(streetby);
        street.sendKeys("Santa Monica Blvd");

        WebElement companyName = driver.findElement(companyby);
        companyName.sendKeys("Memmingen Ltd.");

        WebElement taxId = driver.findElement(taxby);
        taxId.sendKeys("77777");

        WebElement acceptCheckBox = driver.findElement(acceptby);
        acceptCheckBox.click();

        WebElement privacyPolicy = driver.findElement(policyby);
        privacyPolicy.click();



    }
}
