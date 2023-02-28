import org.testng.annotations.Test;

public class Apparel_TestCase extends BaseTest{

    @Test
    public void appreal_Test(){
        Apparel_PO apparelPo = new Apparel_PO(driver);
        apparelPo.clickApparel();
        apparelPo.ClickShoes();
        apparelPo.ShoesAddToCart();
        apparelPo.ShoesAddToCart2();
    }

}
