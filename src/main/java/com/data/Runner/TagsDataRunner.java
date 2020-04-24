package com.data.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/kollas/workspace1/CucumberBDDwithDataTable/src/main/java/Features/tagsdeal.feature",
		glue = {"stepDefinition"},
		format = {"pretty", "http:test-output"},
		dryRun = true,
		tags = {"@SmokeTest"}
		
		)

public class TagsDataRunner {

}
// /Users/kollas/workspace1/CucumberBDDwithDataTable/src/main/java/com/data/stepdefinition/TagsStepDefinition.java



		
		
		



