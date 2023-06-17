package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

@Test
public class Loginverificaiton extends ProjectSpecificMethods
{
	public void runLogin()
	{
    LoginPage ln = new LoginPage();
    ln.entername().enterpw().clickLogin();
    
	}

}