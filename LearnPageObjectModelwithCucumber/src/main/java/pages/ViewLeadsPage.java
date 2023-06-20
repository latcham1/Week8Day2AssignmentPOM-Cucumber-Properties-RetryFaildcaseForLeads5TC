package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods 
{
	public ViewLeadsPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
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
