package com.Group12.tests.Saltanat;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;;
import org.testng.annotations.Test;


public class UserStory_12 extends LoginToTryCrm {

    @Test
    public void As_a_user_I_should_be_able_to_send_aVerify_users_search() throws InterruptedException {

        //1. Verify users search by type-in keyword to search previous posts
        WebElement filterButton = Driver.getDriver().findElement(By.id("LIVEFEED_search"));
        filterButton.click();
        BrowserUtils.sleep(3);
        //Searching for "Tell me about Cybertek school?"
        filterButton.sendKeys("Tell me about Cybertek school?", Keys.ENTER);
        BrowserUtils.sleep(3);

    }

}
