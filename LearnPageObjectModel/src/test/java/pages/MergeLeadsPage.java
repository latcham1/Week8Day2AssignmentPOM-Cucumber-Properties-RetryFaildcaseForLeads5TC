package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MergeLeadsPage extends ProjectSpecificMethods {
	public MergeLeadsPage (ChromeDriver driver)
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
	public MergeLeadsPage clickOnMergeButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}
	public ViewLeadsPage acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		return new ViewLeadsPage(driver);
	}
}
