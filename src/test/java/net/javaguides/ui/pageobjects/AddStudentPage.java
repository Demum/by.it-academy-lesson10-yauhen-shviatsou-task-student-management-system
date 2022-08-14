package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.RandomValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddStudentPage extends StudentsPage {

    @FindBy(xpath = "//h1[text()=' Create New Student ']")
    private WebElement textTitle;
    @FindBy(xpath = "//label[text()=' Student First Name ']")
    private WebElement textLabelFirstName;
    @FindBy(xpath = "//label[text()=' Student Last Name ']")
    private WebElement textLabelLastName;
    @FindBy(xpath = "//label[text()=' Student Email ']")
    private WebElement textLabelEmail;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement inputFirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement inputLastName;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    public boolean isDIsplayedTextTitleAddStudentPage() {
        waitForVisibilityOfElement(textTitle);
        return textTitle.isDisplayed();

    }

    public boolean isDIsplayedTextLabelFirstName() {
        waitForVisibilityOfElement(textLabelFirstName);
        return textLabelFirstName.isDisplayed();
    }

    public boolean isDIsplayedTextLabelLastName() {
        waitForVisibilityOfElement(textLabelLastName);
        return textLabelLastName.isDisplayed();
    }

    public boolean isDIsplayedTextLabelEmail() {
        waitForVisibilityOfElement(textLabelEmail);
        return textLabelEmail.isDisplayed();
    }

    public boolean isDIsplayedButtonSubmit() {
        waitForVisibilityOfElement(buttonSubmit);
        return buttonSubmit.isDisplayed();
    }

    public AddStudentPage typeFirstName() {
        inputFirstName.clear();
        inputFirstName.sendKeys(RandomValue.newFirstName);
        return this;
    }

    public AddStudentPage typeLastName() {
        inputLastName.clear();
        inputLastName.sendKeys(RandomValue.newLastName);
        return this;
    }

    public AddStudentPage typeEmail() {
        inputEmail.clear();
        inputEmail.sendKeys(RandomValue.newEmail);
        return this;
    }

    public AddStudentPage clickButtonSubmit() {
        waitForElementToBeClickable(buttonSubmit);
        buttonSubmit.click();
        return this;
    }

}
