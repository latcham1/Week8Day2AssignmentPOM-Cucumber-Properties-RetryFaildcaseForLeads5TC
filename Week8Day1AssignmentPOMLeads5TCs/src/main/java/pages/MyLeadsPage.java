package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods
{ 
	public MyLeadsPage(RemoteWebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public CreateLeadPage createLeadFromLeftMenu() 
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	public FindLeadsPage findLeadsFromLeftMenu()
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	public MergeLeadsPage mergeLeadsFromLeftMenu()
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}
}