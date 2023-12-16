package com.automation.pom_cucumber.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageLocators {
    @FindBy(className = "new-training__heading")
    public WebElement titleHeading;
}
