package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser1 {
    WebDriver driver;
    public WebBrowser1(){}
    public WebDriver initWebDriver(String browser){
        if(browser.equals("chrome")){
            driver=new ChromeDriver();
            return driver;
        }else if (browser.equals("firefox")){
            driver=new FirefoxDriver();
            return driver;
        }else
            return null;
    }
    public void maximizeScreen(){
        driver.manage().window().maximize();
    }
    public void closeDriver(){
        driver.close();
    }
    public void quitDriver(){
        driver.quit();
    }

}
