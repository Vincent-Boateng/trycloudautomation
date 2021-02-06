package com.trycloud.tests.afrooz;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3TC9_ChangeAppSettings extends TestBase {




       @Test

       public static void click_Setting_bottom_test() {

              WebElement click_U = WebDriverFactory.getDriver().findElement(By.xpath("//div[@class='avatardiv avatardiv-shown']//img"));

              click_U.click();

              WebElement click_Activity= WebDriverFactory.getDriver().findElement(By.xpath("//a[normalize-space()='Settings']"));

              click_Activity.click();


       }
}
