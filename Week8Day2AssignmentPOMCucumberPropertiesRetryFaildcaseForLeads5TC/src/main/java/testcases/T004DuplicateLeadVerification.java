package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.DuplicateLeadPage;
import pages.LoginPage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;

public class T004DuplicateLeadVerification extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName="DuplicateLead";

	}
	@Test (dataProvider="sendData")
	public void runDuplicateLead(String enteEmail)throws InterruptedException
	{
		MyLeadsPage cl = new MyLeadsPage();
		cl.findLeadsFromLeftMenu()
		.clickEmailTab()
		.enteEmail(enteEmail)
		.clickFindLeadsButton()
		.clickonFirstLeadLink()
		.clickonDuplicateLeadeButton()
		.clickOnCreateLeadButton()
		.verifyLeadscreation();
	}
}