package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods 
{
	public ViewLeadsPage verifyLeadscreation() 
	{
		// TODO Auto-generated method stub

		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("RaghavHari")) 
		{
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");

		}
		return this;	
	}
}
