package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PSM;

import io.cucumber.java.en.*;

public class LightningExperience extends PSM{
		public LightningExperience(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	@And ("clickAppLauncher")
	public LightningExperience clickAppLauncher() {
	// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
return this;
	}
@And ("SelectViewAll")
public HomeSalesforce selectViewAll() {
// TODO Auto-generated method stub
	driver.findElement(By.xpath("//button[text()='View All']")).click();
return new HomeSalesforce(driver);
	}
		

}
