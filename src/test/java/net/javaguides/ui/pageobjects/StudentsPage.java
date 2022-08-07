package net.javaguides.ui.pageobjects;

import org.openqa.selenium.By;

public class StudentsPage extends BasePage{

public static final By TITLE_STUDENT_PAGE = By.xpath("//h1[text()=' List Students ']");
    public static final By BUTTON_ADD_STUDENT = By.xpath("//a[@href='/students/new']");
    public static final By TITLE_TABLE_FIRST_NAME = By.xpath("//th[text()=' Student First Name']");
    public static final By TITLE_TABLE_LAST_NAME = By.xpath("//th[text()=' Student Last Name'] ");
    public static final By TITLE_TABLE_EMAIL = By.xpath("//th[text()=' Student Email ']");
    public static final By TITLE_TABLE_ACTIONS = By.xpath("//th[text()=' Actions '] ");
    public static final By FIRST_LINE_TABLE_FIRST_NAME = By.xpath("//tr[1]/td[1]");
    public static final By FIRST_LINE_TABLE_LAST_NAME = By.xpath("//tr[1]/td[1]");
    public static final By FIRST_LINE_TABLE_EMAIL = By.xpath("//tr[1]/td[3]");
    public static final By FIRST_LINE_TABLE_BUTTON_UPDATE = By.xpath("//tr[1]//a[text()='Update'] ");
    public static final By FIRST_LINE_TABLE_BUTTON_DELETE = By.xpath("//tr[1]//a[text()='Delete'] ");

    public StudentsPage(String url) {
        super(url);
    }
    public boolean isDisplayedTitle() {
        return driver.findElement(TITLE_STUDENT_PAGE).isDisplayed();
    }
    public boolean isDisplayedButtonAddStudent(){
        return driver.findElement(BUTTON_ADD_STUDENT).isDisplayed();

    }
    public boolean isDisplayedTitleTableFisrtName(){
        return driver.findElement(TITLE_TABLE_FIRST_NAME).isDisplayed();
            }
    public boolean isDisplayedTitleTableLasttName(){
        return driver.findElement(TITLE_TABLE_LAST_NAME).isDisplayed();
    }

    public boolean isDisplayedTitleTableEmail(){
        return driver.findElement(TITLE_TABLE_EMAIL).isDisplayed();
    }
    public boolean isDisplayedTitleTableActions(){
        return driver.findElement(TITLE_TABLE_ACTIONS).isDisplayed();
    }
    public boolean isDisplayedFirstLineTableFirstName(){
        return driver.findElement(FIRST_LINE_TABLE_FIRST_NAME).isDisplayed();
    }
    public boolean isDisplayedFirstLineTableLastdName(){
        return driver.findElement(FIRST_LINE_TABLE_LAST_NAME).isDisplayed();
    }
    public boolean isDisplayedFirstLineTableEmail(){
        return driver.findElement(FIRST_LINE_TABLE_EMAIL).isDisplayed();
    }
    public boolean isDisplayedFirstLineTableButtonUpdate(){
        return driver.findElement(FIRST_LINE_TABLE_BUTTON_UPDATE).isDisplayed();
    }
    public boolean isDisplayedFirstLineTableButtonDelete(){
        return driver.findElement(FIRST_LINE_TABLE_BUTTON_DELETE).isDisplayed();
    }

}
