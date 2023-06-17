package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods
{
	public LoginPage entername()
	{
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
		
	}
	public LoginPage enterpw()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
