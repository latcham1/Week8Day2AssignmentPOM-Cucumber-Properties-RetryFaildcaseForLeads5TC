package runner;

import base.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/features/",
                         glue="pages",
                         monochrome=true,
                         publish=true
                        // tags="@Smoke")  execute only smoke TC's
                         //tags="@Smoke or @Regression")  //execute either one of the scenaios
                         //tags="not @Smoke") exclude smoke
//                         tags="@Smoke and @Regression"
                         )
public class CucumberRunner extends ProjectSpecificMethods{

}
