package cucucmber;

import org.baseclass.Base;
import org.baseclass.Reportgeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//resources//adactinpage.feature" }, glue = {
		"org.running" }, monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
				"html:C:\\Users\\vijay\\eclipse-workspace\\cucucmber\\reports",
				"json:C:\\Users\\vijay\\eclipse-workspace\\cucucmber\\reports.json",
				"junit:C:\\Users\\vijay\\eclipse-workspace\\cucucmber\\reports.xml",
				"json:C:\\Users\\vijay\\eclipse-workspace\\cucucmber\\target\\report\\sampleproject"})
public class Testrunner {

	@AfterClass
	public static void report() {
		Reportgeneration.jvmReport
		("C:\\Users\\vijay\\eclipse-workspace\\cucucmber\\target\\report\\sampleproject");

	}

}
