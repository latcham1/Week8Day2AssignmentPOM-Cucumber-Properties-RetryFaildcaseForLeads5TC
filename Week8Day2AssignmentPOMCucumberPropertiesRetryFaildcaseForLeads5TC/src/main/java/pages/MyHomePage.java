package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods
{

	public MyLeadsPage clickLeadsTab() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(prob.getProperty("MyLeadsPage_leads_linkText"))).click();
		return new MyLeadsPage();
	}	
}
