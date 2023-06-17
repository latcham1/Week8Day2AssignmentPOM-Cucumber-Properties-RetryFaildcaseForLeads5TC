package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
@Test
public class CreateLeadVerificaiton extends ProjectSpecificMethods {
	public void runCreateLead()
	{
		LoginPage lp = new LoginPage();
		lp.entername().enterpw().clickLogin();    
		


	}
}