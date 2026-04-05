package main.java.com.bjsxt.cucumberTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/main/resources/lemo.feature","src/main/resources/DDTDriver.feature"},
glue = "com.bjsxt.cucumberTest.steps", monochrome = true
)
public class LemonRunner extends AbstractTestNGCucumberTests {

}
