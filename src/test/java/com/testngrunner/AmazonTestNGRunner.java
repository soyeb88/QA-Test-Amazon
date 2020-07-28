package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(  //cucumber annotation
		features = "Feature",
		glue = "com.stepdefinition"
		
		)

public class AmazonTestNGRunner extends AbstractTestNGCucumberTests{

}
