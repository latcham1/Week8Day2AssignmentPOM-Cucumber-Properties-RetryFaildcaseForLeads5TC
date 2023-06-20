package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods
{
	public MyHomePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public MyLeadsPage clickLeadsTab() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
		
	}
	

}
