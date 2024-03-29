package POM;

import Actions.UIActions2_StaticDriver;
import org.openqa.selenium.By;

public class HomePage2 {
    String homePageURL="https://www.levelset.com/";
    String getPaid = "//a[contains(text(),'Get paid')]",
    document="//div[@class=\"left\" and contains(normalize-space(text()),'Exchange a Waiver')]/following-sibling::div/descendant::span[text()='Free']";

    UIActions2_StaticDriver uiActions=new UIActions2_StaticDriver();
    public void navigateToHomePage(){
        uiActions.navigateToPage(homePageURL, By.xpath(getPaid));
    }
    public void clickOnGetPaid(){
        uiActions.click(By.xpath(getPaid),By.xpath(document));
    }

}
