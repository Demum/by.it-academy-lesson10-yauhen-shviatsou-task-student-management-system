package net.javaguides.ui;

import net.javaguides.ui.pageobjects.BasePage;
import net.javaguides.ui.pageobjects.ListStudentsPage;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class ListStudentsTest extends BasePage {
ListStudentsPage listStudentsPage;

@BeforeMethod
    public void opentlistStudentPage(){
    listStudentsPage = new ListStudentsPage(driver);
    driver.get(BASE_URL);
    }

    @Test
    public  void testPageListStudent(){
    waitForVisibilityOfElement(listStudentsPage.getTextTitle());
        Assert.assertTrue( listStudentsPage.isDisplayedTitle());
    }
}
