package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/Order.feature",
        glue = {"stepDefinitions","hooks"},
//        dryRun = true, //print only steps not step definations
        monochrome = false, //style the console o/p
        tags = "@smoke",
        plugin = {"pretty","json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml"}
)

public class OrderRunner {
}