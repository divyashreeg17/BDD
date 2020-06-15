package runnerFiles;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(features = "./src/test/java/featureFiles", glue= {"stepDefinitions"})
public class Runner extends AbstractTestNGCucumberTests{

}
