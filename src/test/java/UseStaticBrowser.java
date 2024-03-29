import Actions.WebBrowser2_StaticDriver;
import POM.DocPage1;
import POM.HomePage2;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseStaticBrowser {
    HomePage2 homePage2;
    DocPage1 docPage1;
    WebBrowser2_StaticDriver webBrowser;
    @Test
    public void checkPrice() {
        webBrowser =new WebBrowser2_StaticDriver();
        webBrowser.initWebDriver("chrome");
        homePage2 = new HomePage2();
        homePage2.navigateToHomePage();
        homePage2.clickOnGetPaid();

        //docPage1.getPrice();
        // Assert.assertEquals(docPage1.getPrice(),"Free","Not the same price!!");}
    }
}
