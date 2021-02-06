package com.trycloud.tests;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(priority = 8, groups="userStory3")
public class US3TC8a_Delete_File_Folder extends TestBase {

    @Test(groups = {"regression", "smoke"})
    public void delete_file_feature_verification_test() {

        WebElement filesTab = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        BrowserUtils.sleep(10);
        filesTab.click();
        BrowserUtils.sleep(10);
        WebElement actionTab = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[4]/td[2]/a/span[2]/a[2]/span[1]"));
        BrowserUtils.sleep(10);
        actionTab.click();
        BrowserUtils.sleep(10);
        WebElement deleteAction = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[4]/td[2]/div/ul/li[8]/a/span[2]"));
        BrowserUtils.sleep(10);
        deleteAction.click();
        BrowserUtils.sleep(10);
        WebElement deletedFile = WebDriverFactory.getDriver().findElement(By.xpath("//span[normalize-space()='Group Work']"));
        BrowserUtils.sleep(10);
        Assert.assertFalse(deletedFile.isDisplayed());
    }

}
