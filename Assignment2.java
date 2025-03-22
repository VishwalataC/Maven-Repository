package selenium.assignments;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
	// 1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();   
		
	// 2. Maximize the browser window
		driver.manage().window().maximize();
		   
	// 3. Delete all the cookies
		driver.manage().deleteAllCookies();
		   
	// 4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
		 
	// 5. Wait for Page-load
		Thread.sleep(500);
		   
	// 6. Enter First name and Last name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		firstName.sendKeys("Vishu");
		lastName.sendKeys("More");
			 
	// 7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("abc@gmail.com");
			 	
    // 8. Select Gender (Female)
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		
		Actions action = new Actions(driver);
//		action.click(gender).perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", gender);
		js.executeScript("arguments[0].click()", gender);

			 	
	// 9. Enter mobile number 
		WebElement number = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		number.sendKeys("1234567890");
			 	
	// 10.Select DOB (1-Feb-1991)
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.clear();
//		Thread.sleep(500);
//		action.sendKeys(dob, "01 Feb 1991" +key.ENTER).perform();
//		actx\5rfazion.click(dob).perform();
			 	
	// 11.Search and Select Computer Science
		WebElement subject = driver.findElement(By.xpath("//div[contains(@class,'value')]"));
		action.sendKeys(subject, "Computer Science").perform();
		 
	// 12.Select Hobbies as Sports and Reading
		WebElement sport = driver.findElement(By.xpath("//input[@value='1']"));
		WebElement reading = driver.findElement(By.xpath("//input[@value='2']"));
		
		action.click(sport).perform();
		action.click(reading).perform();
			 	
	// 13.Upload photo
		WebElement photo = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
			 	
	// 14. Wait till window open to upload the file
			 	
	// 15. Upload file
			 	
	// 16. Wait till file upload 
			 	
	// 17.Submit Details
		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));
//		action.click(button).perform();
		
		js.executeScript("arguments[0].scrollIntoView()", button);
		js.executeScript("arguments[0].click()", button);
		
			 	
	// 18. Close browser window
//		driver.close();
		
	}

}
