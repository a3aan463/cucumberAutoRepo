package com.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features={"src/test/resources/com/basic/hooksFF/"},
		glue= {"com/basic/hooksSD/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report-hooks.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport-hooks.html"
		}
		)

public class RunHooksTest {

}
