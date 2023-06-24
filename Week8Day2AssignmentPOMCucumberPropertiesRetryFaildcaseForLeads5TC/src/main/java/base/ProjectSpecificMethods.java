package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;
public class ProjectSpecificMethods extends AbstractTestNGCucumberTests
{
	public static RemoteWebDriver driver;
	public String excelFileName;
	public static Properties prob;
	public String leadID;

	@Parameters({"Browser", "url","language"})
	@BeforeMethod
	public void precondition(String brow, String appurl,String language) throws IOException
	{			


		switch (brow) 
		{
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
		case "Firefox":
			FirefoxOptions Firefoxoption = new FirefoxOptions();
			Firefoxoption.addArguments("--disable-notifications");
			driver = new FirefoxDriver(Firefoxoption);
			break;
		case "Safari":
			driver = new SafariDriver();
			break;	
		default:
			ChromeOptions defaultoption = new ChromeOptions();
			defaultoption.addArguments("--disable-notifications");
			driver = new ChromeDriver(defaultoption);
		}	
		switch (language) 
		{
		case "en":
			FileInputStream fisEn = new FileInputStream("src/main/resources/config.en.properties");
			prob= new Properties();
			prob.load(fisEn);
			break;
		case "fr":
			FileInputStream fisFr = new FileInputStream("src/main/resources/config.fr.properties");
			prob= new Properties();
			prob.load(fisFr);
			break;	
		default:
			FileInputStream fisDefault = new FileInputStream("src/main/resources/config.en.properties");
			prob= new Properties();
			prob.load(fisDefault);
		}	

		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(prob.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prob.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText(prob.getProperty("ProjectSpecificMethods_leads_linkText"))).click();
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

