package com.trycloud.tests;

import com.github.javafaker.Faker;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InvalidLogin {

    @Test
    public void invalid_loginCredentials_test(){

     WebDriverFactory.getDriver().get(ConfigurationReader.getProperty("tryCloudUrl"));
        WebDriverFactory.getDriver().manage().window().maximize();
        WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Faker faker = new Faker();
    WebElement usernameInputBox = WebDriverFactory.getDriver().findElement(By.id("user"));
        usernameInputBox.sendKeys(faker.name().username());

    WebElement passwordInputBox = WebDriverFactory.getDriver().findElement(By.xpath("//input[@type='password']"));
        passwordInputBox.sendKeys(faker.internet().password());

    WebElement loginButton = WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

    //Verify the URL is chawed to homepage’s url

        String expectedErrorMessage = "Wrong username or password.";

          String actualErrorMessage = WebDriverFactory.getDriver().findElement(By.xpath("//p[@class='warning wrongPasswordMsg']")).getText();

Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    String actualTitle = WebDriverFactory.getDriver().getTitle();
    String expectedTitle = "Trycloud QA";

        BrowserUtils.sleep(10);
        Assert.assertEquals(actualTitle, expectedTitle, "Actual title does not match expected title. Test FAILED!");


        WebDriverFactory.getDriver().close();
    }
}
