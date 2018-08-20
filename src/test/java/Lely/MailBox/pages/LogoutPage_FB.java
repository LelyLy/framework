package Lely.MailBox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LogoutPage_FB extends BasePage
{
    public LogoutPage_FB(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "userNavigationLabel")
    private WebElement userNavigationLabel_FB;

    @FindBy(xpath = "//li[12]/a/span/span")
    private WebElement buttonLogout_FB;

    public void Logout_FB()
    {
        userNavigationLabel_FB.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        buttonLogout_FB.click();
    }

}
