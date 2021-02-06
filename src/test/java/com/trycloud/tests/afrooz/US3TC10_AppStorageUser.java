package com.trycloud.tests.afrooz;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3TC10_AppStorageUser extends TestBase {

    @Test

    public static void click_AppStorageUser_botton_test() throws InterruptedException {

        WebElement click_Files = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));

        click_Files.click();

        Thread.sleep(2000);


        WebElement PlusButton= WebDriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));

        PlusButton.click();

        Thread.sleep(2000);


        WebElement UploadFile= WebDriverFactory.getDriver().findElement(By.className("displayname"));

        UploadFile.click();

        WebElement UsageIncrease= WebDriverFactory.getDriver().findElement(By.xpath("//label[normalize-space()='Show hidden files']"));





    }
}