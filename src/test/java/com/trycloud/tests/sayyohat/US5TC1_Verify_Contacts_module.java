package com.trycloud.tests.sayyohat;

import com.google.common.base.Verify;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import javafx.scene.chart.Chart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US5TC1_Verify_Contacts_module extends TestBase {

    private static Chart driver;

    @Test
    public static void click_ContactsModule_FromFile_test() throws InterruptedException {
/*
1. Login as a user
2. Click “Contacts” module

 */
    WebElement contactsModule = WebDriverFactory.getDriver().findElement(By.xpath("//a[@href='/index.php/apps/contacts/']"));
    BrowserUtils.sleep(3);
    contactsModule.click();
    BrowserUtils.sleep(3);

  //  3. Verify the page tile is Contents module’s title
    String actualTitle= driver.getTitle();
        String expectedTitle = "Contacts";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

}
}
