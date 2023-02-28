import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;

public class BooksTestCase extends BaseTest{

    @Test
    public void booksTestCase() throws InterruptedException {
        Books_PO booksPo = new Books_PO(driver);
        booksPo.clickBooks();
        booksPo.clickAddtocart();
        Thread.sleep(4000);
        booksPo.clickCheckAddToCart();

    }
}
