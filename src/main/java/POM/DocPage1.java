package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocPage1 {
    WebDriver driver;
    String doc1="//div[@class=\"left\" and contains(normalize-space(text()),'Exchange a Waiver')]/following-sibling::div/descendant::span[text()='Free']";
    public DocPage1(WebDriver driver){
        this.driver=driver;
    }
    public String getPrice(){
        WebElement price= driver.findElement(By.xpath(doc1));
        new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.visibilityOf(price));
        return price.getText();
    }
}
