package net.javaguides.ui;

import net.javaguides.ui.pageobjects.AddStudentPage;
import net.javaguides.ui.pageobjects.StudentsPage;
import net.javaguides.ui.pageobjects.UpdateStudentPage;
import net.javaguides.ui.pageobjects.UpdatedStudentPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StudentsPageTest extends BaseTest {

    AddStudentPage addStudentPage = new AddStudentPage();


    @Test
    public void testStudentsPage() {
        //GIVEN
        StudentsPage studentsPage = new StudentsPage();
        studentsPage.openPage();

        //WHEN

        //THEN
        Assert.assertTrue(studentsPage.isDisplayedTitle(), "Title is not displayed");
        Assert.assertTrue(studentsPage.isDisplayedButtonAddStudent(), "ButtonAddStudent not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentFirstName(), "TextTableTitleStudentFirstName not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentLastName(), "TextTableTitleStudentLastName not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentEmail(), "TextTableTitleStudentEmail not found");
        Assert.assertTrue(studentsPage.isDisplayedTextTableTitleStudentAction(), "TextTableTitleStudentActions not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineFirstNameInListStudents(), "FirstLineFirstNameInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineLastNameInListStudents(), "FirstLineLastNameInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineEmailInListStudents(), "FirstLineEmailInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineUpdateInListStudents(), "FirstLineUpdateInListStudents not found");
        Assert.assertTrue(studentsPage.isDisplayedFirstLineDeleteInListStudents(), "FirstLineDeleteInListStudents not found");
    }

    @Test
    public void testTextAndButtonAddStudentPage() {
        StudentsPage studentsPage = new StudentsPage();
        studentsPage.openPage();
        studentsPage.clickButtonAddStudent();
        Assert.assertTrue(addStudentPage.isDIsplayedTextTitleAddStudentPage(), "TextTitle is not displayed at AddStudentPage");
        Assert.assertTrue(addStudentPage.isDIsplayedTextLabelFirstName(), "TextLabelFirstName is not displayed at AddStudentPage");
        Assert.assertTrue(addStudentPage.isDIsplayedTextLabelLastName(), "TextLabelLastName is not displayed at AddStudentPage");
        Assert.assertTrue(addStudentPage.isDIsplayedTextLabelEmail(), "TextLabelEmail is not displayed at AddStudentPage");
        Assert.assertTrue(addStudentPage.isDIsplayedButtonSubmit(), "TextLabelEmail is not displayed at AddStudentPage");

    }
    UpdatedStudentPage updatedStudentPage = new UpdatedStudentPage();
    @Test
    void testInputFuтctionalAddStudentPage() {
        StudentsPage studentsPage = new StudentsPage();
        studentsPage.openPage();
        studentsPage.clickButtonAddStudent();
        addStudentPage.typeFirstName()
                      .typeLastName()
                      .typeEmail()
                      .clickButtonSubmit();

        Assert.assertTrue(updatedStudentPage.isDisplayed(UpdatedStudentPage.NEW_STUDENT_FIRST_NAME));
        Assert.assertTrue(updatedStudentPage.isDisplayed(UpdatedStudentPage.NEW_STUDENT_LAST_NAME));
        Assert.assertTrue(updatedStudentPage.isDisplayed(UpdatedStudentPage.NEW_STUDENT_EMAIL));
    }
    @Test
    public void testTextAndButtonUpdateStudentPage() {
        StudentsPage studentsPage = new StudentsPage();
        studentsPage.openPage();
       studentsPage.clickButtonFirstLineUpdateInListStudent();
//        System.out.println(updatedStudentPage.BUTTON_UPDATE_CREATED_STUDENT.toString()+"/////");
//        updatedStudentPage.clickButtonUpdateCreatedStudent();
        UpdateStudentPage updateStudentPage = new UpdateStudentPage();
        Assert.assertTrue(updateStudentPage.isDIsplayedTextTitleUpdateStudentPage(), "TextTitle is not displayed at UpdateStudentPage");
        Assert.assertTrue(updateStudentPage.isDIsplayedTextLabelFirstName(), "TextLabelFirstName is not displayed at UpdateStudentPage");
        Assert.assertTrue(updateStudentPage.isDIsplayedTextLabelLastName(), "TextLabelLastName is not displayed at UpdateStudentPage");
        Assert.assertTrue(updateStudentPage.isDIsplayedTextLabelEmail(), "TextLabelEmail is not displayed at UpdateStudentPage");
        Assert.assertTrue(updateStudentPage.isDIsplayedButtonSubmit(), "TextLabelEmail is not displayed at UpdateStudentPage");
    }
    @Test
    public void testUpdateFuтctionalUpdateStudentPage(){
        StudentsPage studentsPage = new StudentsPage();
        studentsPage.openPage();
        studentsPage.clickButtonFirstLineUpdateInListStudent();
        UpdateStudentPage updateStudentPage = new UpdateStudentPage();
        updateStudentPage.typeFirstName()
                .typeLastName()
                .typeEmail()
                .clickButtonSubmit();
        Assert.assertTrue(updatedStudentPage.isDisplayed(UpdatedStudentPage.NEW_STUDENT_FIRST_NAME));
        Assert.assertTrue(updatedStudentPage.isDisplayed(UpdatedStudentPage.NEW_STUDENT_LAST_NAME));
        Assert.assertTrue(updatedStudentPage.isDisplayed(UpdatedStudentPage.NEW_STUDENT_EMAIL));
    }


    }


