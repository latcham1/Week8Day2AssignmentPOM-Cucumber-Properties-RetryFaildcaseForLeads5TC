package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	public DuplicateLeadPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	// TODO Auto-generated constructor stub
	
	public ViewLeadsPage clickOnCreateLeadButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadsPage(driver);
	}

	
}
