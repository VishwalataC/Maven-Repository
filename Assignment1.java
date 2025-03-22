package selenium.assignments;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		
		// 1. Launch browser window(Chrome)  
		WebDriver driver = new ChromeDriver();
				
		// 2. Maximize the browser window        
		driver.manage().window().maximize();
		
		// 3. Delete all the cookies 
		driver.manage().deleteAllCookies();
		
		// 4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm) 
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		// 5. Verify application title (ParaBank | Welcome | Online Banking)
		String actualTitle = driver.getTitle();
		String expTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle, expTitle);
		
		// 6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@title='ParaBank']"));
		Assert.assertTrue(logo.isDisplayed());
		
		// 7. Verify application caption (Experience the difference)
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption = caption.getText();
		String expectedCaption = "Experience the difference";
		Assert.assertEquals(actualCaption, expectedCaption);
		
		// 8. Enter Invalid credentials in Username and Password textboxes
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		userName.clear();
		passWord.clear();
		userName.sendKeys("vishu");
		passWord.sendKeys("12345");
		
		// 9. Verify button label (LOG IN) and Click on Login Button
		WebElement button = driver.findElement(By.xpath("//input[@value='Log In']"));
		String actualLabel = button.getAttribute("Value");
		String expextedLable = "LOG IN";
		Assert.assertEquals(actualLabel, actualLabel);
		button.click();
		
		// 10. Verify error message is coming
		
		// 11. Click on Admin page link
		WebElement adminPage = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPage.click();
		
 // 12. Wait for admin page
		
 // 13. Select Data access mode as ' SOAP'
		WebElement mode = driver.findElement(By.xpath("//input[@value='soap']"));
		mode.click();
		
 // 14. Scroll-down till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		
		Actions action = new Actions(driver);
		
		//scroll-down mouse pointer towards loan-provider
		action.moveToElement(loanProvider).perform();
		
 // 15. Select Loan provider as 'Web Service'
		
		WebElement loanProvider1 = driver.findElement(By.xpath("//option[text()='Web Service']"));
		
		//create object of select class
		Select elements = new Select(loanProvider1);
		elements.selectByVisibleText("Web Service");	
		
		// 16. Click on Submit button
		WebElement button1 = driver.findElement(By.xpath("//input[@value='Submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollToElement()", button1);
		js.executeScript("argument[0].click()",button1);
		
		// 17. wait for Successful submission message
		
		
		// 18. Click on Services Link
//		WebElement service = driver.findElement(By.xpath("//ul[@class='leftmenu']/child::li[3]"));
//		service.click();
//		
//		// 19. Wait for Services page
//		
//		// 20. Scroll-down till Bookstore services
//		WebElement bookStore = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
//
//		js.executeScript("argument[0].scrollToElement()", bookStore);
//		js.executeScript("argument[0].click()",bookStore);
//		
		
		// 21. Get total rows, columns in the bookstore service table
		// 22. Get Column headers of book store services table
		// 23. Get all the data from book store service table
		// 24. Close browser window
	}

}
