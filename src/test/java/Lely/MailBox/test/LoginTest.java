package Lely.MailBox.test;

import org.testng.annotations.Test;
import Lely.MailBox.utility.Constant;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest

{
    public LoginTest(String browser)
    {
        super(browser);
    }

    @Test(priority = 0)
    public void test_FB() throws Exception
    {
        driver.get(Constant.URL_fb);
        inputLogin_FB();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Logout_FB();
    }

    @Test(priority = 1)
    public void test_VK() throws Exception
    {
        driver.get(Constant.URL_vk);
        inputLogin_VK();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Logout_VK();
    }
}
