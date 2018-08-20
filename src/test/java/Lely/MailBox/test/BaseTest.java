package Lely.MailBox.test;

import Lely.MailBox.pages.LoginPage_FB;
import Lely.MailBox.pages.LoginPage_VK;
import Lely.MailBox.pages.LogoutPage_FB;
import Lely.MailBox.pages.LogoutPage_VK;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.*;
import Lely.MailBox.utility.Constant;

public class BaseTest {

    public static String browser;
    public static WebDriver driver;

    private LoginPage_FB loginPage_fb;
    private LoginPage_VK loginPage_vk;
    private LogoutPage_FB logoutPage_fb;
    private LogoutPage_VK logoutPage_vk;

    public BaseTest(String browser)
    {
        this.browser = browser;
    }

    @Parameters("browser")
    @BeforeMethod
    protected WebDriver getWebDriver(String browser)
    {
        if(browser.equals("chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            System.setProperty("webdriver.chrome.driver", "/home/user/Documents/chromedriver");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }

        else if(browser.equals("firefox"))
        {
            FirefoxProfile ffprofile = new FirefoxProfile();
            ffprofile.setPreference("dom.webnotifications.enabled", false);
            FirefoxOptions options = new FirefoxOptions().setProfile(ffprofile);
            System.setProperty("webdriver.gecko.driver", "/home/user/Documents/geckodriver");
            driver = new FirefoxDriver(options);
            driver.manage().window().maximize();
        }
        loginPage_fb = new LoginPage_FB(driver);
        logoutPage_fb = new LogoutPage_FB(driver);
        loginPage_vk = new LoginPage_VK(driver);
        logoutPage_vk = new LogoutPage_VK(driver);
        return driver;
    }

        public void inputLogin_FB() throws Exception
    {
        loginPage_fb.inputLogin_FB(Constant.Username_fb,Constant.Password_fb);
    }

    public void inputLogin_VK() throws Exception
    {
        loginPage_vk.inputLogin_VK(Constant.Username_vk,Constant.Password_vk);
    }

    public void Logout_FB() throws Exception
    {
        logoutPage_fb.Logout_FB();
    }

    public void Logout_VK() throws Exception
    {
        logoutPage_vk.Logout_VK();
    }

    @AfterMethod
    protected void tearDown()
    {
        if(driver != null)
            driver.quit();
    }

}
