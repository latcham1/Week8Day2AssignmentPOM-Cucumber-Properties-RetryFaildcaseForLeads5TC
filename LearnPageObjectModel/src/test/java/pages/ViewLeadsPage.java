package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods
{
	private ViewLeadsPage MyLeadsPage;
	public ViewLeadsPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public ViewLeadsPage verifyLeadscreation() 
	{
		// TODO Auto-generated method stub

//		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (driver.getTitle().contains("View Lead"))
		{
			System.out.println("Lead created successfully");
			}
		else {
			System.out.println("Lead is not created");

		}
		return this;	
	}
	public EditLeadPage clickonEditButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	public DuplicateLeadPage clickonDuplicateLeadeButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		return new DuplicateLeadPage(driver);
	}
	public MyLeadsPage clickonDeleteButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	}
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
