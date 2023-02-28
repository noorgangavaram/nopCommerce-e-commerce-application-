import org.testng.annotations.Test;

public class GiftCard_TestCase extends BaseTest{
    @Test
    public void giftCardTestcase(){
        GiftCards_PO giftCardsPo = new GiftCards_PO(driver);
        giftCardsPo.clickGiftCard();
        giftCardsPo.clickTheImage();
    }

}
