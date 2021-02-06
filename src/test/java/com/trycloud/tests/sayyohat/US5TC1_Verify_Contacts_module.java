package com.trycloud.tests.sayyohat;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US5TC1_Verify_Contacts_module extends TestBase {

@Test
    public static void click_ContactsModule_FromFile_test() throws InterruptedException {

    WebElement contacts_module = WebDriverFactory.getDriver().findElement(By.linkText("Contacts"));
    BrowserUtils.sleep(3);
    contacts_module.click();
    BrowserUtils.sleep(3);


}
}
/*
1. Login as a user
2. Click “Contacts” module
3. Verify the page tile is Contents module’s tile
 */