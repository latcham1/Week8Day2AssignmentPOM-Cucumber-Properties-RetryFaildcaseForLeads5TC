package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.MyLeadsPage;

public class T003MergeLeadVerificaiton extends ProjectSpecificMethods
{ 	
	@BeforeTest
	public void setValues()
	{
		excelFileName="MergeLead";
		//		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	@Test (dataProvider="sendData")
	public void runEdidLead(String enterFNameToSelectFirstLead, String enterFNameToSelectSecondLead) throws InterruptedException
	{
		// TODO Auto-generated method stub
		MyLeadsPage cl = new MyLeadsPage();
		cl.mergeLeadsFromLeftMenu()
		.clickFirstLeadLookupImage()
		.enterFNameToSelectFirstLead(enterFNameToSelectFirstLead)
		.clickFindLeadsButton()
		.selectfirstLeadFromResult()
		.switchtoMergeWindow()
		.clickSecondLeadLookupImage()
		.enterFNameToSelectSecondLead(enterFNameToSelectSecondLead)
		.clickFindLeadsButton()
		.selectfirstLeadFromResult()
		.switchtoMergeWindow()
		.clickOnMergeButton()
		.acceptAlert()
		.verifyMergeLead();
	}
}
