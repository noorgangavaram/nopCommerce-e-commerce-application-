import org.testng.annotations.Test;

public class Electronic_TestCase extends BaseTest{

    @Test
    public void elctronicTestCase(){
        Electronics_PO electronicsPo = new Electronics_PO(driver);

        electronicsPo.HoverToElectronics();
        electronicsPo.clickCamera();
        electronicsPo.ClickAddToCart();
        electronicsPo.ClickAddToCart2();

    }

}
