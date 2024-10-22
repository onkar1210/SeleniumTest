package BasePackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ChildBase extends Base{

    public void takeScreenshot() throws IOException {
        String filePath = System.getProperty("user.dir") + "/screenshots/" + generateFileName();
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile , new File(filePath));
    }

    public String generateFileName(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String date = dateFormat.format(new Date());
        String filename = date + ".png";
        return filename;
    }


}
