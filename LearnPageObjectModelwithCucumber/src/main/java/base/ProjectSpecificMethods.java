package base;

import java.io.IOException;
import java.time.Duration;
import utils.ReadExcel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;




public class ProjectSpecificMethods 
{
	public  ChromeDriver driver;
	public String excelFileName;

@BeforeMethod
	public void precondition()
	{
		//	options = new ChromeOptions();
		//	options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver();
		System.out.println("precondition driver"+driver);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	}
	@AfterMethod
	public void postcodition() throws InterruptedException
	{
		driver.quit();
	}
	@DataProvider (indices= 0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(excelFileName);
	}
}

