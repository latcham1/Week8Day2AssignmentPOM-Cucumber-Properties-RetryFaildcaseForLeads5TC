package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public MyHomePage clickCRMlink()
	{
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}
