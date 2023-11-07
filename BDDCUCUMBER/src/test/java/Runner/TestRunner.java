package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Features\\LoginPage.feature",glue= {"StepDefinations"},
           plugin= {"pretty","json:target/JSONReports/report.json",
        		   "pretty","html:target/HTMLReports/report.html",
        		   "pretty","junit:target/JUnitReports/report.xml"})
           
		public class TestRunner {

}
