package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods
{ public MyLeadsPage(ChromeDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
	public CreateLeadPage createLeadFromLeftMenu() 
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
}
