package com.trycloud.tests.afrooz;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _AppStorageUser extends TestBase {

    @Test

    public static void click_StorageUser_bottom_test() throws InterruptedException {

        WebElement click_Files = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));

        click_Files.click();

        Thread.sleep(2000);

        WebElement StorageUse = WebDriverFactory.getDriver().findElement(By.xpath("//p[normalize-space()='53 KB used']"));

        StorageUse.click();

        WebElement PlusButton= WebDriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));

        PlusButton.click();

        Thread.sleep(2000);


        WebElement UploadFile= WebDriverFactory.getDriver().findElement(By.className("displayname"));

        UploadFile.click();

        WebElement UsageIncrease= WebDriverFactory.getDriver().findElement(By.xpath("//p[normalize-space()='3.5 MB used']"));







    }
}