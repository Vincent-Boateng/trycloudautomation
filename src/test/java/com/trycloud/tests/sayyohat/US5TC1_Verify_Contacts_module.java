package com.trycloud.tests.sayyohat;

import com.github.javafaker.Faker;
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
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class US5TC1_Verify_Contacts_module extends TestBase {
//5. Story: As a user, I should be able to access to Contacts module.
    Faker faker = new Faker();
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

 /*
  //  3. Verify the page title is Contacts module’s title
    String actualTitle= driver.getTitle();
        String expectedTitle = "Contacts";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
  */
    }
        @Test
                public void addContacts(){
            //Test case #2 - verify users can add all contacts info
            //2.Click contacts module
            WebElement contactsModule = WebDriverFactory.getDriver().findElement(By.xpath("//a[@href='/index.php/apps/contacts/']"));
            BrowserUtils.sleep(2);
            contactsModule.click();

            //3.Click “New Contact” button
            WebElement newContactButton = WebDriverFactory.getDriver().findElement(By.id("new-contact-button"));
            newContactButton.click();
            BrowserUtils.sleep(2);

            //4.Fill out the contact info like : Title, Phone, email, address , etc
            //Contact name
            WebElement name = WebDriverFactory.getDriver().findElement(By.id("contact-fullname"));
            name.click();
            name.sendKeys(faker.name().fullName());
            BrowserUtils.sleep(3);

            //Company name
            WebElement company = WebDriverFactory.getDriver().findElement(By.id("contact-org"));
            company.click();
            company.sendKeys(faker.company().industry());
            BrowserUtils.sleep(3);

        }

}

