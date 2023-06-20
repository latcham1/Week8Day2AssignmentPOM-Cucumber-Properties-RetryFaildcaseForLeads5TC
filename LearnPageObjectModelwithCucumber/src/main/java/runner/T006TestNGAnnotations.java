package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.Base;
@CucumberOptions(features={"src/test/java/features/T003LoginParameterization.feature",
//		"src/test/java/features/T001Login.feature"
		"src/test/java/features/T004CreateLeadwithOutlineExample.feature"},
                         glue="steps",
                         monochrome=true,
                         publish=true
                        // tags="@Smoke")  execute only smoke TC's
                         //tags="@Smoke or @Regression")  //execute either one of the scenaios
                         //tags="not @Smoke") exclude smoke
//                         tags="@Smoke and @Regression"
                         )
public class T006TestNGAnnotations extends Base{

}
