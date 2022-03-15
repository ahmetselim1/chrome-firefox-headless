package com.tests;

import com.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.utilities.BrowserUtilities.writeToFile;

public class IasTest extends TestBase {
    BasePage basePage = new BasePage();

    @Test
    public void scenerio1() throws InterruptedException {

        System.out.println("title = " + driver.getTitle());
        WebElement getOwnPropertyNames = driver.findElement(By.id("getOwnPropertyNames"));
        WebElement getGlobalObjects = driver.findElement(By.id("Objectkeys"));
        WebElement getnavigatorLogsElement = driver.findElement(By.id("navigatorLogs"));

        String getOwnProp = getOwnPropertyNames.getText();
        String getGlobal = getGlobalObjects.getText();
        String navigatorLogs = getnavigatorLogsElement.getText();

        System.out.println("navigatorLogs = " + navigatorLogs);

        writeToFile(navigatorLogs, "haedlesslog.txt");

    }
}

