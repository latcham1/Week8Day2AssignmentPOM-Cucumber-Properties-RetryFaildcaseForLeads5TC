package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods
{
	public MyHomePage(RemoteWebDriver driver) 
	{
	// TODO Auto-generated constructor stub
	this.driver=driver;
	}
	public MyLeadsPage clickLeadsTab() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
		
	}
	

}
