package com.runner3;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features/",
		glue= {"com.steppackage3","pack.hooks"},
		monochrome=true, // make console more clear and readable
		dryRun=false,   // runs the test without opening the browser if we add any stepin feature
		//tags="@smoke", //regression// specify the elements I want to run
		strict=true ,  //false  // 
		plugin = {"json:target/cucumber.json"}
		)
	
public class MyRunner3 extends AbstractTestNGCucumberTests{

}
