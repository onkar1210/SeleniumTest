package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base {

    protected WebDriver driver;
    @Parameters("browser")
    @BeforeMethod
    public void launchBrowser(String browser) {
        String URL="https://www.rediff.com/";
//        System.setProperty("webdriver.edge.driver","Path od driver in your project");
        if(browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}