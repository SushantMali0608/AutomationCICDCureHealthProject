package HealthCureOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features", glue="stepDefinations",monochrome=true, tags="@valid")

public class TestngRunner extends AbstractTestNGCucumberTests {
	
	

}
