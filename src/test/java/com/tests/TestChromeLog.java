package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeLog {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/driverschrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
}
