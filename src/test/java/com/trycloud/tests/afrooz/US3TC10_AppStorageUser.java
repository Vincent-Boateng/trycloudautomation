package com.trycloud.tests.afrooz;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3TC10_AppStorageUser extends TestBase {

    @Test

    public static void click_AppStorageUser_botton_test() throws InterruptedException {

        WebElement click_Files = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));

        click_Files.click();

        BrowserUtils.sleep(2);



        WebElement uploadButton= WebDriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
        uploadButton.click();


        WebElement currentUsage = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"quota\"]/a/p\n" + "\n"));


        WebElement nextUsage = WebDriverFactory.getDriver().findElement(By.xpath("//p[normalize-space()='3.7 MB used']"));


        BrowserUtils.sleep(2);






    }
}