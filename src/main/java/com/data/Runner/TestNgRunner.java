package com.data.Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "/Users/kollas/workspace1/CucumberBDDwithDataTable/src/main/java/Features/dealsmap.feature",
		glue = {"com.data.stepdefinition"},
		plugin= {"pretty", "html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = false
		
		
		
		)
public class TestNgRunner extends AbstractTestNGCucumberTests{

}
