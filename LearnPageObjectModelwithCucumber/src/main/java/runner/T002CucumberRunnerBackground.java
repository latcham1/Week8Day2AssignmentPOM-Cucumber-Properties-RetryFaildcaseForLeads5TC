package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/T002LoginBackground.feature",
                         glue="steps",
                         monochrome=true,
                         publish=true
                        // tags="@Smoke")  execute only smoke TC's
                         //tags="@Smoke or @Regression")  //execute either one of the scenaios
                         //tags="not @Smoke") exclude smoke
//                         tags="@Smoke and @Regression"
                         )
public class T002CucumberRunnerBackground extends AbstractTestNGCucumberTests{

}
