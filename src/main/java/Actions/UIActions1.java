package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UIActions1 {
    WebDriver driver;
    public UIActions1(WebDriver driver){
        this.driver=driver;
    }
    public void navigateToPage(String url, By b){
        driver.get(url);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(b));
    }
    public void clickOn(By element,By expectedElement){
        new WebDriverWait(driver,Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(element));

        WebElement element1=driver.findElement(element);
        element1.click();
        element1.click();

        new WebDriverWait(driver,Duration.ofSeconds(30)).
                until(ExpectedConditions.visibilityOfElementLocated(expectedElement));
    }
}
