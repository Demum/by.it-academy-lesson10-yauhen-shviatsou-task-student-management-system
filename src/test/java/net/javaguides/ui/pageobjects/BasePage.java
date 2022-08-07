package net.javaguides.ui.pageobjects;

import net.javaguides.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected String url;
    WebDriver driver = DriverSingleton.getDriver();

    public BasePage(String url) {
        this.url = url;
    }
}