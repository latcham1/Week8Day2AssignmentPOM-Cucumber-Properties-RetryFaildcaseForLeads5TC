package runner;

import base.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/main/java/features/T001createLead.feature","src/main/java/features/T002editLead.feature","src/main/java/features/T004duplicateLead.feature"},
                         glue="pages",
                         monochrome=true,
                         publish=true
                        // tags="@Smoke")  execute only smoke TC's
                         //tags="@Smoke or @Regression")  //execute either one of the scenaios
                         //tags="not @Smoke") exclude smoke
//                         tags="@Smoke and @Regression"
                         )
public class CucumberRunnerForFrench extends ProjectSpecificMethods{

}
