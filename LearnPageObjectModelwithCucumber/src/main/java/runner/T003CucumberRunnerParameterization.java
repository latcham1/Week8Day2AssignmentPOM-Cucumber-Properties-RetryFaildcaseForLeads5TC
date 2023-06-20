package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/T002Login2Parameterization.feature",
                         glue="steps",
                         monochrome=true,
                         publish=true)
public class T003CucumberRunnerParameterization extends AbstractTestNGCucumberTests{

}
