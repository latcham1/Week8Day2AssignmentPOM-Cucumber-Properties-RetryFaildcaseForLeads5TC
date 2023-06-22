package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public EditLeadPage updateCompanyName(String updateCompanyName) {
		// TODO Auto-generated method stub
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(updateCompanyName);
		return this;
	}
	
	public ViewLeadsPage clickonupdateButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
