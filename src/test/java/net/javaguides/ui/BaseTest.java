package net.javaguides.ui;

import net.javaguides.ui.driver.DriverSingleton;
//import net.javaguides.ui.steps.StudentStep;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {

//    @BeforeClass
//    public static void actionStudent() {
// //       StudentStep.studentStepsAddUpdateEditorDelete();

//    }

    @AfterMethod
    public void finishTest() {
        DriverSingleton.closeDriver();
    }
}