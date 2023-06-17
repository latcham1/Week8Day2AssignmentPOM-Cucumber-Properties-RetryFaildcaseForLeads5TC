package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods 
{
	public static ChromeDriver driver;
	@BeforeMethod
	public void precondition()
	{
		//	options = new ChromeOptions();
		//	options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	}
	@AfterMethod
	public void precodition() throws InterruptedException
	{
//		driver.quit();
	}
}

