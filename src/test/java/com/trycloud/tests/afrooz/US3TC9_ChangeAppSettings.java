package com.trycloud.tests.afrooz;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3TC9_ChangeAppSettings extends TestBase {




       @Test

       public static void click_Setting_bottom_test() {

              WebElement click_Files = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));

              click_Files.click();

              WebElement click_Settings= WebDriverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Settings']"));

              click_Settings.click();

              BrowserUtils.sleep(2);



              WebElement button1 = WebDriverFactory.getDriver().findElement(By.xpath("//label[normalize-space()='Show rich workspaces']"));
              button1.click();

              BrowserUtils.sleep(2);


              WebElement button2 = WebDriverFactory.getDriver().findElement(By.xpath("//label[normalize-space()='Show recommendations']"));
              button2.click();

              BrowserUtils.sleep(2);


              WebElement button3 = WebDriverFactory.getDriver().findElement(By.xpath("//label[normalize-space()='Show hidden files']"));
              button3.click();


              BrowserUtils.sleep(2);

              Assert.assertTrue(button1.isEnabled(), "The button1 is not clickable");

              Assert.assertTrue(button2.isEnabled(), "The button2 is not clickable");





       }
}
