package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public CreateLeadPage enterCname(String cName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;

	}

	public CreateLeadPage enterFNAME(String fName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	public CreateLeadPage enterlastName(String lName) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	public ViewLeadsPage clickSubmitButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
		
	}
}
