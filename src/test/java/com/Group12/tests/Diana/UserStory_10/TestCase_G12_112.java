package com.Group12.tests.Diana.UserStory_10;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.apache.hc.core5.util.Deadline;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Time;

public class TestCase_G12_112 extends LoginToTryCrm {

    // USER STORY:
    // As a user, I should be able to assign tasks by clicking on Task tab.


    //Log in credentials:
    //marketing22@cybertekschool.com
    //UserUser

    @Test
    public void User_can_add_Deadline_Time_Planning_by_using_date_pickers() throws InterruptedException {

        // User can navigate to Task tab and click it.

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-form-variants']/span[2]"));

        BrowserUtils.sleep(2);

        chooseFile.click();

        //TC -3- User can add Deadline, Time Planning by using date pickers.

        // 1 - User can add Deadline by using date pickers.

        // User can click on Deadline.

        WebElement addDeadLine = Driver.getDriver().findElement(By.xpath("//span[@class='task-options-destination-wrap date']"));

        BrowserUtils.sleep(2);

        addDeadLine.click();


        // User can add date.

        WebElement addDate = Driver.getDriver().findElement(By.xpath("//a[@class='bx-calendar-button bx-calendar-button-select']/span[2]"));

        BrowserUtils.sleep(3);

        addDate.click();


        // 2 - User can add Time Planning by using date pickers.

        // User can click on Time Planning.

        WebElement clickOnTimePlanning = Driver.getDriver().findElement(By.xpath("//div[@class='task-options-item-more']/span[2]/span[1]"));

        BrowserUtils.sleep(2);

        clickOnTimePlanning.click();



        // 3 - User can config task starting date, duration and ending date with "Time Planning" feature.

        // User can add Start Task On date.

        WebElement startTaskOn = Driver.getDriver().findElement(By.xpath("//div[@class='task-options-field task-options-field-left']/span[1]"));

        BrowserUtils.sleep(3);

        startTaskOn.click();


        // User can add Duration of 120 minutes.

        WebElement duration = Driver.getDriver().findElement(By.xpath("//div[@class='task-options-field task-options-field-left task-options-field-duration']/span[1]"));

        BrowserUtils.sleep(2);

        duration.click();

        WebElement addMinutes = Driver.getDriver().findElement(By.xpath("//span[@class='task-options-inp-container']/input[1]"));

        BrowserUtils.sleep(5);

        addMinutes.sendKeys("120");



        // User can add ending date.

        WebElement endingDate = Driver.getDriver().findElement(By.xpath("//*[@id=\"bx-component-scope-lifefeed_task_form\"]/div/div[3]/div[2]/div/div[2]/div[1]/div/div[4]/span/input[1]"));

        BrowserUtils.sleep(2);

        endingDate.click();


    }
}
