package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PSM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NewIndividual extends PSM{
	public NewIndividual(RemoteWebDriver driver) {

		System.out.println("driver"+driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	@And ("type (.*)$")
	public NewIndividual typeLastName(String lname) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lname);
		return this;
	}
	@And ("click SaveButton")
	public NewIndividual clickSaveButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return this;
	}
	@Then ("verify New Individual Creation")
	public NewIndividual verifyNewIndividualCreation() {
		// TODO Auto-generated method stub
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		if (message.contains("Kumars"))
		{
			System.out.println("Individual Name verified successfully");
		}
		else
		{
			System.out.println("not able to verify individual Name ");
		}
		return this;
	}



}
