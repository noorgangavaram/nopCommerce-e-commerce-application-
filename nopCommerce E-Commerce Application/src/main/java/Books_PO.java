import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Books_PO extends BaseClass{

    WebDriver driver;
    Books_PO(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By Books = By.xpath("//a[contains(text(),\"Books \")]");
    public void clickBooks(){
        clickSomething(Books);
    }

    By addTocartBUTTON = By.xpath("(//button[contains(text(),\"Add to cart\")])[2]");
    public void clickAddtocart(){
        clickSomething(addTocartBUTTON);
    }

    //Check the book is present in the cart or not

    By checkAddTocart = By.xpath("//span[contains(text(),\"Shopping cart\")]");
    public void clickCheckAddToCart(){
        clickSomething(checkAddTocart);
    }

}
