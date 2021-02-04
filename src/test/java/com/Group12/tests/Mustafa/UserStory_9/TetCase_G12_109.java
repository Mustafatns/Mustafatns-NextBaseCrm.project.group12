package com.Group12.tests.Mustafa.UserStory_9;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TetCase_G12_109 extends LoginToTryCrm {
    // USER STORY 9 {
    // Acceptance Criteria:
    // 1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    // 2. Verify users can cancel events.
    // 3. Verify users can check timers
    // 4. Verify users can choose all day for the event time
    // }

    @Test
    public void Verify_users_can_choose_all_day_for_the_event_time() throws InterruptedException {

        // Verify users can choose all day for the event time
        // SCENARIO : users can check "All day"

        // Clicking Event Button
        WebElement eventButton = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-calendar"));
        eventButton.click();
        BrowserUtils.sleep(1);

        WebElement allDayButton = Driver.getDriver().findElement(By.xpath("//input[@id='event-full-daycal_3Jcl']"));
        allDayButton.click();

        // Checking if selected or not
        Assert.assertTrue(allDayButton.isSelected(), "All day button is NOT SELECTED. FAILED");


    }


}
