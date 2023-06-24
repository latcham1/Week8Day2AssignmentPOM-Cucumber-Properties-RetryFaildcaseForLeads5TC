package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods 
{

	public MyHomePage clickCRMlink()
	{
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}
