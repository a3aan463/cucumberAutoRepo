package com.basic.apitestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features={"src/test/resources/com/basic/apitestFF/"},
		glue= {"com/basic/apitestSD/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report-parameterization.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
		}
		)

public class RunApitestTest {

}
