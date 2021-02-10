package com.trycloud.tests.afrooz;


import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.trycloud.tests.base.TestBase;

public class US3TC10_AppStorageUser extends TestBase {

    @Test
    public static void click_AppStorageUser_botton_test() {
        WebElement click_Files = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        click_Files.click();
        BrowserUtils.sleep(2);


        WebElement currentUsage = WebDriverFactory.getDriver().findElement(By.xpath("//li[@id='quota']/a/p"));
        String currentUsageString= currentUsage.getText();


        String currentUsageStringNumbers= "";
        for(char ch : currentUsageString.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentUsageStringNumbers += ch;
            } else {
                break;
            }
        }
        int currentUsageNumberBeforeAddingFile = Integer.parseInt(currentUsageStringNumbers);
        currentUsageString= currentUsage.getText();
        currentUsageStringNumbers= "";
        for(char ch : currentUsageString.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentUsageStringNumbers += ch;
            } else {
                break;
            }
        }
        int currentUsageNumberAfterAddingFile = Integer.parseInt(currentUsageStringNumbers);
        WebElement plusSign= WebDriverFactory.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
        plusSign.click();


        String path = "/Users/mehdi/Desktop";
        WebElement uploadButton= WebDriverFactory.getDriver().findElement(By.xpath("//span[normalize-space()='Upload file']"));
        uploadButton.sendKeys(path+Keys.ENTER);


        WebDriverFactory.getDriver().navigate().refresh();
        WebElement usageAfterUpload = WebDriverFactory.getDriver().findElement(By.xpath("//p[normalize-space()='1 MB used']"));
        Assert.assertTrue(usageAfterUpload.isDisplayed());


        BrowserUtils.sleep(2);
    }
}