package com.data.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "/Users/kollas/workspace1/CucumberBDDwithDataTable/src/main/java/Features/dealsmap.feature",
		glue = {"com.data.stepdefinition"},
		format = {"pretty", "html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = true
		
		
		
		)



public class DataRunner {

}
