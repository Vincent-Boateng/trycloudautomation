package com.trycloud.tests.sirinapha;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3TC6_CreateFolder extends TestBase {
    @Test
    public void verify_user_can_create_folder_test(){

        WebElement filesTab = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        BrowserUtils.sleep(5);
        filesTab.click();
        BrowserUtils.sleep(5);

        WebElement plusSign = WebDriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
        plusSign.click();

        WebElement newFolderTab = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/span[2]"));
        newFolderTab.click();

        WebElement inputFolder  = WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='view13-input-folder']"));
        inputFolder.sendKeys("Finance");

        WebElement submitButton = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/form/input[2]"));

        submitButton.click();

        WebElement financeFolder = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]/div[1]/a"));

        Assert.assertTrue(financeFolder.isDisplayed());



    }

}
