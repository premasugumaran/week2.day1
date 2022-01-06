package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTC3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Sysytem.setProperty("webdriver.chrome.driver","c:\\users\\chromedriver.exe");")
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the browser
		driver.manage().window().maximize();
		// implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
		// click on leads

		driver.findElement(By.linkText("Leads")).click();
		// click on create leads
		driver.findElement(By.linkText("Create Lead")).click();
		// enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hcl technologies");
		// enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("prema");
		// enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sugumaran");
		// select source
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Cold Call");
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option = new Select(marketing);
		option.selectByVisibleText("Affiliate Sites");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("siva");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ram");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MS");
		
		//driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("23/12/1989");
				
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("621601");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99650406");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("21");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Nirmalkumar");
				
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prema@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Nirmalkumar");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.url.com");
		
		
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("priya");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vasanthi");
				
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("69b");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("TV NAGAR");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("lalgudi");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("621601");
				
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("2145");
		
		//driver.findElement(By.id("generalStateProvinceGeoId")).sendKeys("Nirmalkumar");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select code = new Select(state);
		code.selectByVisibleText("Alabama");
		
		
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countrycode = new Select(country);
		countrycode.selectByVisibleText("Afghanistan");
		
			
		
		// click on create lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
	}

	}
