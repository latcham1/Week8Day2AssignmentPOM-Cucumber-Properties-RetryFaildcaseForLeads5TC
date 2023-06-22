package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

@Test
public class T001Loginverificaiton extends ProjectSpecificMethods
{
	public void runLogin()
	{
    LoginPage ln = new LoginPage(driver);
    System.out.println("runLogin driver"+driver);
    ln.entername("Demosalesmanager").enterpw("crmsfa").clickLogin();
    
	}

}