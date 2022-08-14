package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentsPage extends BasePage{
    @FindBy(xpath = "//h1[text()=' List Students ']")
    private WebElement textTitle;

    @FindBy(xpath = "//a[@href='/students/new']")
    private WebElement buttonAddStudent;

    @FindBy(xpath = "//th[text()=' Student First Name']")
    private WebElement textTableTitleStudentFirstName;

    @FindBy(xpath = "//th[text()=' Student Last Name']")
    private WebElement textTableTitleStudentLastName;

    @FindBy(xpath = "//th[text()=' Student Email ']")
    private WebElement textTableTitleStudentEmail;

    @FindBy(xpath = "//th[text()=' Actions ']")
    private WebElement textTableTitleActions;

    @FindBy(xpath = "//tr[1]/td[1]")
    private WebElement firstLineFirstNameInListStudents;

    @FindBy(xpath = "//tr[1]/td[2]")
    private WebElement firstLineLastNameInListStudents;

    @FindBy(xpath = "//tr[1]/td[3]")
    private WebElement firstLineEmailInListStudents;

    @FindBy(xpath = "//tr[1]//a[text()='Update']")
    private WebElement firstLineUpdateInListStudents;

    @FindBy(xpath = "//tr[1]//a[text()='Delete']")
    private WebElement firstLineDeleteInListStudents;



    public StudentsPage openPage(){
        driver.get(Constants.BASE_URL);
        return this;
    }

    public boolean isDisplayedTitle() {
           return textTitle.isDisplayed();
    }
    public boolean isDisplayedButtonAddStudent(){
        return   buttonAddStudent.isDisplayed();
    }
    public boolean isDisplayedTextTableTitleStudentFirstName(){
        return textTableTitleStudentFirstName.isDisplayed();
    }
    public boolean isDisplayedTextTableTitleStudentLastName(){
        return textTableTitleStudentLastName.isDisplayed();
    }
    public boolean isDisplayedTextTableTitleStudentEmail(){
        return textTableTitleStudentEmail.isDisplayed();
    }
    public boolean isDisplayedTextTableTitleStudentAction(){
        return textTableTitleActions.isDisplayed();
    }
    public boolean isDisplayedFirstLineFirstNameInListStudents(){
        return firstLineFirstNameInListStudents.isDisplayed();
    }
    public boolean isDisplayedFirstLineLastNameInListStudents(){
        return firstLineLastNameInListStudents.isDisplayed();
    }
    public boolean isDisplayedFirstLineEmailInListStudents() {
        return firstLineEmailInListStudents.isDisplayed();
    }
    public boolean isDisplayedFirstLineUpdateInListStudents() {
        return firstLineUpdateInListStudents.isDisplayed();
    }
    public boolean isDisplayedFirstLineDeleteInListStudents() {
        return firstLineDeleteInListStudents.isDisplayed();
    }

    public StudentsPage clickButtonAddStudent (){
        waitForElementToBeClickable(buttonAddStudent);
        buttonAddStudent.click();
        return this;
    }


    public StudentsPage clickButtonFirstLineUpdateInListStudent(){
        waitForElementToBeClickable(firstLineUpdateInListStudents);
        firstLineUpdateInListStudents.click();
        return this;
    }
}
