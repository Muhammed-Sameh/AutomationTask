
import Actions.WebBrowser1;
import POM.DocPage1;
import POM.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsePomAndBrowserActions1 {
    HomePage home;
    DocPage1 doc;
    WebBrowser1 browserActions;
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        browserActions=new WebBrowser1();
        driver= browserActions.initWebDriver("chrome");

        home=new HomePage(driver);
        doc=new DocPage1(driver);
    }

    @Test
    public void checkItemPriceTest() {
        home.navigateToHome();
        home.clickOnGetPaid();

        Assert.assertEquals(doc.getPrice(),"Free","Not the same price!!");
    }
}