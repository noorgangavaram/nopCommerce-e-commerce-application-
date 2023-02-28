import org.testng.annotations.Test;

public class Jewelry_TestCase extends BaseTest{
    @Test
    public void jewelryTestCase() throws InterruptedException {
        Jewelry_PO jewelryPo = new Jewelry_PO(driver);
        jewelryPo.clickJewelry();
        Thread.sleep(3000);
        jewelryPo.ClickRent();
        Thread.sleep(3000);
        jewelryPo.clickDate();
        Thread.sleep(3000);
        jewelryPo.selectDate();
        Thread.sleep(3000);
        jewelryPo.ClickEndDate();
        Thread.sleep(3000);
        jewelryPo.Selectdate23();
        Thread.sleep(4000);
        jewelryPo.ClickRentbutton();
        Thread.sleep(4000);
    }
}
