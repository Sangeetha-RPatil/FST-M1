package CucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\IBMADMIN\\IdeaProjects\\Cucumber\\src\\test\\java\\Features",
        glue = {"stepDefinitions"},
        tags = "@SmokeTest or @activity1 or @activity2 or @activity3 or @activity4 or @activity5",
        plugin = {"html: test-reports"},
        monochrome = true
)

public class ActivitiesRunner {
    //empty
}