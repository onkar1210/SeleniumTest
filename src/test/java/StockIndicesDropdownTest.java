import ModulePackage.StockIndicesDropdownModule;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StockIndicesDropdownTest extends StockIndicesDropdownModule {
    @Test
    public void nifty50IndiceTest(){
        Assert.assertEquals(driver.getTitle(),"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");

    }
}
