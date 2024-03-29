package POM;

import Actions.UIActions1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    String homePageURL="https://www.levelset.com/";
    String getpaid="//a[contains(text(),'Get paid')]",
    document="//div[@class=\"left\" and contains(normalize-space(text()),'Exchange a Waiver')]/following-sibling::div/descendant::span[text()='Free']";
    WebDriver driver;
    UIActions1 uiActions;
    public HomePage(WebDriver driver){
        //this.driver=driver;
        uiActions=new UIActions1(driver);
    }
    public void navigateToHome(){
        //uiActions.navigateToPage(homePageURL, new By.ByXPath(getpaid));
        uiActions.navigateToPage(homePageURL,By.xpath(getpaid));
    }
    public void clickOnGetPaid(){
        uiActions.clickOn(By.xpath(getpaid),By.xpath(document));
    }
}
