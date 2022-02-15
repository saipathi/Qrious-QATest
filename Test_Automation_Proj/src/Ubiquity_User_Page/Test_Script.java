package Ubiquity_User_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Script {

	public static void main(String[] args) throws InterruptedException {

		// Set System Property for Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saiye\\Downloads\\chromedriver.exe");

		// Initiate Chrome Browser class
		WebDriver driver = new ChromeDriver();

		// Navigate to login page
		driver.get("http://13.75.189.136:8081/");

		// Maximize Window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Fill the login form
		driver.findElement(By.id("username")).sendKeys("ubiquity");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("P@ss123#UbiQuity");
		Thread.sleep(2000);

		// Submit form
		driver.findElement(By.xpath("//button[contains(@class, 'login-button')]")).click();

		Thread.sleep(3000);


		//Check if user is directed to the correct landing page
		String expectedPageTitle = "Ubiquity QA";
		String actualPageTitle = driver.getTitle();
		if(expectedPageTitle.equals(actualPageTitle)) {
			System.out.println("Pass: This the correct landing page.");
		}
		else {
			System.out.println("Fail: This is incorrect landing page. End testing. ");
			driver.quit();
		}

		//Click on EditProfile Button
		driver.findElement(By.xpath("//a[@href='/editprofile' and @class='button']")).click();


		// Check if user is directed to the  correct Edit Profile Page
		String expectedEditPageTitle = "Ubiquity Engage";
		String actualEditPageTitle = driver.getTitle();
		if(expectedEditPageTitle.equals(actualEditPageTitle)) {
			System.out.println("Pass: User is able access edit profile page successfully.");
		}
		else {
			System.out.println("Fail: User is not able access edit profile page. End testing. ");
			driver.quit();
		}

		// Updating Email address, Date of Birth and Password fields
		String expectedEmail = "sai@qrious.co.nz";
		String expectedDOB = "09/09/1989";
		String expectedPassword = "test@1234";

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class, 'email') and @type = 'text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class, 'email') and @type = 'text']")).sendKeys(expectedEmail);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@class, 'date') and @type = 'text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class, 'date') and @type = 'text']")).sendKeys(expectedDOB);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class, 'singleline') and @type ='Password' ])[1]")).sendKeys(expectedPassword);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class, 'singleline') and @type ='Password' ])[2]")).sendKeys(expectedPassword);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(@class, 'submit-button')]")).click();


		// Checking the if the new values are updated in the form
		String actualEmail = driver.findElement(By.xpath("//input[contains(@class, 'email') and @type = 'text']")).getAttribute("value");
		String actualDOB = driver.findElement(By.xpath("//input[contains(@class, 'date') and @type = 'text']")).getAttribute("value");
		String actualPassword = driver.findElement(By.xpath("(//input[contains(@class, 'singleline') and @type ='Password' ])[1]")).getAttribute("value");

		if(expectedEmail.equals(actualEmail)) {
			System.out.println("Pass: New email address successfully updated.");
		}
		else {
			System.out.println("Fail: New email address not updated.");
		}

		if(expectedDOB.equals(actualDOB)) {
			System.out.println("Pass: New Date Of Birth successfully updated.");
		}
		else {
			System.out.println("Fail: New Date Of Birth not updated.");
		}            

		if(expectedPassword.equals(actualPassword)) {
			System.out.println("Pass: New password successfully updated.");
		}
		else {
			System.out.println("Fail: New password not updated.");
		}
	}
}