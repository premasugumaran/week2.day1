package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactsTc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Sysytem.setProperty("webdriver.chrome.driver","c:\\users\\chromedriver.exe");")
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the browser
		driver.manage().window().maximize();

		// get title
		String title = driver.getTitle();
		System.out.println(title);

		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		// Enter Password

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// click CRM/SFA

		driver.findElement(By.linkText("CRM/SFA")).click();
		 
		//open contacts
		
		driver.findElement(By.linkText("Contacts")).click();
	    //open create contacts
		driver.findElement(By.linkText("Create Contact")).click();
		
		//enter first name
		
		WebElement fname = driver.findElement(By.id("firstNameField"));
		fname.sendKeys("prema");
		System.out.println(fname);
		
		driver.findElement(By.id("lastNameField")).sendKeys("sugumaran");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		String browsertitle = driver.getTitle();
		System.out.println(browsertitle);
		


	
	
	}

}
