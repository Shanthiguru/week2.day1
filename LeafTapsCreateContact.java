package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsCreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Shanthi");
		driver.findElement(By.id("lastNameField")).sendKeys("Gurudass");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Print
		
		WebElement name = driver.findElement(By.id("viewContact_firstName_sp"));
		System.out.println("FirstName is : "+ name.getText());
		String title = driver.getTitle();
		System.out.println("Browser Title: "+title);
		driver.close();

	}

}
