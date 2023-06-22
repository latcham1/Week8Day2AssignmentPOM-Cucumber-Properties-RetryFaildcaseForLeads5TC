package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.MyLeadsPage;

public class T006DeleteLeadVerification extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName="DeleteLead";

	}
	@Test (dataProvider="sendData")
	public void runDeleteLead(String enterPhoneNumber)throws InterruptedException
	{
		MyLeadsPage cl = new MyLeadsPage(driver);
		cl.findLeadsFromLeftMenu()
		.clickOnPhoneTab()
		.enterPhoneNumber(enterPhoneNumber)
		.clickFindLeadsButton()
		.clickonFirstLeadLink()
		.clickonDeleteButton();
		//		.findLeadsFromLeftMenu()
		//		.enterLeadid()
		//		.clickFindLeadsButton()
		//		.deleteLeadVerification();
	}
}