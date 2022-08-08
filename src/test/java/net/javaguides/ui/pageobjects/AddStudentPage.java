package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.Constants;
import net.javaguides.ui.utils.RandomValue;
import org.openqa.selenium.By;

public class AddStudentPage extends StudentsPage {
    public static final By TEXT_TITLE = By.xpath("//h1[text()=' Create New Student ']");
    public static final By TEXT_LABEL_FIRST_NAME = By.xpath("//label[text()=' Student First Name ']");
    public static final By TEXT_LABEL_LAST_NAME = By.xpath("//label[text()=' Student Last Name ']");
    public static final By TEXT_LABEL_EMAIL = By.xpath("//label[text()=' Student Email ']");
    public static final By BUTTON_SUBMIT = By.xpath("//button[contains(text(),'Submit')]");

    public static final By INPUT_FIRST_NAME = By.xpath("//input[@name='firstName']");
    public static final By INPUT_LAST_NAME = By.xpath("//input[@name='lastName']");
    public static final By INPUT_EMAIL = By.xpath("//input[@name='email']");

    public boolean isDIsplayedTetTitle(){
        return driver.findElement(TEXT_TITLE).isDisplayed();
    }
    public boolean isDIsplayedLabelFirstName(){
        return driver.findElement(TEXT_LABEL_FIRST_NAME).isDisplayed();
    }
    public boolean isDIsplayedLabelLastName(){
        return driver.findElement(TEXT_LABEL_LAST_NAME).isDisplayed();
    }
    public boolean isDIsplayedLabelEmail(){
        return driver.findElement(TEXT_LABEL_EMAIL).isDisplayed();
    }
    public boolean isDIsplayedLabelButtonSubmit(){
        return driver.findElement(BUTTON_SUBMIT).isDisplayed();
    }
 String firstName=RandomValue.setRandomString();
    String lastName=RandomValue.setRandomString();
    String email = RandomValue.setUserEmail();
    @Override
    public void clickButtonAddStudent() {
        super.clickButtonAddStudent();
                driver.findElement(INPUT_FIRST_NAME).sendKeys(firstName);
                driver.findElement(INPUT_LAST_NAME).sendKeys(lastName);
                driver.findElement(INPUT_EMAIL).sendKeys(email);
                driver.findElement(BUTTON_SUBMIT);
    }
}
