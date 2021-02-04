package com.Group12.tests.AyjerenTests.Pages;

import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UserStory_3 {

    @FindBy(xpath = "//input[@class='header-search-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement documentTxt;

    @FindBy(xpath = "//div[@id='pagetitle']")
    public WebElement activityStream;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureTxt;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[5]")
    public WebElement myDriverButton;

    @FindBy(xpath = "//span[@id='bx-disk-add-menu']")
    public WebElement addButton;


    @FindBy(id= "inputContainerLabelFolderList")
    public WebElement selectFile;

    @FindBy(xpath = "//span[@class='bx-disk-popup-upload-file-progress-btn-end']")
    public WebElement uploadSelectButton;


    @FindBy(xpath = "(//div[.='Nothing found'])[2]")
    public WebElement nothingFoundTxt;


    public UserStory_3() throws InterruptedException {
        // Constructor is mandatory if we will use @Find by Elements annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void serachBoxIcon(){
        searchBox.click();
    }


    public void searchBoxOptions(String documents, String post, String employee){
       // searchBox.sendKeys(documents, Keys.ENTER);

        searchBox.sendKeys(post,Keys.ENTER);
        String activivtyTxt= activityStream.getText();
        Assert.assertEquals(activivtyTxt,"Activity Stream");
        BrowserUtils.sleep(5);
        searchBox.sendKeys(Keys.BACK_SPACE);

        searchBox.sendKeys(employee,Keys.ENTER);
        String actualCompanyName= companyStructureTxt.getText();
        String expected="Company Structure";
        Assert.assertEquals(actualCompanyName,expected);
        BrowserUtils.sleep(5);
        searchBox.sendKeys(Keys.BACK_SPACE);

        searchBox.sendKeys(documents,Keys.ENTER);
        String documentsText = documentTxt.getText();
        Assert.assertEquals(documentsText,"All Documents");
        BrowserUtils.sleep(5);
    }

    // for marketing team
    public void SearchBoxUploadPicture() throws InterruptedException, AWTException {

        myDriverButton.click();
        BrowserUtils.sleep(3);
        addButton.click();
        String path="C:\\Users\\Ayah\\Documents\\nextbase1.png";

        Robot robot = new Robot();  // Robot class throws AWT Exception
        Thread.sleep(2000); // Thread.sleep throws InterruptedException
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button

        Thread.sleep(2000);  // sleep has only been used to showcase each event separately
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        // press enter key of keyboard to perform above selected action
        WebDriverWait wait = new WebDriverWait(new ChromeDriver(), 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("//span[@class='bx-disk-popup-upload-file-progress-btn-end']")));




        selectFile.sendKeys(path);
         uploadSelectButton.click();

        if (uploadSelectButton.isEnabled()){
            uploadSelectButton.click();
            System.out.println("Test Pass , your picture is uploded");
        }else {
            System.out.println("Test FAILED, upload button doesn't work");
        }

    }

    public void nothingFoundMsgMethod(){
        searchBox.sendKeys("Turkmenistan", Keys.ENTER);
        BrowserUtils.sleep(5);
        String nothingFOUNDTxt = nothingFoundTxt.getText();
        Assert.assertEquals(nothingFOUNDTxt,"Nothing found");
    }

}
