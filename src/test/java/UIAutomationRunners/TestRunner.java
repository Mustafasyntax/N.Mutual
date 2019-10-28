package UIAutomationRunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
features="src/test/resources/features/"
,glue="UIAutomationSteps"
//,dryRun=true
,monochrome=true
,tags={"@test1","@test2"}
,plugin= {"pretty","html:target/cucumber-default-reports","json:target/cucumber.json"}
)
public class TestRunner {
	
}

