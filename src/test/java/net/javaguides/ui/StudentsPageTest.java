package net.javaguides.ui;

import net.javaguides.ui.driver.DriverSingleton;
import net.javaguides.ui.pageobjects.BasePage;
import net.javaguides.ui.pageobjects.StudentsPage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class StudentsPageTest extends BaseTest {
    StudentsPage studentsPage = new StudentsPage();
    @Test
    public void testStudentsPage() {
        //GIVEN

        studentsPage.openPage();
        //WHEN

        //THEN
        Assert.assertTrue(studentsPage.isDisplayedTitle(),"Title not found");
        Assert.assertTrue(studentsPage.isDisplayedButtonAddStudent(),"ButtonAddStudent not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentFirstName(),"TextTableTitleStudentFirstName not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentLastName(),"TextTableTitleStudentLastName not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentEmail(),"TextTableTitleStudentEmail not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentAction(),"TextTableTitleStudentActions not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineFirstNameInListStudents(),"FirstLineFirstNameInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineLastNameInListStudents(),"FirstLineLastNameInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineEmailInListStudents(),"FirstLineEmailInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineUpdateInListStudents(),"FirstLineUpdateInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineDeleteInListStudents(),"FirstLineDeleteInListStudents not found");

    }

    @Test
    public void testAddStudentPage(){
        studentsPage.openPage()
                .clickButtonAddStudent();



    }




}