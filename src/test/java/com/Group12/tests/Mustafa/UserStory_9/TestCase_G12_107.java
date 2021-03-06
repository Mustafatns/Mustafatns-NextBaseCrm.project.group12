package com.Group12.tests.Mustafa.UserStory_9;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase_G12_107 extends LoginToTryCrm {
    // USER STORY 9 {
    // Acceptance Criteria:
    // 1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    // 2. Verify users can cancel events.
    // 3. Verify users can check timers
    // 4. Verify users can choose all day for the event time
    // }

    @Test(description = "As a user, I should be able to cancel events")
    public void As_a_user_I_should_be_able_to_cancel_events() throws InterruptedException {

        // 2. Verify users can cancel events.
        //SCENARIO : users can cancel events with "CANCEL" button

        WebElement eventButton = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-calendar"));

        eventButton.click();
        BrowserUtils.sleep(2);


        WebElement cancelButton = Driver.getDriver().findElement(By.id("blog-submit-button-cancel"));
        cancelButton.click();
        BrowserUtils.sleep(2);


    }
}
