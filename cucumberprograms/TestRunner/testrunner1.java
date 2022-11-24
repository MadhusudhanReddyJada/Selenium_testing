package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="/src/test/java/features/newtours.feature",
 glue= {"cucumber.steps"},
 monochrome=true,
 plugin= { "pretty","html:target/htmlreports/a1.html"})
 		
public class testrunner1 {

}
