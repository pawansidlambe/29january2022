package seeleee1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class screenshotmock {
	
	public static void main(String[]args) throws IOException
	{
		
		
    System.setProperty("webdriver.chrome.driver","D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://www.amazon.in");
//		
//		driver.get("https://www.facebook.com//");
//		
//		
//		driver.get("http://www.amazon.in");
//		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		
	   TakesScreenshot s =  (TakesScreenshot) new ChromeDriver (); 
		
	   File Source =   s.getScreenshotAs(OutputType.FILE);
	   
	   File dest = new File("D:\\test12345.jpeg");
	   
	   FileHandler.copy(Source, dest);
	   
	   System.out.println("end");
	   
	   
	   
	   
	}

}
