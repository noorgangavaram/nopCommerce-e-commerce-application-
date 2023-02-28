/*
    This page stores all
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Electronics_PO extends BaseClass{

    WebDriver driver;
    Electronics_PO(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    //This is the Electronic of
    //WebElement electronics = driver.findElement(By.xpath("(//a[contains(text(),\"Electronics \")])[1]"));
    By electronics = By.xpath("(//a[contains(text(),\"Electronics \")])[1]");
    public void HoverToElectronics(){
       /* Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions.moveToElement(electronics);*/
        clickSomething(electronics);
    }

    By camera = By.xpath("//img[@alt=\"Picture for category Camera & photo\"]");
    public void clickCamera(){
        clickSomething(camera);
    }

    //Scroll Upside
    public void scroolPageDown(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        executor.executeScript("scroll(0,0)");
    }

    By addtocart = By.xpath("(//button[contains(text(),\"Add to cart\")])[1]");

    public void ClickAddToCart(){
        clickSomething(addtocart);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    By addtocart2 = By.xpath("(//button[contains(text(),\"Add to cart\")])[1]");
    public void ClickAddToCart2(){
        clickSomething(addtocart2);
    }



}
