package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		//tags = {"@Important"}, //All scenarios if this is tag for featurefile
			//tags = {"@Smoke"}, //Only tags with @Smoke
			//tags = {"@Smoke", "@Regression"}, //AND condition
			tags = {"@Smoke, @Regression"}, //OR condition
		features={"src/test/resources/com/basic/tagsFF/"},
		glue= {"com/basic/tagsSD/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report-tags.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
		}
		)

public class RunTagsTest {

}
