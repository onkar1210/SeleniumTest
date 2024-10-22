package PoPackage;
import BasePackage.Base;
import BasePackage.ChildBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoQAHomePagePO extends ChildBase {


    public By form = By.xpath("//div[@class='category-cards']//*[contains(normalize-space(text()),'Forms')]/parent::div/preceding-sibling::div/..");
    public By iframe = By.xpath("//iframe[@name='goog_topics_frame']");
    public By links = By.tagName("a");


    public void switchIFrame(){
        driver.switchTo().frame(driver.findElement(iframe));
    }

    public void clickFormLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(form));
        driver.findElement(form).click();
    }

    public List<String> getLinksOnThePage() throws IOException {
        List<WebElement> urlWebElements = driver.findElements(links);
        List<String> urls = new ArrayList<String>();
        takeScreenshot();

        for(WebElement urlWebElement : urlWebElements){
            if(urlWebElement.isDisplayed()) {
                urls.add(urlWebElement.getAttribute("href"));
                System.out.println(urlWebElement.getAttribute("href"));
            }
        }
        return urls;
    }
}
