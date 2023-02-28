import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Shopping_PO extends BaseClass{

    WebDriver driver;

    Shopping_PO(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By serch = By.xpath("//input[@id=\"small-searchterms\"]");
    public void ClickSerch(String text){
        sendKeysSomthing(serch,text);
    }

    By clickLaptop = By.xpath("//span[contains(text(),\"Asus N551JK-XO076H Laptop\")]");
    public void SelectLaptop(){
        clickSomething(clickLaptop);
    }

    //Scrool WEBPAGE
    public void scroolPageUP(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("scroll(0,300)");
    }

    //Enter the Quantity of laptop
    By laptopQuantity = By.xpath("//input[@id=\"product_enteredQuantity_5\"]");

    public void LaptopQuantity(String qnty){
        WebElement lapQty = driver.findElement(By.xpath("//input[@id=\"product_enteredQuantity_5\"]"));
        clickSomething(laptopQuantity);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        lapQty.clear();
        sendKeysSomthing(laptopQuantity,qnty);
    }

    //Click the Add to CART button
    By addtocart = By.xpath("//button[@id=\"add-to-cart-button-5\"]");
    public void AddTOCart(){
        clickSomething(addtocart);
    }

    //Scroll Upside
    public void scroolPageDown(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        executor.executeScript("scroll(0,0)");
    }

    //CheckOut the cart
    By checkout = By.xpath("//span[contains(text(),\"Shopping cart\")]");
    public void CheckOut(){
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        clickSomething(checkout);
    }
    //Scroll Upside
    public void scroolPagedown(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        executor.executeScript("scroll(0,300)");
    }

    //Estimate Shipping
    By estimate_shipping = By.xpath("//a[@id=\"open-estimate-shipping-popup\"]");
    public void EstimateShipping(){
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        clickSomething(estimate_shipping);
    }

    //Select Country
    public void SelectCountry(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"CountryId\"]"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("India");
    }

    //Enter ZIP code
    By zipcode = By.xpath("//input[@id=\"ZipPostalCode\"]");
    public void EnterzipCode(String text){
        clickSomething(zipcode);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        sendKeysSomthing(zipcode,text);
    }

    //close the Shipping page
    By close = By.xpath("//button[@title=\"Close (Esc)\"]");
    public void CloseBox(){
        clickSomething(close);
    }

    public void scroolDown(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        executor.executeScript("scroll(0,500)");
    }

    //Check the terms and Checkout
    By termsandconditions = By.xpath("//input[@id=\"termsofservice\"]");
    By checkoutBtn = By.xpath("//button[@id=\"checkout\"]");
    public void TermsAndConditions(){
        clickSomething(termsandconditions);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        clickSomething(checkoutBtn);
    }


}
