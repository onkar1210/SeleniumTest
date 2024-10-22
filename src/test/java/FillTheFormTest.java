import BasePackage.Base;
import BasePackage.ChildBase;
import ModulePackage.FillTheFormModule;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FillTheFormTest extends ChildBase {
    @Test
    public void fillTheFormTest(){
        FillTheFormModule FillTheFormModule = new FillTheFormModule();

        FillTheFormModule.fillTheform();


    }
}
