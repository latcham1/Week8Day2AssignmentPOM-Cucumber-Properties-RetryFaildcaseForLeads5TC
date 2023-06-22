package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods
{ 	
	public String leadID;
	public List<String> allhandles;
	public   FindLeadsPage(RemoteWebDriver driver) 
	{
		this.driver=driver;

	}
	public FindLeadsPage clickOnPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();   //clickOnPhoneTab
		return this;
	}
	public FindLeadsPage clickEmailTab()
	{
		driver.findElement(By.xpath("//span[text()='Email']")).click();   //clickOnPhoneTab
		return this;
	}
	public FindLeadsPage enterPhoneNumber(String enterPhoneNumber) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(enterPhoneNumber);
		return this;		
	}
	public FindLeadsPage enteEmail(String enteEmail) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(enteEmail);
		return this;		
	}
	public FindLeadsPage clickFindLeadsButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;		
	}
	public ViewLeadsPage clickonFirstLeadLink() throws InterruptedException {
		// TODO Auto-generated method stub

		//		WebElement firstLeadLink = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//		wait.until(ExpectedConditions.elementToBeClickable(firstLeadLink));
		Thread.sleep(2000);
		 this.leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
System.out.println("clickonFirstLeadLink"+this.leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage(driver);		

	}

	public FindLeadsPage enterFNameToSelectFirstLead(String enterFNameToSelectFirstLead) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(enterFNameToSelectFirstLead);
		return this;
	}
	public FindLeadsPage enterFNameToSelectSecondLead(String enterFNameToSelectSecondLead) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(enterFNameToSelectSecondLead);
		return this;
	}
	public FindLeadsPage selectfirstLeadFromResult() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		//		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		super.leadID = driver.findElement(By.xpath("//td/div/a[@class='linktext']")).getText();

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public FindLeadsPage enterLeadid() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(this.leadID);
		return this;
	}
	public MergeLeadsPage switchtoMergeWindow() {
		// TODO Auto-generated method stub
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPage(driver);
	}
	public void deleteLeadVerification() {
		// TODO Auto-generated method stub
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
	}

}

