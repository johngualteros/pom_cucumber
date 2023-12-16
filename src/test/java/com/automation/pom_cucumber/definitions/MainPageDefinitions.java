package com.automation.pom_cucumber.definitions;

import com.automation.pom_cucumber.actions.MainPageActions;
import com.automation.pom_cucumber.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainPageDefinitions {
    MainPageActions mainPageActions = new MainPageActions();

    @Given("User access to page {string}")
    public void openPage(String url) {
        HelperClass.openPage(url);
    }

    @When("User enter to page should see the title {string}")
    public void validateTitle(String titleContent) {
        mainPageActions.getMainPageTitle();
    }
}
