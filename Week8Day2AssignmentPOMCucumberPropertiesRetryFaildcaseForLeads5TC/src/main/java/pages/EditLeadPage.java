package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class EditLeadPage extends ProjectSpecificMethods {


	@And ("update CompanyName as (.*)$")
	public EditLeadPage updateCompanyName(String updateCompanyName) {
		// TODO Auto-generated method stub
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(updateCompanyName);
		return this;
	}
	@And ("Click on the update button")
	public ViewLeadsPage clickonupdateButton() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}
}
