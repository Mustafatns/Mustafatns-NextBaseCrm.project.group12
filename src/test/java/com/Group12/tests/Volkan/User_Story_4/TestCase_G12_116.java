package com.Group12.tests.Volkan.User_Story_4;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_G12_116 extends LoginToTryCrm {


    @Test
    public void allow_multiple_ChoiceCouldBeCheckedByUsers() throws InterruptedException {

        //button Click to Poll
        WebElement pollButton = Driver.getDriver().findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']"));
        pollButton.click();
        BrowserUtils.sleep(1);

        //Enter the title
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("bx-editor-iframe")));
        WebElement titleBox = Driver.getDriver().findElement(By.xpath("//body"));
        titleBox.click();
        titleBox.sendKeys("Clock2");
        BrowserUtils.sleep(1);
        Driver.getDriver().switchTo().defaultContent(); //exit the frame there is only one frame!


        //Fill the question box
        WebElement questionBox = Driver.getDriver().findElement(By.xpath("//input[@id='question_0']"));
        questionBox.sendKeys("What time is it?");
        BrowserUtils.sleep(1);

        //fill the Answer Box 1
        WebElement answer1Box = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Answer  1']"));
        answer1Box.sendKeys("it is 11:35");
        BrowserUtils.sleep(1);

        //fill the Answer Box 2
        WebElement answer2Box = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Answer  2']"));
        answer2Box.sendKeys("it is 11:41");
        BrowserUtils.sleep(1);

        //Clicking Multiple choice button
        WebElement allowMultipleChoiceBox = Driver.getDriver().findElement(By.xpath("//input[@class='vote-checkbox']"));
        allowMultipleChoiceBox.click();
        BrowserUtils.sleep(3);

        //Click the send button
        WebElement sendButton = Driver.getDriver().findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();
        BrowserUtils.sleep(2);

    }

}
