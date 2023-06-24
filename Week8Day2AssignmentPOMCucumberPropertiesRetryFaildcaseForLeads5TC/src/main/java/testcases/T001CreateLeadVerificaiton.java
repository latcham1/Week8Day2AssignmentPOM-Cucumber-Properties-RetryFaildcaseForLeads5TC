package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.MyLeadsPage;

public class T001CreateLeadVerificaiton extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";

	}
	@Test (dataProvider="sendData", retryAnalyzer = RetryFailedTests.class)
	public void runCreateLead(String cName, String fName, String lName)throws InterruptedException
	{
		MyLeadsPage cl = new MyLeadsPage();
		cl.createLeadFromLeftMenu()
		.enterCname(cName)
		.enterFNAME(fName)
		.enterlastName(lName)
		.clickSubmitButton()
		.verifyLeadscreation();
	}
}