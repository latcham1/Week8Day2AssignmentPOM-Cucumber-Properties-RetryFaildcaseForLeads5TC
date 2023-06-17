package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods
{
	public CreateLeadPage clickLeadsLink() 
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Leads")).click();
		return new CreateLeadPage();
	}
}
