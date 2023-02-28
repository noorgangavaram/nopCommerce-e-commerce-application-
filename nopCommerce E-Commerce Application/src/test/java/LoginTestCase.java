import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestCase extends BaseTest{
    @Test
    @Parameters({"mail","pwd"})
    public void OpencartLogin(String mail,String pwd) throws InterruptedException {
        nopCommerce_Login_PO opencartLoginPo = new nopCommerce_Login_PO(driver);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        opencartLoginPo.LoginBtn();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        opencartLoginPo.EnterMailId(mail);
        opencartLoginPo.EnterPassword(pwd);
        opencartLoginPo.PressLoginBtn();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
