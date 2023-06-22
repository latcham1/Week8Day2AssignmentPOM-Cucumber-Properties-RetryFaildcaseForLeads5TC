package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.MyLeadsPage;

public class T003EditLeadVerificaiton extends ProjectSpecificMethods
{ 	
	@BeforeTest
	public void setValues()
	{
		excelFileName="EditLead";
//		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	@Test (dataProvider="sendData")
	public void runEdidLead(String updateCompanyName, String enterPhoneNumber) throws InterruptedException
			{
		// TODO Auto-generated method stub
		MyLeadsPage cl = new MyLeadsPage(driver);
		cl.findLeadsFromLeftMenu()
		.clickOnPhoneTab()
		.enterPhoneNumber(enterPhoneNumber)
		.clickFindLeadsButton()
		.clickonFirstLeadLink()
		.clickonEditButton()
		.updateCompanyName(updateCompanyName)
		.clickonupdateButton()
		.verifyLeadscreation();
			}
}
