package com.trycloud.tests.vincent;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3TC3_Verify_Add_File_To_Favorites extends TestBase {

    @Test
    public void US3TC3_Add_File_To_Favorites(){
        WebElement fileTabElement = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));

        fileTabElement.click();

        WebElement action_icon_yoda = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[2]/a[2]/span[1]"));

        action_icon_yoda.click();

        WebElement  add_to_favorites_icon = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[2]/td[2]/div/ul/li[3]/a/span[2]"));

        add_to_favorites_icon.click();

        WebElement favorites_tab = WebDriverFactory.getDriver().findElement(By.xpath("//a[normalize-space()='Favorites']"));

        favorites_tab.click();

        WebElement yoda_file = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[2]/td[1]/a/span[1]/span[1]"));

        Assert.assertTrue(yoda_file.isDisplayed());


    }
}
