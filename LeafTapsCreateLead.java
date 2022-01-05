package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsCreateLead {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Create Lead Page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gurudass");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Guru");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("5/1/22");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ComputerScience");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Shan123");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TicSymb");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Learning");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learn Selenium");
		
		WebElement w1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(w1);
		dropdown.selectByIndex(1);
		
		WebElement w2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown1 = new Select(w2);
		dropdown1.selectByValue("CATRQ_CAMPAIGNS");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MRS");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Shanthi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MRS");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("8000000");
		
		WebElement w3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown2 = new Select(w3);
		dropdown2.selectByVisibleText("INR - Indian Rupee");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50000");
		WebElement w4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown3 = new Select(w4);
		dropdown3.selectByVisibleText("Computer Software");
		
		WebElement w5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown4 = new Select(w5);
		dropdown4.selectByVisibleText("Sole Proprietorship");
		
		//Contact Information
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("622001");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987654321");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("shan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanthi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("xyz.com");
		
		//Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Shanthi");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Shan");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chandra prabu flat");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sembakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		WebElement w6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown5= new Select(w6);
		dropdown5.selectByValue("IN");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600073");
		
		driver.findElement(By.className("smallSubmit")).click();
		WebElement title = driver.findElement(By.id("sectionHeaderTitle_leads"));
		title.getText();
		System.out.println(title.getText());
		driver.close();		
		

	}

}
