package net.javaguides.ui.pageobjects;

import net.javaguides.ui.utils.RandomValue;
import org.openqa.selenium.By;

public class DeleteStudentPage extends BasePage {
    public static final By BUTTON_DELETE_STUDENT = By.xpath("//td[contains(text()," + "'" + RandomValue.firstName + "'" + ")]//following::a[2]");
    public DeleteStudentPage clickDeleteStudent() {
        driver.findElement((BUTTON_DELETE_STUDENT)).click();
        return new DeleteStudentPage();
    }

}
