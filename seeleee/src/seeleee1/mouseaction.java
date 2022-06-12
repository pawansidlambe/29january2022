package seeleee1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {
	public static void main(String[]args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe\\");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in//");
		
		 WebElement  accandlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		 Actions act = new Actions(driver);
		 act.moveToElement(accandlist).perform();
		 
		 
		 WebElement orderlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		 act.click().build().perform();
		 
//		 WebDriver. mybooking = driver.findElement(By.xpath("//span[text()='Your Orders']")) ;
//		 mybooking.act.click().build().perform();
		
		 WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		 email.sendKeys("pawansidlambe2016@gmail.com");
		 
		 WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		 continueButton.click();
		 
//		//how to perform actions in selenium.
         
	   
//          act.moveToElement(user);// to move elemnt
//        act.click().build().perform() ; // to click 
//	    act.context()perform() ;  //right click
//	    act.moveToElement(user)perform() ; // to move element
//	    act.doubleClick()perform() ;//to double click
//	    act.dragAndDrop(source, target)perform() ;
//	    act.build()perform();
//	    act.perform();perform();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
