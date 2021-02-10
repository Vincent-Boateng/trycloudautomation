package com.trycloud.tests.busra;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US7TC1_Verify_Search_Files extends TestBase {
    @Test
    public void Verifysearchbutton() throws InterruptedException {
        //find search button's xpath
        WebElement searchicon= WebDriverFactory.getDriver().findElement(By.xpath("//span[@aria-label='Magnify icon']//*[local-name()='svg']"));
        searchicon.click();

        WebElement insidesearch= WebDriverFactory.getDriver().findElement(By.xpath("//input[@placeholder='Search apps, files, comments, deck, messages, contacts, conversations, events, tasks, settings, messages …']"));
        BrowserUtils.sleep(2);

        insidesearch.sendKeys("yoda1.png", Keys.ENTER);

        String expectedResult = "yoda1.png";
        BrowserUtils.sleep(2);

        WebElement searchWindow = WebDriverFactory.getDriver().findElement(By.xpath("(//a[@class='recommendation'])[1]"));
        searchWindow.click();

        BrowserUtils.sleep(2);
        // actualresult
        String actualResult = searchWindow.getText();
        //verify
        Assert.assertTrue(actualResult.contains(expectedResult));











}
    }

