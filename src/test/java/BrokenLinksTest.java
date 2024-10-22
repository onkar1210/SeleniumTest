import BasePackage.Base;
import BasePackage.ChildBase;
import ModulePackage.BrokenLinksModule;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenLinksTest extends ChildBase {

    @Test
    public void brokenLinksTest() throws IOException {

        BrokenLinksModule brokenLinksModule = new BrokenLinksModule();

        brokenLinksModule.findTheBrokenLinksOnPage();

    }
}
