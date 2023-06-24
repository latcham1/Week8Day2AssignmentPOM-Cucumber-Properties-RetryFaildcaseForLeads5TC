package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods

{
	public LoginPage (RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public LoginPage entername(String uName)
	{
		
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
		
	}
	public LoginPage enterpw(String pWord)
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
