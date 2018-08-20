package Lely.MailBox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LogoutPage_VK extends BasePage
{
    public LogoutPage_VK(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "top_profile_link")
    private WebElement userNavigation_VK;

    @FindBy(id= "top_logout_link")
    private WebElement buttonLogout_VK;

    public void Logout_VK()
    {
        userNavigation_VK.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        buttonLogout_VK.click();
    }

}
