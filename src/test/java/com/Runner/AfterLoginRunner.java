package com.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = {"com/StepDefinitions","com/hooks"},
//        tags = "@Reorder",
        dryRun = false,
        monochrome = false,
        plugin = {  "pretty",
                "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml",
                "html:target/report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
        }
)

public class AfterLoginRunner {
}