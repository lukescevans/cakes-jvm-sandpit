package step_defs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"step_defs"},
        format = {"pretty", "html:target/cucumber-html-report",
                "junit:target/cucumber-junit-report/report.xml",
                "json:target/cucumber-json-report/report.json"},
        tags = {"~@manual", "~@slow", "~@wip"}
)
public class RunCukesTest {
}