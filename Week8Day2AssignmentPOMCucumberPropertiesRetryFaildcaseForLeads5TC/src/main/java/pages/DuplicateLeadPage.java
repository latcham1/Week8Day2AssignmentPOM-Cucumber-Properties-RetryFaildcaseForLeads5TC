package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class DuplicateLeadPage extends ProjectSpecificMethods {

	// TODO Auto-generated constructor stub
	@And ("click On CreateLead Button")
	public ViewLeadsPage clickOnCreateLeadButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadsPage();
	}

	
}
