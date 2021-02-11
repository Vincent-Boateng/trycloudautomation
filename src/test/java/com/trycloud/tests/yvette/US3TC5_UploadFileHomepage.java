package com.trycloud.tests.yvette;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3TC5_UploadFileHomepage extends TestBase {
@Test
    public void verify_direct_file_upload_to_Homepage_test(){

    WebElement filesTab = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
    BrowserUtils.sleep(5);
    filesTab.click();
    BrowserUtils.sleep(5);

    WebElement addFileSign = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/a/span[1]"));
    addFileSign.click();

    WebElement uploadFileButton = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label/span[1]"));

    String filePath = "C:\\Users\\vince\\OneDrive\\Desktop\\Group Work.PNG";
    JavascriptExecutor js = (JavascriptExecutor)WebDriverFactory.getDriver();
    js.executeScript("arguments[0].click", filePath);
    BrowserUtils.sleep(5);
    WebElement uploadedFile = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr/td[2]/a/div/div"));


    Assert.assertTrue(uploadedFile.isDisplayed());
}

//@Test
//    public static void
}
/*
Login as a user
2. Click the “+” icon on top
3. Click “upload file”
4. Upload a file
5. Verify the file is displayed on the page
 */