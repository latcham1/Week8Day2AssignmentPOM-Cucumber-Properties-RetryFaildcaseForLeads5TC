package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class T002CreateLeadVerificaiton extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";

	}
	@Test (dataProvider="sendData")
	public void runCreateLead(String uName, String pWord, String cName, String fName, String lName)throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		System.out.println("runCreateLead driver"+driver);

		lp.entername(uName)
		.enterpw(pWord)
		.clickLogin().

		clickCRMlink()
		.clickLeadsTab()
		.createLeadFromLeftMenu()
		.enterCname(cName)
		.enterFNAME(fName)
		.enterlastName(lName)
		.clickSubmitButton()
		.verifyLeadscreation();
	}
}