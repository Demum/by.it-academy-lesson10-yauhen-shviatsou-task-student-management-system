package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.RandomValue;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatedStudentPage extends BasePage {
    public static final By BUTTON_UPDATE_CREATED_STUDENT = By.xpath(StringUtils.deleteWhitespace("//td[text()='" + AddStudentPage.newFirstName + "']"+"//..//a[text()='Update'] "));

    public static final By BUTTON_DELETE_CREATED_STUDENT = By.xpath("//td[text()='" + AddStudentPage.newFirstName + "']"+"//..//a[text()='Delete'] ");

    public static final By NEW_STUDENT_FIRST_NAME = By.xpath(("//td[text()='" + AddStudentPage.newFirstName + "']"));

    public static final By NEW_STUDENT_LAST_NAME = By.xpath(("//td[text()='" + AddStudentPage.newLastName + "']"));
   public static final By NEW_STUDENT_EMAIL = By.xpath(("//td[text()='" + AddStudentPage.newEmail + "']"));



    public  boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Locator: " + locator + " not found");
            return false;
        }
    }
    public UpdatedStudentPage clickButtonUpdateCreatedStudent (){
        waitForElementToBeClickable(driver.findElement(BUTTON_UPDATE_CREATED_STUDENT));
        driver.findElement(BUTTON_UPDATE_CREATED_STUDENT).click();
        return this;
    }
    public UpdatedStudentPage clickButtonDeleteCreatedStudent (){
        waitForElementToBeClickable(driver.findElement(BUTTON_DELETE_CREATED_STUDENT));
        driver.findElement(BUTTON_DELETE_CREATED_STUDENT).click();
        return this;
    }
}
