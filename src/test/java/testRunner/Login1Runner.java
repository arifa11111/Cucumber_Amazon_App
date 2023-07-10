package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/login1.feature",
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true,
        tags = "@admin or @user",
        plugin = {"pretty","html:assignment"}
)

public class Login1Runner {
}