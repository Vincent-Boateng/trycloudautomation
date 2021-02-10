package com.trycloud.tests.sayed;


import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US6TC2_Verify_Sending_NotesInThePage extends TestBase {
          /*
       Test case #2 - verify users can send notes in the page. (There is no note icon in the page)
             1. Login as a user: The first step(longin as a user) is going go be done automatically
                from TestBase Class created by Vincent
                kdfkdjf
           */

  @Test
          //  2.Click deck module and user can see all deck elements in the page
          public static void verify_SendingNotes_InThe_Page(){
          WebElement deck_Module = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"appmenu\"]/li[9]/a"));
          deck_Module.click();

            ////*[@id="app-navigation-vue"]/ul/li[3]/a/div

        WebElement selectColor = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/li[3]/a/div"));
        selectColor.click();
        BrowserUtils.sleep(4);
    //3.Click “Add board” button   //*[@id="app-navigation-vue"]/ul/li[3]/a/span

        WebElement addBoardButton = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/div/form/input[1]"));
        addBoardButton.click();
        addBoardButton.sendKeys("Test 123");
        BrowserUtils.sleep(4);

        // 4. write the name of the board  //*[@id="app-navigation-vue"]/ul/div/form/input[1]

        WebElement writeTheName = WebDriverFactory.getDriver().findElement(By.xpath(" //*[@id=\"app-navigation-vue\"]/ul/div/form/input[2]"));
        writeTheName.click();
        BrowserUtils.sleep(4);


        // Verify the the board is added on the list




//      String actualTitle = WebDriverFactory.getDriver().getTitle();
//      System.out.println(actualTitle);
//      BrowserUtils.sleep(3);
//      String expectedTitle = "Deck - Trycloud";
//      Assert.assertEquals(actualTitle, expectedTitle);










    // 4.Write a message/Note


    //String actualTitle = WebDriverFactory.getDriver().getTitle();

  }
  //WebElement deck_Module = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"appmenu\"]/li[9]/a"));
    //inputEnter.sendKeys("dkjdkfj");


    //*[@id="app-navigation-vue"]/ul/div/form/input[1]
/*

  WebElement deck_Module = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"appmenu\"]/li[9]/a"));
        //WebElement deck_Module = WebDriverFactory.getDriver().findElement(By.linkText("Deck"));
        deck_Module.click();

        String actualTitle = WebDriverFactory.getDriver().getTitle();
        System.out.println(actualTitle);
        BrowserUtils.sleep(3);
        String expectedTitle = "Deck - Trycloud";
        Assert.assertEquals(actualTitle, expectedTitle);


        System.out.println("Test completed.");
 */


}
