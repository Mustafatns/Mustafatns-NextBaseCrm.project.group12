package com.Group12.tests.Diana.UserStory_10;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_G12_111 extends LoginToTryCrm {

    // USER STORY:
    // As a user, I should be able to assign tasks by clicking on Task tab.


    //Log in credentials:
    //marketing22@cybertekschool.com
    //UserUser

    @Test
    public void User_can_check_High_Priority() throws InterruptedException {


        // User can navigate to Task tab and click it.

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-form-variants']/span[2]"));

        BrowserUtils.sleep(2);

        chooseFile.click();



        // TC -2- User can click on "Checklist" to create checklists items



        // 1 - User can click on "Checklist".

        WebElement clickOnChecklist = Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[@data-target='checklist']"));

        BrowserUtils.sleep(2);

        clickOnChecklist.click();


        // 3 - Verify Checklist check box is displayed.

        BrowserUtils.sleep(2);

        WebElement checklistBoxIsDisplayed = Driver.getDriver().findElement(By.xpath("//div[@class='task-options task-checklist']"));

        System.out.println("checklistBoxIsDisplayed.isDisplayed() = " + checklistBoxIsDisplayed.isDisplayed());


        // 4 - User can create checklist item("User Story 10").

        WebElement createChecklist = Driver.getDriver().findElement(By.xpath("//span[@class='task-checklist-form-vpadding']/input[@type='text']"));

        BrowserUtils.sleep(2);

        createChecklist.click();

        BrowserUtils.sleep(2);

        createChecklist.sendKeys("User Story 10");

        createChecklist.sendKeys(Keys.ENTER);


        // 5 - Verify Checklist item "User Story 10" is displayed.

        BrowserUtils.sleep(2);

        System.out.println("createChecklist.isDisplayed() = " + createChecklist.isDisplayed());


    }
}
