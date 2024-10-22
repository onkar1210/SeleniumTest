package ModulePackage;

import BasePackage.ChildBase;
import PoPackage.DemoQAHomePagePO;
import PoPackage.PracticeFormPO;
import org.testng.Assert;

public class FillTheFormModule{
    ChildBase childBase = new ChildBase();
    DemoQAHomePagePO demoQAHomePagePO = new DemoQAHomePagePO();
    PracticeFormPO practiceFormPO = new PracticeFormPO();

    public void fillTheform(){

        demoQAHomePagePO.clickFormLink();
        Assert.assertEquals(practiceFormPO.getTitleOfThePage(),"DEMOQA");
        practiceFormPO.clickPracticeFormLink();
        Assert.assertEquals(practiceFormPO.getTitleOfForm(), "Student Registration Form");
        Assert.assertEquals(practiceFormPO.getPlaceHolderTextOfNameField(), "First Name");
        uploadAFile();


    }

    public void uploadAFile(){
        practiceFormPO.browsFile(childBase.readProperty("Home_Image_Path"));

    }

}
