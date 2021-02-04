package com.trycloud.tests.afrooz;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3TC9_ChangeAppSettings extends TestBase {




       @Test

       public static void click_Setting_bottom_test() {

              WebElement click_Setting = WebDriverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Settings']"));

              click_Setting.click();

              WebElement click_Favorite= WebDriverFactory.getDriver().findElement(By.xpath("//a[normalize-space()='Favorites']"));

              click_Favorite.click();


       }
}
