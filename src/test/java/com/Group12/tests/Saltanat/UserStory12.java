package com.Group12.tests.Saltanat;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory12 extends LoginToTryCrm {


    @Test
    public void As_a_user_I_should_be_able_to_send_aVerify_users_search() throws InterruptedException {

        //1. Verify users search by type-in keyword to search previous posts
        WebElement filterButton = Driver.getDriver().findElement(By.id("LIVEFEED_search"));
        filterButton.click();
        BrowserUtils.sleep(3);

        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("Tell me about your favorite color?");

WebElement searchButton = Driver.getDriver().findElement(By.xpath("//span[@class='main-ui-item-icon main-ui-search']"));
searchButton.click();
BrowserUtils.sleep(3);









//2. Verify users can search by editing Date, Type, Author, To and more default dropdowns.
//3. Users should be able to Filter by work, favorites, my activity,
 //announcement and workflow. "



    }


}
