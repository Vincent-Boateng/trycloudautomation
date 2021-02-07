package com.trycloud.tests;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

@Test(priority = 8, groups="userStory3")
public class US3TC8a_Delete_File_Folder extends TestBase {

    @Test(groups = {"regression", "smoke"})
    public void delete_file_feature_verification_test() {

        WebElement filesTab = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        BrowserUtils.sleep(5);
        filesTab.click();
        BrowserUtils.sleep(5);

        /*
        String filePath = ConfigurationReader.getProperty("filePath");
        WebElement addFile = WebDriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
        BrowserUtils.sleep(3);
        addFile.click();
        WebElement uploadFileButton = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label"));
        BrowserUtils.sleep(10);
        uploadFileButton.sendKeys(filePath);
        BrowserUtils.sleep(5);
         */
        WebElement actionTab = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[4]/td[2]/a/span[2]/a[2]/span[1]"));
        BrowserUtils.sleep(5);
        actionTab.click();
        BrowserUtils.sleep(5);
        WebElement deleteAction = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[4]/td[2]/div/ul/li[8]/a/span[2]"));
        BrowserUtils.sleep(5);
        deleteAction.click();
        BrowserUtils.sleep(5);
        WebElement deletedFile = WebDriverFactory.getDriver().findElement(By.xpath("//span[normalize-space()='Group Work']"));
        BrowserUtils.sleep(5);
        Assert.assertTrue(deletedFile.isDisplayed());


    }

}
