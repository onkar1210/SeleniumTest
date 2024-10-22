package PoPackage;

import BasePackage.Base;
import BasePackage.ChildBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class PracticeFormPO extends ChildBase {

    public By practice_form = By.xpath("//*[contains(@class,'menu-list')]//*[contains(normalize-space(text()),'Practice Form')]");
    public By Form_Title = By.xpath("//*[contains(normalize-space(text()),'Student Registration Form')]");
    public By nameField = By.id("firstName");
    public By chooseFile = By.id("uploadPicture");



    public void clickPracticeFormLink(){
        driver.findElement(practice_form).click();
    }

    public String getTitleOfThePage(){
        return driver.getTitle().trim();
    }

    public String getTitleOfForm(){
        return driver.findElement(Form_Title).getText().trim();
    }

    public String getPlaceHolderTextOfNameField(){
        return driver.findElement(nameField).getAttribute("placeholder").trim();
    }

    public void browsFile(String file){
        driver.findElement(chooseFile).sendKeys(System.getProperty("user.dir") + file);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            takeScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
