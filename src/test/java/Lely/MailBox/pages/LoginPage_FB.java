package Lely.MailBox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_FB extends BasePage
{
    @FindBy(id = "email")
    public WebElement loginfield_FB;

    @FindBy(id = "pass")
    public WebElement passfield_FB;

    @FindBy(id = "loginbutton")
    public WebElement loginbutton_FB;

    public LoginPage_FB(WebDriver driver)
    {
        super(driver);
    }

    public void inputLogin_FB(String login, String password)
    {
        loginfield_FB.sendKeys(login);
        passfield_FB.sendKeys(password);
        loginbutton_FB.click();
    }

}
