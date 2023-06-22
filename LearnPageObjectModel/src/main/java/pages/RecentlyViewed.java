package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.PSM;
import io.cucumber.java.en.And;

public class RecentlyViewed extends PSM{
	public RecentlyViewed(RemoteWebDriver driver) {
		
		System.out.println("driver"+driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	@And ("select New Individual from Recently Viewed DropdownMenu")
	public NewIndividual clickNewIndividualfromRecentlyViewedDropdownMenu() {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
	WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
	driver.executeScript("arguments[0].click();", clk);
	return new NewIndividual(driver);
}
		
	
}
