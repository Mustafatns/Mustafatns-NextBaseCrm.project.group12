package com.Group12.tests.AyjerenTests.Pages;

import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_8 {

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[2]")
    public WebElement taaskModule;

   @FindBy(xpath = "//td//tr[3]//td[1]")
   public WebElement anyClick;


   @FindBy(xpath = "(//td[@class='main-grid-control-panel-cell']/span)[1]")
   public WebElement selectoption;

   @FindBy(xpath = "(//tr[2]//div//span[.='Delete'][1])[1]")
   public WebElement deleteButton;

   @FindBy(id = "apply_button")
   public WebElement applyButton;


    public UserStory_8() throws InterruptedException {
        // Constructor is mandatory if we will use @Find by Elements annotations
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void searachBarClick(){
        taaskModule.click();
        BrowserUtils.sleep(3);

    }
    public void taskSearchBarMethod() throws InterruptedException {
        anyClick.click();
        BrowserUtils.sleep(5);
        selectoption.click();
        BrowserUtils.sleep(5);
        deleteButton.click();
        BrowserUtils.sleep(5);
        applyButton.click();
        BrowserUtils.sleep(5);

    }
}
