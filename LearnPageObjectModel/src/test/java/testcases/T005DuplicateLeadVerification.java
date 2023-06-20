package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.DuplicateLeadPage;
import pages.LoginPage;
import pages.ViewLeadsPage;

public class T005DuplicateLeadVerification extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";

	}
	@Test (dataProvider="sendData")
	public void runDuplicateLead(String uName, String pWord, String cName, String fName, String lName)throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		System.out.println("runCreateLead driver"+driver);

		lp.entername(uName)
		.enterpw(pWord)
		.clickLogin().

		clickCRMlink()
		.clickLeadsTab()
		.findLeadsFromLeftMenu()
		.clickEmailTab()
		.enteEmail()
		.clickFindLeadsButton()
		.clickonFirstLeadLink()
		.clickonDuplicateLeadeButton()
		.clickOnCreateLeadButton()
		.verifyLeadscreation();
	}
}