package Lely.MailBox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_VK extends BasePage
{

    @FindBy(id = "email")
    public WebElement loginfield_VK;

    @FindBy(id = "pass")
    public WebElement passfield_VK;

    @FindBy(id = "login_button")
    public WebElement loginbutton_VK;

    public LoginPage_VK(WebDriver driver)
    {
        super(driver);
    }

    public void inputLogin_VK(String login, String password)
    {
        loginfield_VK.sendKeys(login);
        passfield_VK.sendKeys(password);
        loginbutton_VK.click();
    }

}
