import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This Page Object contains all the methods and locators

public class nopCommerce_Login_PO extends BaseClass{

    WebDriver driver;

    //This is the constructor
    nopCommerce_Login_PO(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By LoginButton = By.xpath("//a[contains(text(),\"Log in\")]");
    public void LoginBtn(){
        clickSomething(LoginButton);
    }

    By MailId = By.xpath("//input[@id=\"Email\"]");
    public void EnterMailId(String mail){

        sendKeysSomthing(MailId,mail);
    }

    By Password = By.xpath("//input[@id=\"Password\"]");
    public void EnterPassword(String pass){
        sendKeysSomthing(Password,pass);
    }

    By loginBtn = By.xpath("//button[contains(text(),\"Log in\")]");
    public void PressLoginBtn(){
        clickSomething(loginBtn);
    }

}
