package com.Group12.tests.Muhammad.UserStory_7;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_G12_129 extends LoginToTryCrm {

    //Acceptance Criteria:
    //1. Verify users can like a post (message, task, poll, event , etc).
    //2. Verify users can follow posts.
    //3. Verify users can see how many people viewed a post.
    //4. Verify users can save a post as favorite.
    //5. Verify users can send or cancel a comment to any post.

    @Test
    public void As_a_user_I_should_be_able_to_see_posts_from_homepage() throws InterruptedException {

        //1. Verify users can like a post (message, task, poll, event , etc).
        WebElement likePost = Driver.getDriver().findElement(By.className("bx-ilike-text"));
        likePost.click();
        Thread.sleep(2000);

        //2. Verify users can follow posts.
        WebElement followPosts = Driver.getDriver().findElement(By.className("feed-inform-follow"));
        followPosts.click();
        BrowserUtils.sleep(2);

        //3. Verify users can see how many people viewed a post.
        WebElement viewPost = Driver.getDriver().findElement(By.className("feed-content-view-cnt-wrap"));
        viewPost.click();
        BrowserUtils.sleep(2);

        //4. Verify users can save a post as favorite.
        WebElement saveToFavorite = Driver.getDriver().findElement(By.className("feed-post-important-switch"));
        saveToFavorite.click();
        BrowserUtils.sleep(2);

        //5. Verify users can send or cancel a comment to any post.
        //verify cancel comment
        WebElement commentOnPost = Driver.getDriver().findElement(By.className("feed-com-add"));
        commentOnPost.click();
        WebElement cancelButton = Driver.getDriver().findElement(By.xpath("//button[@class='ui-btn ui-btn-sm ui-btn-link']"));
        cancelButton.click();
        BrowserUtils.sleep(2);

        //verify SendComment
        WebElement commentPost = Driver.getDriver().findElement(By.xpath("//a[@class='feed-com-add-link']"));
        commentPost.click();
        BrowserUtils.sleep(2);

        //type Comment
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("bx-editor-iframe")));
        WebElement sendMessage = Driver.getDriver().findElement(By.xpath("//body"));
        sendMessage.click();
        sendMessage.sendKeys("Good Morning");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();

        //click Send button
        WebElement SendButton = Driver.getDriver().findElement(By.xpath("//button[@class='ui-btn ui-btn-sm ui-btn-primary']"));
        SendButton.click();
        BrowserUtils.sleep(2);

      Driver.closeDriver();

    }


}
