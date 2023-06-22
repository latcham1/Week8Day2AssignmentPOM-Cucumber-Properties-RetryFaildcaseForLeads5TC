package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utility.ReadExcel;




public class PSM extends AbstractTestNGCucumberTests
{
	public  RemoteWebDriver driver;

	public String excelFileName;
//	public String leadID;

@Parameters({"Browser", "url","username","password"})
@BeforeMethod
	public void precondition(String brow, String appurl,String uName,String pWord)
	{
	switch (brow) {
	  case "Chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			 driver = new ChromeDriver(option);
	    break;
	  case "Edge":
		  EdgeOptions Edgeoption = new EdgeOptions();
		  Edgeoption.addArguments("--disable-notifications");
			 driver = new EdgeDriver(Edgeoption);
	    break;
	  default:
		  ChromeOptions defaultoption = new ChromeOptions();
		  defaultoption.addArguments("--disable-notifications");
			 driver = new ChromeDriver(defaultoption);
	}


	driver.get(appurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pWord);
	driver.findElement(By.id("Login")).click();
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

