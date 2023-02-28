import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Apparel_PO extends BaseClass{

    WebDriver driver;
    Apparel_PO(WebDriver driver){
        super(driver);
        this.driver= driver;
    }
    By appreal = By.xpath("(//a[contains(text(),\"Apparel \")])[1]");

    public void clickApparel(){
        clickSomething(appreal);
    }

    By shoes = By.xpath("//img[@alt=\"Picture for category Shoes\"]");
    public void ClickShoes(){
        clickSomething(shoes);
    }

    By shoesAddToCart = By.xpath("(//button[contains(text(),\"Add to cart\")])[2]");
    public void ShoesAddToCart(){
        clickSomething(shoesAddToCart);
    }
    By ShoesAddToCart2 = By.xpath("//button[contains(text(),\"Add to cart\")]");
    public void ShoesAddToCart2(){
        clickSomething(ShoesAddToCart2);
    }



}
