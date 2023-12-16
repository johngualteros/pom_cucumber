package com.automation.pom_cucumber.actions;

import com.automation.pom_cucumber.locators.MainPageLocators;
import com.automation.pom_cucumber.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class MainPageActions {
    MainPageLocators mainPageLocators = null;
    public MainPageActions() {
        this.mainPageLocators = new MainPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), mainPageLocators);
    }

    public String getMainPageTitle() {
        return mainPageLocators.titleHeading.getText();
    }
}
