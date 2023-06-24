package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class FindLeadsPage extends ProjectSpecificMethods
{ 	
	public String leadID;
	public List<String> allhandles;
	@And ("click On PhoneTab")
	public FindLeadsPage clickOnPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();   //clickOnPhoneTab
		return this;
	}
	@And ("click EmailTab")
	public FindLeadsPage clickEmailTab()
	{
		driver.findElement(By.xpath("//span[text()='Email']")).click();   //clickOnPhoneTab
		return this;
	}
	@And ("enter PhoneNumber as (.*)$")
	public FindLeadsPage enterPhoneNumber(String enterPhoneNumber) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(enterPhoneNumber);
		return this;		
	}
	@And ("enter Email (.*)$")
	public FindLeadsPage enteEmail(String enteEmail) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(enteEmail);
		return this;		
	}
	@And ("click FindLeads Button")
	public FindLeadsPage clickFindLeadsButton() {

		driver.findElement(By.xpath("//button[text()='"+(prob.getProperty("FindLeadsPage_clickFindLeadsButton"))+"']")).click();
		return this;		
	}
	@And ("click on First Lead Link")
	public ViewLeadsPage clickonFirstLeadLink() throws InterruptedException {
		// TODO Auto-generated method stub

		//		WebElement firstLeadLink = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//		wait.until(ExpectedConditions.elementToBeClickable(firstLeadLink));
		Thread.sleep(2000);
		this.leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("clickonFirstLeadLink"+this.leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage();		

	}
	@And ("enter FName To Select FirstLead (.*)$")
	public FindLeadsPage enterFNameToSelectFirstLead(String enterFNameToSelectFirstLead) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(enterFNameToSelectFirstLead);
		return this;
	}
	@And ("enter FName To Select SecondLead(.*)$")
	public FindLeadsPage enterFNameToSelectSecondLead(String enterFNameToSelectSecondLead) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(enterFNameToSelectSecondLead);
		return this;
	}
	@And ("select firstLead From Result")
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
	@And ("switch to Merge Window")
	public MergeLeadsPage switchtoMergeWindow() {
		// TODO Auto-generated method stub
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPage();
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

