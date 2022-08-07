package net.javaguides.ui.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
        private static WebDriver driver;

        private DriverSingleton() {
        }

        public static WebDriver getDriver() {
            if (driver == null) {
                WebDriverManager
                        .chromedriver()
                        .setup();
                driver = new ChromeDriver();
                driver.manage()
                        .window()
                        .maximize();
            }

            return driver;
        }

        public static void closeDriver() {
            driver.quit();
            driver = null;
        }
    }