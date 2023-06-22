package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PSM;
import io.cucumber.java.en.And;

public class HomeSalesforce extends PSM{
	public HomeSalesforce(RemoteWebDriver driver) {

	
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	@And ("Scroll to Party Consent")
	public HomeSalesforce scrollVerticalbartillPartyConsent() {
		// TODO Auto-generated method stub
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));	
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		return this;
	}
	@And ("select individual link")
	public RecentlyViewed selectindividualLink() {
		// TODO Auto-generated method stub
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		return new RecentlyViewed(driver);
	}


}
