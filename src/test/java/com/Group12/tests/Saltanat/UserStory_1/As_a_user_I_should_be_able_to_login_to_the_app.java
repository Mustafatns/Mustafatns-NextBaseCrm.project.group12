package com.Group12.tests.Saltanat.UserStory_1;

import com.Group12.utility.ConfigurationReader;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class As_a_user_I_should_be_able_to_login_to_the_app {

    @Test (description = "As a user, I should be able to login to the app")
    public void Test1() throws InterruptedException {

        String crmUrl = ConfigurationReader.getProperty("crmUrl");
        Driver.getDriver().get(crmUrl);

        WebElement remember_button = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));

        remember_button.click();

        WebElement forgetYourPassword = Driver.getDriver().findElement(By.xpath("//a[@class='login-link-forgot-pass'] "));

        Assert.assertTrue(forgetYourPassword.isDisplayed(),"FAILED");


    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }


}
