package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.RandomValue;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatedStudentPage extends BasePage {
    public static final By BUTTON_UPDATE_CREATED_STUDENT = By.xpath(StringUtils.deleteWhitespace("//td[text()='" + RandomValue.newFirstName + "']"+"//..//a[text()='Update'] "));

    public static final By BUTTON_DELETE_CREATED_STUDENT = By.xpath("//td[text()='" + RandomValue.newFirstName + "']"+"//..//a[text()='Delete'] ");
    public static final By UPDATE_BUTTON_DELETE_CREATED_STUDENT = By.xpath("//td[text()='" + RandomValue.updateNewFirstName + "']"+"//..//a[text()='Delete'] ");


    public static final By NEW_STUDENT_FIRST_NAME = By.xpath(("//td[text()='" + RandomValue.newFirstName + "']"));

    public static final By NEW_STUDENT_LAST_NAME = By.xpath(("//td[text()='" + RandomValue.newLastName + "']"));
   public static final By NEW_STUDENT_EMAIL = By.xpath(("//td[text()='" + RandomValue.newEmail + "']"));

    public static final By UPDATE_NEW_STUDENT_FIRST_NAME = By.xpath(("//td[text()='" + RandomValue.updateNewFirstName + "']"));

    public static final By UPDATE_NEW_STUDENT_LAST_NAME = By.xpath(("//td[text()='" + RandomValue.updateNewLastName + "']"));
    public static final By UPDATE_NEW_STUDENT_EMAIL = By.xpath(("//td[text()='" + RandomValue.updateNewEmail + "']"));


    public  boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Locator: " + locator + " not found");
            return false;
        }
    }
    public UpdatedStudentPage clickButtonUpdateCreatedStudent (){
        driver.findElement(BUTTON_UPDATE_CREATED_STUDENT).click();
        return this;
    }
    public UpdatedStudentPage clickButtonDeleteCreatedStudent (){
        driver.findElement(BUTTON_DELETE_CREATED_STUDENT).click();
        return this;
    }
    public UpdatedStudentPage clickUpdatedButtonDeleteCreatedStudent (){
        driver.findElement(UPDATE_BUTTON_DELETE_CREATED_STUDENT).click();
        return this;
    }
}
