import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Shopping_TestCase extends BaseTest{


    @Parameters({"serch","qty","zipCode"})
    @Test
    public void ShoppingTestCase(String serch,String qty,String zipCode){
        Shopping_PO shoppingPo = new Shopping_PO(driver);
        shoppingPo.ClickSerch(serch);
        shoppingPo.SelectLaptop();
        shoppingPo.scroolPageUP();
        shoppingPo.LaptopQuantity(qty);
        shoppingPo.AddTOCart();
        shoppingPo.scroolPageDown();
        shoppingPo.CheckOut();
        shoppingPo.scroolPagedown();
        shoppingPo.EstimateShipping();
        shoppingPo.SelectCountry();
        shoppingPo.EnterzipCode(zipCode);
        shoppingPo.CloseBox();
        shoppingPo.scroolDown();
        shoppingPo.TermsAndConditions();
    }

}
