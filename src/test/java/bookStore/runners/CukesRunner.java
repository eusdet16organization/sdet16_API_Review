package bookStore.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="bookStore/step_defs",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {


}
