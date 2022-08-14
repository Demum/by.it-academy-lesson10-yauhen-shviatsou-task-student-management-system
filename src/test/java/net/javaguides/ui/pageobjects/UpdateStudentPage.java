package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.RandomValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateStudentPage extends BasePage {
    public static String newFirstName = RandomValue.setStudentFirstName();
    public static String newLastName = RandomValue.setStudentLastName();
    public static String newEmail = RandomValue.setStudentEmail();
    @FindBy(xpath = "//h1[text()=' Update Student ']")
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

    public boolean isDIsplayedTextTitleUpdateStudentPage() {
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

    public UpdateStudentPage typeFirstName() {
        inputFirstName.clear();
        inputFirstName.sendKeys(newFirstName);
        return this;
    }

    public UpdateStudentPage typeLastName() {
        inputLastName.clear();
        inputLastName.sendKeys(newLastName);
        return this;
    }

    public UpdateStudentPage typeEmail() {
        inputEmail.clear();
        inputEmail.sendKeys(newEmail);
        return this;
    }

    public UpdateStudentPage clickButtonSubmit() {
        waitForElementToBeClickable(buttonSubmit);
        buttonSubmit.click();
        return this;
    }
}
