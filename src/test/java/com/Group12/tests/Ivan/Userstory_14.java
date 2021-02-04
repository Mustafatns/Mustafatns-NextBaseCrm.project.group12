package com.Group12.tests.Ivan;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Userstory_14 extends LoginToTryCrm {

    @Test
    public void As_a_user_I_should_be_able_to_logout_from_the_app () throws InterruptedException {

        WebElement profileMenu = Driver.getDriver().findElement(By.xpath("//div[@class='user-block']"));
        profileMenu.click();
        BrowserUtils.sleep(2);

        WebElement logOut = Driver.getDriver().findElement(By.xpath("//span[.='Log out']"));
        logOut.click();
        BrowserUtils.sleep(2);




    }


}
