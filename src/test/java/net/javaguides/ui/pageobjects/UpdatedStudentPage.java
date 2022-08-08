package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.RandomValue;
import org.openqa.selenium.By;

public class UpdatedStudentPage extends BasePage {
    public static final By NEW_STUDENT_FIRST_NAME = By.xpath(("//th[contains(text()," + "'" + RandomValue.firstName + "'" + ")]"));
    public static final By NEW_STUDENT_LAST_NAME = By.xpath(("//th[contains(text()," + "'" + RandomValue.lastName + "'" + ")]"));
    public static final By NEW_STUDENT_EMAIL = By.xpath(("//th[contains(text()," + "'" + RandomValue.email + "'" + ")]"));

}
