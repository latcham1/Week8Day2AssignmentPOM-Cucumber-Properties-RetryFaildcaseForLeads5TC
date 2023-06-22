package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MergeLeadsPage extends ProjectSpecificMethods {
	public MergeLeadsPage (RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public FindLeadsPage clickFirstLeadLookupImage() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadsPage(driver);
	}
	public FindLeadsPage clickSecondLeadLookupImage() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadsPage(driver);
	}
	public MergeLeadsPage clickOnMergeButton() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(2000);	
		return this;
	}
	public ViewLeadsPage acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		return new ViewLeadsPage(driver);
	}
}
