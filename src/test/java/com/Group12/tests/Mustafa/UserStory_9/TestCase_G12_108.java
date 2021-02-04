package com.Group12.tests.Mustafa.UserStory_9;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParsePosition;

public class TestCase_G12_108 extends LoginToTryCrm {
    // USER STORY 9 {
    // Acceptance Criteria:
    // 1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    // 2. Verify users can cancel events.
    // 3. Verify users can check timers
    // 4. Verify users can choose all day for the event time
    // }

    @Test
    public void test() throws InterruptedException {
        // 3. Verify users can check timers
        //SCENARIO : users can check modify event Starting and ending time

        WebElement eventButton = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-calendar"));
        eventButton.click();
        BrowserUtils.sleep(1);

        WebElement startTimeSet = Driver.getDriver().findElement(By.xpath("//input[@id='feed_cal_event_from_timecal_3Jcl']"));
        startTimeSet.click();
        BrowserUtils.sleep(1);

        WebElement setStartHour = Driver.getDriver().findElement(By.xpath("//input[@title='Hours']"));
        BrowserUtils.sleep(1);
        setStartHour.clear();

        // Enter the hour = 8
        setStartHour.sendKeys(String.valueOf(8));
        BrowserUtils.sleep(1);

        WebElement setStartMinute = Driver.getDriver().findElement(By.xpath("//input[@title='Minutes']"));
        BrowserUtils.sleep(1);
        setStartMinute.clear();

        // Enter Minute = 27
        setStartMinute.sendKeys(String.valueOf(25));
        BrowserUtils.sleep(1);

        WebElement setPm_Am = Driver.getDriver().findElement(By.xpath("//span[@class='bxc-am-pm']"));
/*
        setPm_Am.isDisplayed(); // display AM
        System.out.println(setPm_Am.getText());
*/
        Assert.assertTrue(setPm_Am.isDisplayed(), "AM DIDN'T DISPLAYED. FAILED ! ! !");
        BrowserUtils.sleep(1);
/*
        setPm_Am.click(); // display PM
        Assert.assertTrue(setPm_Am.getText().equals("PM"),"PM DIDN'T DISPLAYED. FAILED ! ! !");
        BrowserUtils.sleep(1);
*/
        WebElement setTimer = Driver.getDriver().findElement(By.xpath("//input[@value='Set Time']"));
        setTimer.click();
        BrowserUtils.sleep(1);

        // ===================================

        WebElement endTimeSet = Driver.getDriver().findElement(By.xpath("//input[@title='Select end date and time']"));
        endTimeSet.click();
        BrowserUtils.sleep(1);

        WebElement setEndHour = Driver.getDriver().findElement(By.xpath("//*[@id='feed_cal_event_to_timecal_3Jcl_div']/div[2]/table[1]/tbody/tr[1]/td[1]/input"));
        BrowserUtils.sleep(1);
       // setEndHour.clear();

        // Enter the hour = 5
        setEndHour.sendKeys(Keys.BACK_SPACE);
        setEndHour.sendKeys(String.valueOf(5));
        BrowserUtils.sleep(1);

        WebElement setEndMinute = Driver.getDriver().findElement(By.xpath("//*[@id='feed_cal_event_to_timecal_3Jcl_div']/div[2]/table[2]/tbody/tr[1]/td[1]/input"));
        BrowserUtils.sleep(1);
        setEndMinute.clear();

        // Enter the minute = 15
        setEndMinute.sendKeys(Keys.BACK_SPACE);
        setEndMinute.sendKeys(String.valueOf(15));
        BrowserUtils.sleep(1);

        WebElement setEndPm_Am = Driver.getDriver().findElement(By.xpath("//*[@id='feed_cal_event_to_timecal_3Jcl_div']/div[2]/span[2]"));
/*
        setPm_Am.isDisplayed(); // display AM
        System.out.println(setPm_Am.getText());
        */
        Assert.assertTrue(setEndPm_Am.isDisplayed(),"AM DIDN'T DISPLAYED. FAILED ! ! !");

        WebElement setEndTimer = Driver.getDriver().findElement(By.xpath("//*[@id='feed_cal_event_to_timecal_3Jcl_div']/div[2]/input"));
        setEndTimer.click();


    }

}
