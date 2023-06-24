package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewLeadsPage extends ProjectSpecificMethods
{
	@Then ("verify Leads creation")
	@Then ("verify Leads update")
	public ViewLeadsPage verifyLeadscreation() throws InterruptedException 
	{
		if (driver.getTitle().contains("View Lead"))
		{
			System.out.println("Lead created/updated successfully");
		}
		else 
		{
			System.out.println("Lead is not created");

		}
		return this;	
	}
	@And ("click on Edit Button")
	public EditLeadPage clickonEditButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(prob.getProperty("EditLeadPage_clickonEditButton"))).click();
		return new EditLeadPage();
	}
	@And ("click on DuplicateLeade Button")
	public DuplicateLeadPage clickonDuplicateLeadeButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(prob.getProperty("DuplicateLeadPage_clickonDuplicateLeadeButton"))).click();
		return new DuplicateLeadPage();
	}
	@And ("click on Delete Button")
	public MyLeadsPage clickonDeleteButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(prob.getProperty("MyLeadsPage_clickonDeleteButton"))).click();
		return new MyLeadsPage();
	}			
	@Then ("verify Merge Lead")
	public ViewLeadsPage verifyMergeLead() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("View Lead"))
		{
			System.out.println("Lead Merged successfully");
		}
		else
		{
			System.out.println("not able to merge lead");
		}
		return this;	
	}
}
