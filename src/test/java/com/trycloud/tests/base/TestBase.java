package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;


        public abstract class TestBase {
            @BeforeMethod
            public void setUpMethod(){
                // 1.Open browser
                WebDriverFactory.getDriver().get("http://qa2.trycloud.net");
                WebElement usernameInputBox = WebDriverFactory.getDriver().findElement(By.id("user"));
                usernameInputBox.sendKeys(ConfigurationReader.getProperty("username1"));
                WebElement passwordInputBox = WebDriverFactory.getDriver().findElement(By.xpath("//input[@type='password']"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
                WebElement loginButton = WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='submit-form']"));
                loginButton.click();
                //Verify the URL shows the homepage's url
                String actualUrl = WebDriverFactory.getDriver().getCurrentUrl();
                String expectedUrl = ConfigurationReader.getProperty("expectedUrl");
                Assert.assertEquals(actualUrl, expectedUrl, "Actual url does not match expected url. Test FAILED!");
            }
            @AfterMethod
            public void tearDownMethod()  {
                WebDriverFactory.closeDriver();
            }
        }
