package Annotation;

//import org.junit.runner.RunWith;
//import cucumber.junit.Cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
// features = {"G:/QAAutoCourses/CucumberProject/myCucumber/src/test/java/Annotation/annotation.feature"}
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featureTests/",
        monochrome = true,
        tags = "@TestScenarioV1",
        glue = "src.test.java.annotation"
)
public class runTest {
}

