package framework.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "framework.steps",
        tags = "@Smoke",
        dryRun = false,
        plugin = {
                "html:target/cucumber_report/report.html",
                "json:target/json-Report/report.json"
        }

)
public class TestRunner {
}
