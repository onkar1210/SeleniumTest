import BasePackage.Base;
import ModulePackage.FillTheFormModule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StockIndicesDropdownTest extends Base {
    @Test
    public void nifty50IndiceTest(){
        Assert.assertEquals(driver.getTitle(),"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");

    }
}
