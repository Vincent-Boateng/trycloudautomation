package com.trycloud.tests.reyna;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3TC1_AccessFileModule extends TestBase {

    @Test
    public void verifyUsersCanAccessToFilesModule(){
        WebElement fileTabElement = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        fileTabElement.click();

        String expectedTitle = "Files - Trycloud";
        String actualTitle = WebDriverFactory.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
