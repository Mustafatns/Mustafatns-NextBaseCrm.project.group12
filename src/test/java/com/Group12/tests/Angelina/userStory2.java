package com.Group12.tests.Angelina;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import com.Group12.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class userStory2 extends LoginToTryCrm {

        @Test
        public void send_message_by_clicking_button() throws InterruptedException{
            //3. verify as user able to send message by clicking "MESSAGE"
            // find a button MESSAGE
            WebElement message = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-message"));
            message.click();
            // put text inside the window

            WebElement frame=Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
            Driver.getDriver().switchTo().frame(frame);
            Driver.getDriver().findElement(By.xpath("/html/body")).sendKeys("Group 12!!!");
            Driver.getDriver().switchTo().parentFrame();
            BrowserUtils.sleep(3);

             //click button send
            WebElement button = Driver.getDriver().findElement(By.id("blog-submit-button-save"));
            button.click();
            BrowserUtils.sleep(3);

        }

        @Test // #2 Test case = Verify users can cancel message.
    public void user_can_cancel_message () throws InterruptedException {
            // find a button message
            WebElement message = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-message"));
            message.click();

            // use Iframe to put inside the massage box some text
            WebElement frame=Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
            Driver.getDriver().switchTo().frame(frame);
            Driver.getDriver().findElement(By.xpath("/html/body")).sendKeys("Group 12!!!Batch21!!");
            Driver.getDriver().switchTo().parentFrame();
            BrowserUtils.sleep(3);

            // verify user can cancel the message
            WebElement cancel = Driver.getDriver().findElement(By.id("blog-submit-button-cancel"));
            cancel.click();
            BrowserUtils.sleep(3);


        }




}
/*
Acceptance criteria:

Verify users can send message by clicking "MESSAGE" tab
2. Verify users can cancel message.
3. Verify users can attach link by clicking on the link icon.
 */