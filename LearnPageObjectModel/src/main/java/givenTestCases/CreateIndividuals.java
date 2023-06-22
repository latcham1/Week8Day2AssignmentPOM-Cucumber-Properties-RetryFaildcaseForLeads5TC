package givenTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateIndividuals {
	/*
	 * "Test Steps:
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Individuals from App Launcher
4. Click on the Dropdown icon in the Individuals tab
5. Click on New Individual
6. Enter the Last Name as 'Kumar'
7.Click save and verify Individuals Name"

	 */
	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("latc@ham.com");
		driver.findElement(By.id("password")).sendKeys("Harihara*1");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.getTitle());  //Lightning Experience
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		System.out.println(driver.getTitle());  //Lightning Experience
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		System.out.println(driver.getTitle()); //Home | Salesforce
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		System.out.println(driver.getTitle()); //Home | Salesforce
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", clk);
		System.out.println(driver.getTitle());   //Recently Viewed | Individuals | Salesforce
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys("Kumars");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		System.out.println(driver.getTitle()); //New Individual | Salesforce
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	
		//verify Individuals Name
		if (message.contains("Kumars"))
		{
			System.out.println("Individual Name verified successfully");
		}
		else
		{
			System.out.println("not able to verify individual Name ");
		}
	}
}