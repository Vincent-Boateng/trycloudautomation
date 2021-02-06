package com.trycloud.tests.afrooz;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3TC9_ChangeAppSettings extends TestBase {




       @Test

       public static void click_Setting_bottom_test() throws InterruptedException {

              WebElement click_Files = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));

              click_Files.click();

              WebElement click_Settings= WebDriverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Settings']"));

              click_Settings.click();

              Thread.sleep(2000);

              WebElement click_Sharing= WebDriverFactory.getDriver().findElement(By.xpath("//span[normalize-space()='Sharing']"));

              click_Sharing.click();

              Thread.sleep(2000);

              WebElement checkbox3 = WebDriverFactory.getDriver().findElement(By.xpath("//label[normalize-space()='Show hidden files']"));

              checkbox3.click();

              if (!checkbox3.isSelected() && !checkbox3.isDisplayed()){
                     System.out.println("Checkbox is not selected. Message is not displayed. Verification PASS!");
              }else{
                     System.out.println("FAIL!");
              }


              Thread.sleep(3000);


       }
}
