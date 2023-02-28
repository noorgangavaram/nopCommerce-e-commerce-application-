import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Jewelry_PO extends BaseClass{

    WebDriver driver;
    Jewelry_PO(WebDriver driver){
        super(driver);
        this.driver= driver;
    }

    By jewelry = By.xpath("(//a[contains(text(),\"Jewelry \")])[1]");
    public void clickJewelry(){
        clickSomething(jewelry);
    }
    By rentNeckLess = By.xpath("//button[contains(text(),\"Rent\")]");
    public void ClickRent(){
        clickSomething(rentNeckLess);
    }

    By startdate = By.xpath("//input[@id=\"rental_start_date_40\"]");
    public void clickDate(){
        clickSomething(startdate);
    }
    By date15 = By.xpath("//a[contains(text(),\"15\")]");
    public void selectDate(){
        clickSomething(date15);
    }

    By EndDate = By.xpath("//input[@id=\"rental_end_date_40\"]");

    public void ClickEndDate(){
        clickSomething(EndDate);
    }

    By date23 = By.xpath("//a[@data-date=\"23\"]");
    public void Selectdate23(){
        clickSomething(date23);
    }

    By clickRent = By.xpath("//button[contains(text(),\"Rent\")]");
    public void ClickRentbutton(){
        clickSomething(clickRent);
    }
}
