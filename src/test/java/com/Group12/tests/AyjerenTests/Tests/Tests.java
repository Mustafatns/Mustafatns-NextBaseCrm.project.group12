package com.Group12.tests.AyjerenTests.Tests;

import com.Group12.TestBase.LoginToTryCrm;
import com.Group12.tests.AyjerenTests.Pages.UserStory_3;
import com.Group12.tests.AyjerenTests.Pages.UserStory_8;
import com.Group12.utility.BrowserUtils;
import com.Group12.utility.Driver;
import org.testng.annotations.Test;

import java.awt.*;

public class Tests extends LoginToTryCrm {

    @Test(description = " Verify users can search a valid info from search box (employee, doc, post, etc)")
    public void test1() throws InterruptedException {
        UserStory_3 page = new UserStory_3();
        page.serachBoxIcon();
        page.searchBoxOptions("document", "post", "employee");
        BrowserUtils.sleep(5);
        Driver.getDriver().close();

    }

    // for marketing team
    @Test(description = "Upload file")
    public void test2() throws InterruptedException, AWTException {
        UserStory_3 page = new UserStory_3();
       page.SearchBoxUploadPicture();
        Driver.getDriver().close();

    }

    @Test(description = "Nothing found sentence should appear on page when entering invalid inputs or item names into 'search box'")
    public void test3() throws InterruptedException {
        UserStory_3 page = new UserStory_3();
        page.nothingFoundMsgMethod();
        BrowserUtils.sleep(5);
        Driver.getDriver().close();

    }

    @Test(description = "Click on Task button and user should be able to search for a 'Task' and delete it")
    public void test4() throws InterruptedException {
        UserStory_8 page=new UserStory_8();
        page.searachBarClick();
        page.taskSearchBarMethod();
        BrowserUtils.sleep(5);
        Driver.getDriver().close();
    }

}
