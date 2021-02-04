package com.Group12.tests.Sevara;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//13. As a user, I should be able to access to main modules of the app
//    As a user, I should be able to logout from the app

public class US13_NextBaseCRM {
      public static void main(String[] args) throws InterruptedException {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://qa.nextbasecrm.com");
            driver.findElement(By.name("USER_LOGIN")).sendKeys("marketing72@cybertekschool.com" + Keys.ENTER);
            driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser" + Keys.ENTER);

            ///div[@class='sitemap-menu']
          //  driver.findElement(By.xpath("//span[@class='menu-item-link-text']")).click();

            WebElement accessActivityStream = driver.findElement(By.xpath("//ul[@class='menu-items']/li[2]"));
            accessActivityStream.click();
            Thread.sleep(2000);

            WebElement Tasks = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[3]"));
            Tasks.click();
            Thread.sleep(2000);
            WebElement ChatandCalls = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[4]"));
            ChatandCalls.click();
            Thread.sleep(2000);

            WebElement closePopUp = driver.findElement(By.xpath("//a[@class='bx-im-fullscreen-popup-back-link']"));
            closePopUp.click();

            WebElement Workgroup = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[5]"));
            Workgroup.click();
            Thread.sleep(2000);
            WebElement Drive = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[6]"));
            Drive.click();
            Thread.sleep(2000);
            WebElement Calendar = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[7]"));
            Calendar.click();
            Thread.sleep(2000);
            WebElement Mail = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[8]"));
            Mail.click();
            Thread.sleep(2000);
            WebElement ContractCenter = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[9]"));
            ContractCenter.click();
            Thread.sleep(2000);
            WebElement TimeandReports = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[10]"));
            TimeandReports.click();
            Thread.sleep(2000);
            WebElement Empployees = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[11]"));
            Empployees.click();
            Thread.sleep(2000);
            WebElement Services = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[12]"));
            Services.click();
            Thread.sleep(2000);
            WebElement Company = driver.findElement(By.xpath( "//ul[@class=‘menu-items’]/li[13]"));
            Company.click();
            Thread.sleep(2000);




          //  driver.close();



             // String emailInputBox = "UserUser";
             //  WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
            //WebElement retrivePasswordButton = driver.findElement(By.cssSelector("button.radius"));


      }
}