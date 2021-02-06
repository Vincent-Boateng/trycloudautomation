package com.trycloud.tests.vincent;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test(groups = "UserStory3")
public class US3TC8b_ClickActionIcon_Add_Comment extends TestBase {

    @Test(groups = "regression")
    public static void click_ActionIcon_FromFile_test() {

        WebElement fileTabElement = WebDriverFactory.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));

        fileTabElement.click();

        WebElement file_action_icon = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"fileList\"]/tr[3]/td[2]/a/span[2]/a[2]/span[1]"));
        file_action_icon.click();
        //JavascriptExecutor executor = (JavascriptExecutor) WebDriverFactory.getDriver();
       // executor.executeScript("arguments[0].click();", file_action_icon);

        WebElement detailsElement = WebDriverFactory.getDriver().findElement(By.cssSelector("#fileList > tr.mouseOver > td.filename.ui-draggable.ui-draggable-handle > div > ul > li.action-details-container > a > span:nth-child(2)"));

        detailsElement.click();

        BrowserUtils.sleep(10);

        WebElement commentsTab = WebDriverFactory.getDriver().findElement(By.xpath("//a[normalize-space()='Comments']"));
        commentsTab.click();

        BrowserUtils.sleep(10);

        WebElement commentBox = WebDriverFactory.getDriver().findElement(By.xpath("//div[@data-placeholder='New comment …']"));
        BrowserUtils.sleep(10);
        commentBox.sendKeys("This is is a very useful file. Thank you for uploading it");

        WebElement sendCommentAction = WebDriverFactory.getDriver().findElement(By.xpath("//input[@class='submit icon-confirm has-tooltip']"));

        BrowserUtils.sleep(10);
        sendCommentAction.click();

        WebElement activityComment = WebDriverFactory.getDriver().findElement(By.xpath("//div[normalize-space()='This is is a very useful file. Thank you for uploading it']"));

        System.out.println(activityComment.getText());

        Assert.assertTrue(activityComment.isDisplayed());

    }


}
