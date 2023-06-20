package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public EditLeadPage updateCompanyName() {
		// TODO Auto-generated method stub
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("RaghavHari");
		return this;
	}
	
	public ViewLeadsPage clickonupdateButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
