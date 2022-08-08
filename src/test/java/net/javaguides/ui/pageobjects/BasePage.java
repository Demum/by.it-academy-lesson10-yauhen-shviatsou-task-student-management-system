package net.javaguides.ui.pageobjects;

import net.javaguides.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {

   protected WebDriver driver;

   protected BasePage() {
       driver = DriverSingleton.getDriver();
    }
}