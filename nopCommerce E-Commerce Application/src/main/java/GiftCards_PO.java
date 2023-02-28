import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GiftCards_PO extends BaseClass{

    WebDriver driver;
    GiftCards_PO(WebDriver driver){
        super(driver);
        this.driver= driver;
    }

    By Giftcard = By.xpath("(//a[contains(text(),\"Gift Cards \")])[1]");
    public void clickGiftCard(){
        clickSomething(Giftcard);
    }

    By ClickTheImage = By.xpath("(//a[contains(text(),\"$50 Physical Gift Card\")])[2]");
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    public void clickTheImage(){
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        executor.executeScript("arguments[0].click()",ClickTheImage);
    }

}
