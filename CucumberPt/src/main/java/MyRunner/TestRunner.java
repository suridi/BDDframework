package MyRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue= {"step_definitions"}
		, format ={"pretty", "html:target/cucumber"}
		, monochrome =true
		,dryRun=false
		,plugin= {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		
		)

public class TestRunner {
	 @AfterClass
	    public static void setup() {
	        Reporter.loadXMLConfig(new File("src/test/java/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Windows");
	        Reporter.setTestRunnerOutput("First Extent Report");
	    }
}
