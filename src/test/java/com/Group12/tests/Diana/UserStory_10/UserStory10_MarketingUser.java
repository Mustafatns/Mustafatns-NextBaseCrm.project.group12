package com.Group12.tests.Diana.UserStory_10;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


// USER STORY:
// As a user, I should be able to assign tasks by clicking on Task tab.


//Log in  as: marketing

public class UserStory10_MarketingUser extends LoginToTryCrm {


    @Test
    public void  As_a_user_I_should_be_able_to_assign_tasks_by_clicking_on_Task_tab() throws InterruptedException {




        // User can navigate to Task tab and click it.

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-form-variants']/span[2]"));

        BrowserUtils.sleep(2);

        chooseFile.click();


        // TC -1- User can check  "High Priority"

        // User can mark "high priority" check box.

        WebElement highPriorityCheckBox = Driver.getDriver().findElement(By.xpath("//input[@id='tasks-task-priority-cb']"));

        BrowserUtils.sleep(2);

        chooseFile.click();


        // Verify "high priority" check box was selected.
        // System.out.println("highPriorityCheckBox.isSelected() = " + highPriorityCheckBox.isSelected());
        // BrowserUtils.sleep(2);

        // TC -2- User can click on "Checklist" to create checklists items

        // User can click on "Checklist".

        WebElement clickOnChecklist = Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[@data-target='checklist']"));

        BrowserUtils.sleep(2);

        clickOnChecklist.click();

        // User can create checklists items.

        WebElement createChecklist = Driver.getDriver().findElement(By.xpath("//span[@class='task-checklist-form-vpadding']/input[@type='text']"));

        BrowserUtils.sleep(2);

        createChecklist.click();

        BrowserUtils.sleep(2);

        createChecklist.sendKeys("User Story 8");

        createChecklist.sendKeys(Keys.ENTER);


        //TC -2- User can add Deadline, Time Planning by using date pickers.

        // User can add Deadline by using date pickers.

        // User can click on Deadline.

        WebElement addDeadLine = Driver.getDriver().findElement(By.xpath("//span[@class='task-options-destination-wrap date']"));

        BrowserUtils.sleep(2);

        addDeadLine.click();


        // User can add date.

        WebElement addDate = Driver.getDriver().findElement(By.xpath("//a[@class='bx-calendar-button bx-calendar-button-select']/span[2]"));

        BrowserUtils.sleep(3);

        addDate.click();


        // User can add Time Planning by using date pickers.

        // User can click on Time Planning.

        WebElement clickOnTimePlanning = Driver.getDriver().findElement(By.xpath("//div[@class='task-options-item-more']/span[2]/span[1]"));

        BrowserUtils.sleep(2);

        clickOnTimePlanning.click();



        // User can config task starting date, duration and ending date with "Time Planning" feature.

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
