package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class T004MergeLeadVerificaiton extends ProjectSpecificMethods
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
		LoginPage mc = new LoginPage(driver);
		

		mc.entername(uName)
		.enterpw(pWord)
		.clickLogin()

		.clickCRMlink()
		.clickLeadsTab()
		.mergeLeadsButtonFromLeftMenu()
		.clickFirstLeadLookupImage()
		.enterFNameToSelectFirstLead()
		.clickFindLeadsButton()
		.selectfirstLeadFromResult()
		.switchtoMergeWindow()
		.clickSecondLeadLookupImage()
		.enterFNameToSelectSecondLead()
		.clickFindLeadsButton()
		.selectfirstLeadFromResult()
		.switchtoMergeWindow()
		.clickOnMergeButton()
		.acceptAlert()
		.verifyMergeLead();
			}
}
