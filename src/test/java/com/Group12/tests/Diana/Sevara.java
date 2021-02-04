package com.Group12.tests.Diana;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.stream.Stream;

public class Sevara extends LoginToTryCrm {

    @Test
    public void us10() throws InterruptedException {

        //"1. users  (hr, marketing only )  access to main modules : ""Activity Stream"", ""Tasks"",
        //  ""Chat and calls"", ""WorkGroups"", ""Drive"", ""Calendar"", ""main"", ""Contact Center"",
        //   ""Time and Reporting"", ""employees"",  ""Services"", ""Company"" , ""More:""
        //2. HelpDesk users cannot access to all mian modules. (Negative )"


        WebElement accessActivityStream = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[2]"));

        accessActivityStream.click();

        BrowserUtils.sleep(2);

        WebElement Tasks = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[3]"));

        Tasks.click();

        BrowserUtils.sleep(2);

        WebElement ChatAndCalls = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[4]"));

        ChatAndCalls.click();

        BrowserUtils.sleep(2);

        WebElement closePopUp = Driver.getDriver().findElement(By.xpath("//a[@class='bx-im-fullscreen-popup-back-link']"));

        closePopUp.click();

        WebElement WorkGroups = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[5]"));

        WorkGroups.click();

        BrowserUtils.sleep(2);

        WebElement Drive = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[6]"));

        Drive.click();

        BrowserUtils.sleep(2);

        WebElement Calendar = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[7]"));

        Calendar.click();

        BrowserUtils.sleep(2);


        WebElement main = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[8]"));

        main.click();

        BrowserUtils.sleep(2);

        WebElement ContactCenter = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[9]"));

        ContactCenter.click();

        BrowserUtils.sleep(2);

        WebElement TimeAndReporting = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[10]"));

        TimeAndReporting.click();

        BrowserUtils.sleep(2);


        WebElement employees = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[11]"));

        employees.click();

        BrowserUtils.sleep(2);

        WebElement Services = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[12]"));

        Services.click();

        BrowserUtils.sleep(2);

        WebElement Company = Driver.getDriver().findElement(By.xpath("//ul[@class='menu-items']/li[13]"));

        Company.click();

        BrowserUtils.sleep(2);



        WebElement More = Driver.getDriver().findElement(By.xpath("//span[@class='menu-favorites-more-text']"));

        More.click();

        BrowserUtils.sleep(2);





    }
}
