package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static Actions.WebBrowser2_StaticDriver.driver;
public class UIActions2_StaticDriver {
    public void navigateToPage(String URL, By locator ){
        driver.navigate().to(URL);
        waitUntil(locator, expectedConditionsEnum.PresenceOfElement);
    }
    public void click(By element,By expectedElement){
        waitUntil(element,expectedConditionsEnum.ElementToBeClickable);
        WebElement element1= driver.findElement(element);
        element1.click();
        element1.click();
        waitUntil(expectedElement,expectedConditionsEnum.PresenceOfElement);
    }
    public void waitUntil(By locator,expectedConditionsEnum condition){
        switch (condition) {

            case expectedConditionsEnum.PresenceOfElement:
                new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(locator));
            break;

            case expectedConditionsEnum.ElementToBeClickable:
                new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(locator));
            break;

        }
        }
    public enum expectedConditionsEnum{
        PresenceOfElement,
        ElementToBeClickable
    }
}
