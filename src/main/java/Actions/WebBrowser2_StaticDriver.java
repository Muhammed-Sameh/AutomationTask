package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebBrowser2_StaticDriver {
    public static WebDriver driver;
    public void initWebDriver(String browser){
        if(browser.toLowerCase().equals(Browsers.CHROME.toString())) {
         driver=new ChromeDriver();
        } else if (browser.toLowerCase().equals(Browsers.FIREFOX.toString())) {
         driver=new FirefoxDriver();
        }
    }
    public enum Browsers {
        CHROME,
        FIREFOX
    }
}
