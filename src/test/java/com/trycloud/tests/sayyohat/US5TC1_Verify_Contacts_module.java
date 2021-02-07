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

            //title
            WebElement title = WebDriverFactory.getDriver().findElement(By.id("contact-title"));
            title.click();
            title.sendKeys(faker.company().industry());
            BrowserUtils.sleep(3);

            //phone
            WebElement phone = WebDriverFactory.getDriver().findElement(By.xpath("//input[@inputmode ='tel']"));
            phone.click();
            phone.sendKeys(faker.phoneNumber().cellPhone());
            BrowserUtils.sleep(3);
/*

//email
            WebElement Email = WebDriverFactory.getDriver().findElement(By.xpath("//input[@inputmode ='email']"));
            Email.click();
            Email.sendKeys(faker.);
 */
            //PostOfficeBox
          WebElement postofficebox = WebDriverFactory.getDriver().findElement(By.xpath("//input[@class='property__value']"));
          postofficebox.click();
          postofficebox.sendKeys(faker.address().buildingNumber());
          BrowserUtils.sleep(2);


            //address
            WebElement address =WebDriverFactory.getDriver().findElement(By.xpath("//div[contains(text(),'Address')]/following-sibling::input"));
            address.click();
            address.sendKeys(faker.address().streetAddressNumber()+" "+faker.address().streetName());
            BrowserUtils.sleep(2);
            //Extended address
            WebElement extendedAddress = WebDriverFactory.getDriver().findElement(By.xpath(("//div[contains(text(),'Extended address')]/following-sibling::input")));
            extendedAddress.click();
            extendedAddress.sendKeys(faker.address().streetAddressNumber()+" "+faker.address().streetName());
            BrowserUtils.sleep(2);

            //postal code
            WebElement postalCode = WebDriverFactory.getDriver().findElement(By.xpath(("//div[contains(text(),'Postal code')]/following-sibling::input")));
            postalCode.click();
            postalCode.sendKeys(faker.address().zipCode());
            BrowserUtils.sleep(2);

            //City
            WebElement city = WebDriverFactory.getDriver().findElement(By.xpath(("//div[contains(text(),'City')]/following-sibling::input")));
            city.click();
            city.sendKeys(faker.address().city());
            BrowserUtils.sleep(2);

            //State
            WebElement state = WebDriverFactory.getDriver().findElement(By.xpath(("//div[contains(text(),'State')]/following-sibling::input")));
            state.click();
            state.sendKeys(faker.address().state());
            BrowserUtils.sleep(2);

            //Country
            WebElement country = WebDriverFactory.getDriver().findElement(By.xpath(("//div[contains(text(),'Country')]/following-sibling::input")));
            country.click();
            country.sendKeys(faker.address().country());
            BrowserUtils.sleep(8);

            //3.Click “New Contact” button
            WebElement newContactButton1 = WebDriverFactory.getDriver().findElement(By.id("new-contact-button"));
            newContactButton1.click();
            BrowserUtils.sleep(5);


            //5.Verify the contact name is added to the contact list
            WebElement contact = WebDriverFactory.getDriver().findElement(By.xpath("//div[@class='app-content-list-item-line-one']"));
            Assert.assertTrue(contact.isDisplayed());



        }




}



