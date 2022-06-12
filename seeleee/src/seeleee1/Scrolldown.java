package seeleee1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {
	
	public static void main(String[]args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver =  new ChromeDriver();	
		
		driver.get("https:www.w3schools.com/html/html5_draganddrop.asp");
		
		   WebElement tryItYourself = driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		

//		js.executeScript("window.scrollBy(0,4000)");
//		Thread.sleep(2000);
//		 js.executeScript("window.scrollBy(0,-1000)");
//		 Thread.sleep(2000);
//     	 js.executeScript("window.scrollBy(2000,0)");
//		 Thread.sleep(2000);
//		 js.executeScript("window.scrollBy(-2000,0)");
//		 Thread.sleep(2000);
		
		
       js.executeScript("argument[0].scrollIntoView(true);",tryItYourself );
       
       tryItYourself.click();
       }

}
