package com.pages;

//import...

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@title=\"Taschen\" and @data-flyout-target=\"taschen\"]")
    public WebElement bag;

    @FindBy(xpath = "//div[contains(@class,'flex-container')]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    public WebElement valentino;


}
