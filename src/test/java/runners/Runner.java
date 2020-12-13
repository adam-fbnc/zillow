package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features="src/test/resources/features",
        glue="/step_definitions",
        tags = "@zillow",
        dryRun = false
)

public class Runner {
}
