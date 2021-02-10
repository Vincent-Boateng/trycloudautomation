package com.trycloud.tests.sayed;


import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US6TC1_verifyNoteModule extends TestBase {

    @Test
    public static void verifyAccessingToTalksModule(){


        WebElement deck_Module = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"appmenu\"]/li[9]/a"));
        //WebElement deck_Module = WebDriverFactory.getDriver().findElement(By.linkText("Deck"));
        deck_Module.click();

        String actualTitle = WebDriverFactory.getDriver().getTitle();
        System.out.println(actualTitle);
        BrowserUtils.sleep(3);
        String expectedTitle = "Deck - Trycloud";
        Assert.assertEquals(actualTitle, expectedTitle);


        //System.out.println("Test completed.");









    }



}
