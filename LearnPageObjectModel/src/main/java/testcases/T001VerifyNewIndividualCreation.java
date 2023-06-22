package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.PSM;
import pages.LightningExperience;


public class T001VerifyNewIndividualCreation extends PSM
{
	@BeforeTest
	public void setValues() {
		excelFileName="CreateIndividual";
	}
	@Test (dataProvider="sendData")
	public void runNewIndividualCreation(String lName)
	{
    LightningExperience ni = new LightningExperience(driver);
    ni.clickAppLauncher()
    .selectViewAll()
    .scrollVerticalbartillPartyConsent()
    .selectindividualLink()
    .clickNewIndividualfromRecentlyViewedDropdownMenu()
    .typeLastName(lName)
    .clickSaveButton()
    .verifyNewIndividualCreation();
   
    
}

}