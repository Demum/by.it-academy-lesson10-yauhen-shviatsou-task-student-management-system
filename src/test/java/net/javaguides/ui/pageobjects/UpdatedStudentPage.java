package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.RandomValue;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatedStudentPage extends BasePage {
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
}
