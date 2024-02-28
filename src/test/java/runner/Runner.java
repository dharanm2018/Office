package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/login.feature",
glue="stepdef",
dryRun=false,
plugin= {"html:target/cucumberreport.html"})

public class Runner {

}
