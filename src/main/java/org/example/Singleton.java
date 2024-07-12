package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Singleton {




        private static WebDriver driver;

        private Singleton() {
            // Private constructor to prevent instantiation
        }

        public static WebDriver getDriver() {
            if (driver == null) {
                // Initialize the WebDriver instance
                System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
                ChromeOptions options = new ChromeOptions();
                // Add any additional options if needed
                driver = new ChromeDriver(options);
            }
            return driver;
        }

        public static void quitDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }
