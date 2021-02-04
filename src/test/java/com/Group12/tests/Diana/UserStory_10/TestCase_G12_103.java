package com.Group12.tests.Diana.UserStory_10;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_G12_103 extends LoginToTryCrm {

    // USER STORY:
    // As a user, I should be able to assign tasks by clicking on Task tab.


    //Log in credentials:
    //marketing22@cybertekschool.com
    //UserUser


    @Test
    public void User_can_check_High_Priority()  throws InterruptedException {

        // User can navigate to Task tab and click it.

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-post-form-variants']/span[2]"));

        BrowserUtils.sleep(2);

        chooseFile.click();



        // TC -1- User can check "High Priority"


        // 1 - User can mark "high priority" check box.

        WebElement highPriorityCheckBox = Driver.getDriver().findElement(By.xpath("//input[@id='tasks-task-priority-cb']"));

        BrowserUtils.sleep(2);

        highPriorityCheckBox.click();


        // 2 -Verify "high priority" check box was selected.

        BrowserUtils.sleep(2);

        System.out.println("highPriorityCheckBox.isSelected() = " + highPriorityCheckBox.isSelected());



    }
}
