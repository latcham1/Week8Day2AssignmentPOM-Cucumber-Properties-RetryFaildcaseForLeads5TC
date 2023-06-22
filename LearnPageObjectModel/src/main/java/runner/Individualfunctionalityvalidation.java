package runner;

import base.PSM;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/features",
                         glue="pages",
                         monochrome=true,
                         publish=true)

public class Individualfunctionalityvalidation extends PSM{

}
