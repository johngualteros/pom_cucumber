package com.automation.pom_cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "src/test/resources/features/MainPage.feature", glue = "com.automation.pom_cucumber.definitions",
        plugin = {})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}