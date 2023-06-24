package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class CreateLeadPage extends ProjectSpecificMethods{

	@And ("enter companyname  as (.*)$")
	public CreateLeadPage enterCname(String cName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;

	}
	@And ("enter First Name as (.*)$")
	public CreateLeadPage enterFNAME(String fName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	@And ("enter last Name as (.*)$")
	public CreateLeadPage enterlastName(String lName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	@And ("click Submit Button")
	public ViewLeadsPage clickSubmitButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
		
	}
}
