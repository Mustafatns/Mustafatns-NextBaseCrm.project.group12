package com.Group12.tests.Sevara;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//13. As a user, I should be able to access to main modules of the app
//    As a user, I should be able to logout from the app

public class Test2 extends LoginToTryCrm {

    @Test
    public void as_a_user_I_should_be_able_to_access_to_main_modules_of_the_app() throws InterruptedException {


        WebElement accessActivityStream = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[2]"));
        accessActivityStream.click();
        BrowserUtils.sleep(1);
        WebElement Tasks = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[3]"));
        Tasks.click();
        BrowserUtils.sleep(1);
        WebElement ChatAndCalls = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[4]"));
        ChatAndCalls.click();
        BrowserUtils.sleep(1);
        WebElement closePopUp = Driver.getDriver().findElement(By.xpath("//a[@class='bx-im-fullscreen-popup-back-link']"));
        closePopUp.click();
        WebElement WorkGroups = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[5]"));
        WorkGroups.click();
        BrowserUtils.sleep(1);
        WebElement Drive = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[6]"));
        Drive.click();
        BrowserUtils.sleep(1);
        WebElement Calendar = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[7]"));
        Calendar.click();
        BrowserUtils.sleep(1);
        WebElement main = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[8]"));
        main.click();
        BrowserUtils.sleep(1);
        WebElement ContactCenter = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[9]"));
        ContactCenter.click();
        BrowserUtils.sleep(1);
        WebElement TimeAndReporting = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[10]"));
        TimeAndReporting.click();
        BrowserUtils.sleep(1);
        WebElement employees = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[11]"));
        employees.click();
        BrowserUtils.sleep(1);
        WebElement Services = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[12]"));
        Services.click();
        BrowserUtils.sleep(1);
        WebElement Company = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[13]"));
        Company.click();
        BrowserUtils.sleep(1);

        WebElement More = Driver.getDriver().findElement(By.xpath("//span[@class='menu-favorites-more-text']   "));
       More.click();
      BrowserUtils.sleep(1);


    }


}
