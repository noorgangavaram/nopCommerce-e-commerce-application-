import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/*
public class BaseTest {
    WebDriver driver;

    public void openBrowserChrome(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @BeforeClass
    public void openFirefoxBrowser(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
*/
public class BaseTest {

    WebDriver driver;
    String URL = "https://demo.nopcommerce.com/";

    @Parameters("browser")
    @BeforeTest
    public void launchapp(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\IdeaProjects\\nopCommerce E-Commerce Application\\Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } else {
            throw new IllegalArgumentException("The Browser Type is Undefined");
        }
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}