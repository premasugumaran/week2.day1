package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContactsTc2 {

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
		//open Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
				
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");

		driver.findElement(By.linkText("Find Contacts")).click();
		//driver.close();

		
	}

}
