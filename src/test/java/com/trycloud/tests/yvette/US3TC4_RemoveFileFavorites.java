package com.trycloud.tests.yvette;

import com.google.common.base.Verify;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3TC4_RemoveFileFavorites extends TestBase{


        @Test
        public void removeFromFavorites_tests(){

            WebElement fileTab = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
            fileTab.click();
            WebElement favoritesTab = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[3]/a"));
            favoritesTab.click();
            WebElement actionIcon = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[2]/td[1]/a/span[2]/a[2]/span[1]"));
            actionIcon.click();
            WebElement removeFromFavoritesTab = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[2]/td[1]/div/ul/li[3]/a/span[2]"));
            removeFromFavoritesTab.click();
            WebElement babyYoda = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[2]/td[1]/a/span[1]/span[1]"));
            Assert.assertFalse(babyYoda.isDisplayed());


        //3. Story: As a user, I should be able to able to access to Files module.
        //Test case #4 - verify users can remove a file from favorites.
        //1. Login as a user
        //2. Click action-icon from any file on the page
        //3. Click “Remove from Favorites” option
        //4. Verify that the file is removed from Favorites sub-module’s table.
        //(Pre-condition: there should be at least 1 file is added to favorites table)




    }
}
