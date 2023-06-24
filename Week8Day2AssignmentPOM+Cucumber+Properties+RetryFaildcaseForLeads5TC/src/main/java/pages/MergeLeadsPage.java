package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class MergeLeadsPage extends ProjectSpecificMethods {
	@And ("click FirstLead Lookup Image")
	public FindLeadsPage clickFirstLeadLookupImage() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadsPage();
	}
	@And ("click SecondLead Lookup Image")
	public FindLeadsPage clickSecondLeadLookupImage() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadsPage();
	}
	@And ("click On Merge Button")
	public MergeLeadsPage clickOnMergeButton() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(2000);	
		return this;
	}
	@And ("accept Alert")
	public ViewLeadsPage acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		return new ViewLeadsPage();
	}
}
