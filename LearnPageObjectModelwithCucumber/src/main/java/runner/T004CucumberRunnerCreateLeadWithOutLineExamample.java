package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/T004CreateLeadwithOutlineExample.feature",
                         glue="steps",
                         monochrome=true,
                         publish=true)
public class T004CucumberRunnerCreateLeadWithOutLineExamample extends AbstractTestNGCucumberTests{

}
