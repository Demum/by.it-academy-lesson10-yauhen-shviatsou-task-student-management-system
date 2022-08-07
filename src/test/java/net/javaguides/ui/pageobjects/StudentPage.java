package net.javaguides.ui.pageobjects;

import org.openqa.selenium.By;

public class StudentPage extends BasePage{
public static final By TITLE_STUDENT_PAGE = By.xpath("//h1[text()=' List Students ']");
    public static final By BUTTON_ADD_STUDENT = By.xpath("//a[@href='/students/new']");
    public static final By TITLE_TABLE_FIRST_NAME = By.xpath("//th[text()=' Student First Name']");


    public StudentPage(String url) {
        super(url);
    }
    public String getTitleStudentPage() {
        return driver.findElement(TITLE_STUDENT_PAGE).getText();
    }
}
