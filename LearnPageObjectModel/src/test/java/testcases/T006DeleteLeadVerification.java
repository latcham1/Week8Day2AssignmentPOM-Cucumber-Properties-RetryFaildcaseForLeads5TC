package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class T006DeleteLeadVerification extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";
		

	}
	@Test (dataProvider="sendData")
	public void runDeleteLead(String uName, String pWord, String cName, String fName, String lName)throws InterruptedException
	{
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
		.clickonDeleteButton();

	}
}