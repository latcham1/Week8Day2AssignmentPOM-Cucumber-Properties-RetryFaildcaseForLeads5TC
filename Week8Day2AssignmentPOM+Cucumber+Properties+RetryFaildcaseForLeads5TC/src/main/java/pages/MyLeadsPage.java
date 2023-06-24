package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class MyLeadsPage extends ProjectSpecificMethods
{ 

	@Given ("click create Lead From LeftMenu")
	public CreateLeadPage createLeadFromLeftMenu() 
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(prob.getProperty("MyLeadsPage_createLead_linkText"))).click();
		return new CreateLeadPage();
	}
	@Given ("click find Leads From LeftMenu")
	public FindLeadsPage findLeadsFromLeftMenu()
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(prob.getProperty("MyLeadsPage_findLead_linkText"))).click();
		return new FindLeadsPage();
	}
	@Given ("Click mergeLeads From LeftMenu")
	public MergeLeadsPage mergeLeadsFromLeftMenu()
	{
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(prob.getProperty("MyLeadsPage_mergeLead_linkText"))).click();
		return new MergeLeadsPage();
	}
}
