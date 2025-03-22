package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.postgresql.Driver;

public class Assignment4_Frames {

	public static void main(String[] args) {
		
       //1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
	     
	   //2.Maximize the browser window
		driver.manage().window().maximize();     
		
	   //3.Launch the application
		driver.get("https://demoqa.com/frames");
		     
	   //4.Locate elements
		WebElement windowElement = driver.findElement(By.xpath("//h1[@class='text-center']"));
		          
	   //5.Print frame element text
		driver.switchTo().frame("frame1");
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
		System.out.println(frameElement.getText());
		      
	   //6.Print main window element text
		driver.switchTo().parentFrame();
		System.out.println(windowElement.getText());
		     
	   //7.Close browser window
		driver.close();
	}

}
