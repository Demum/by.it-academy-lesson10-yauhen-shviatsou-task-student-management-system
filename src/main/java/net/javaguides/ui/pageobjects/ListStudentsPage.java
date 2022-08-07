package net.javaguides.ui.pageobjects;

import net.javaguides.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListStudentsPage  {

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

    public WebElement getTextTitle() {
        return textTitle;
    }

    public WebElement getButtonAddStudent() {
        return buttonAddStudent;
    }

    public WebElement getTextTableTitleStudentFirstName() {
        return textTableTitleStudentFirstName;
    }

    public WebElement getTextTableTitleStudentLastName() {
        return textTableTitleStudentLastName;
    }

    public WebElement getTextTableTitleStudentEmail() {
        return textTableTitleStudentEmail;
    }

    public WebElement getTextTableTitleActions() {
        return textTableTitleActions;
    }

    public WebElement getFirstLineFirstNameInListStudents() {
        return firstLineFirstNameInListStudents;
    }

    public WebElement getFirstLineLastNameInListStudents() {
        return firstLineLastNameInListStudents;
    }

    public WebElement getFirstLineEmailInListStudents() {
        return firstLineEmailInListStudents;
    }

    public WebElement getFirstLineUpdateInListStudents() {
        return firstLineUpdateInListStudents;
    }

    public WebElement getFirstLineDeleteInListStudents() {
        return firstLineDeleteInListStudents;
    }

    public ListStudentsPage(WebDriver driver) {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
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
}


