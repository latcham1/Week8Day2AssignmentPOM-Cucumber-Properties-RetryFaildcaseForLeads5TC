package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class T003EditLeadVerificaiton extends ProjectSpecificMethods
{ 	
	@BeforeTest
	public void setValues()
	{
		excelFileName="CreateLead";
//		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	@Test (dataProvider="sendData")
	public void runEdidLead(String uName, String pWord, String cName, String fName, String lName) throws InterruptedException
			{
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage(driver);
		

		lp.entername(uName)
		.enterpw(pWord)
		.clickLogin()

		.clickCRMlink()
		.clickLeadsTab()
		.findLeadsFromLeftMenu()
		.clickOnPhoneTab()
		.enterPhoneNumber()
		.clickFindLeadsButton()
		.clickonFirstLeadLink()
		.clickonEditButton()
		.updateCompanyName()
		.clickonupdateButton()
		.verifyLeadscreation();
			}
}
