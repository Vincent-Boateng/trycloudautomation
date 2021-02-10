package com.trycloud.tests.busra;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US2TC1_VerifyAccessMainModules extends TestBase {

    @Test
    public void VerifytheURLischawedtohomepageurl() throws InterruptedException{



        //Dashboard
        WebElement dashboard = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Dashboard']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        dashboard.click();
        BrowserUtils.sleep(2);
        String expectedDashboardTitle = "Dashboard - Trycloud";
        String actualDashboardText = WebDriverFactory.getDriver().getTitle();
        Assert.assertEquals(actualDashboardText, expectedDashboardTitle);


        //files
        WebElement files = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        files.click();
        BrowserUtils.sleep(2);
        String expectedFilesTitle = "Files - Trycloud";
        String actualFilesText = WebDriverFactory.getDriver().getTitle();
       Assert.assertEquals(actualFilesText, expectedFilesTitle);


       // galeries
        WebElement galleries = WebDriverFactory.getDriver().findElement(By.xpath("(//ul[@id='appmenu']//li)[3]"));
        galleries.click();
        BrowserUtils.sleep(2);

        String expectedGalleriesText = "Photos - Trycloud";
       String actualGalleriesText = WebDriverFactory.getDriver().getTitle();
       Assert.assertEquals(actualGalleriesText, expectedGalleriesText);

        //activity
        WebElement activity = WebDriverFactory.getDriver().findElement(By.xpath("(//ul[@id='appmenu']//li)[4]"));
        activity.click();
        BrowserUtils.sleep(2);

        String expectedActivityText = "Activity - Trycloud";
        String actualActivityText = WebDriverFactory.getDriver().getTitle();
        Assert.assertEquals(actualActivityText, expectedActivityText);

        //talk
        WebElement talk = WebDriverFactory.getDriver().findElement(By.xpath("(//ul[@id='appmenu']//li)[5]"));
        talk.click();
        BrowserUtils.sleep(2);

        String expectedTalkText = "Talk - Trycloud";
        String actualTalkText =  WebDriverFactory.getDriver().getTitle();
        Assert.assertEquals(actualTalkText, expectedTalkText);

        //contacts
        WebElement contacts = WebDriverFactory.getDriver().findElement(By.xpath("(//ul[@id='appmenu']//li)[6]"));
        contacts.click();
        BrowserUtils.sleep(2);

        String expectedContactsText = "Contacts - Trycloud";
        String actualContactsText = WebDriverFactory.getDriver().getTitle();
        Assert.assertEquals(actualContactsText, expectedContactsText);

        //circles
        WebElement circles = WebDriverFactory.getDriver().findElement(By.xpath("(//ul[@id='appmenu']//li)[7]"));
        circles.click();
        BrowserUtils.sleep(2);

        String expectedCirclesText = "Circles - Trycloud";
        String actualCirclesText = WebDriverFactory.getDriver().getTitle();
        Assert.assertEquals(actualCirclesText, expectedCirclesText);

        //calender
        WebElement calender = WebDriverFactory.getDriver().findElement(By.xpath("(//ul[@id='appmenu']//li)[8]"));
        calender.click();
        BrowserUtils.sleep(2);

        String expectedCalenderText = "February 2021 - Calendar - Trycloud";
        String actualCalenderText = WebDriverFactory.getDriver().getTitle();
        Assert.assertEquals(actualCalenderText, expectedCalenderText);

        //deck
        WebElement deck = WebDriverFactory.getDriver().findElement(By.xpath("(//ul[@id='appmenu']//li)[9]"));
        deck.click();
        BrowserUtils.sleep(2);

        String expectedDeckText = "Deck - Trycloud";
        String actualDeckText = WebDriverFactory.getDriver().getTitle();
        Assert.assertEquals(actualDeckText, expectedDeckText);

    }
}





