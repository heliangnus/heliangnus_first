package com.bjsxt1.cumberTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/resources/arguments.feature",
glue = "com.bjsxt1.cucumberTest.steps1", monochrome = true
)
public class LemonRunner1 extends AbstractTestNGCucumberTests {

}
