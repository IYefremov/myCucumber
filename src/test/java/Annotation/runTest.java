package Annotation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featureTests/",
        monochrome = true,
        tags = {"@TestScenarioV1"},
        glue = "Annotation"
)
public class runTest {
}

