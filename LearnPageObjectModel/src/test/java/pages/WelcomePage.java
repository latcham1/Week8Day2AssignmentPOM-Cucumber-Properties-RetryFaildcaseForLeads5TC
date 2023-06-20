package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public WelcomePage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyHomePage clickCRMlink()
	{
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
