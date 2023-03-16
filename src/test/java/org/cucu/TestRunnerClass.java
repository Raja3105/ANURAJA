package org.cucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RAJA\\eclipse-workspace\\CucumberSecond\\src\\test\\resources\\facebookproject.feature",
glue="org.steps",
dryRun=true,
monochrome=false,
plugin="html:C:\\Users\\RAJA\\eclipse-workspace\\CucumberSecond\\target")

public class TestRunnerClass {

}
