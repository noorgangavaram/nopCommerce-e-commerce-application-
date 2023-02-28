import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    WebDriver driver;

    // This is the base class constructor
    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSomething(By locator){
        driver.findElement(locator).click();
    }

    public void sendKeysSomthing(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }
}
