package seeleee1;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class screenshot {
     static screenshot a ; //global object refrance
	public static void main(String[]args) throws IOException 	{
		
System.setProperty("webdriver.chrome.driver","D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		a = new screenshot();
	    WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("hp laptop i5 11th generation");
		WebElement tabindex = driver.findElement(By.xpath("//input[@type='submit']"));
	    tabindex.click();
	    WebElement laptop5gen = driver.findElement(By.xpath("//img[@alt='Lenovo IdeaPad 3 11th Gen Intel Core i3 35.56cm (14 inches) FHD Thin & Light Laptop (8 GB/256GB SDD/Windows 11/MS Office 2021/2Yr Warranty/Platinum Grey/1.5Kg), 81X700CWIN']"));    
	    laptop5gen.click();
	    driver.manage().window().maximize();
	    WebElement buynow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
	    buynow.click();
	    WebElement phonenumber = driver.findElement(By.xpath("//input[@type='email']"));
	    phonenumber.sendKeys("akshaydalve88@gmail.com");
	    WebElement conitnueButton = driver.findElement(By.xpath("//input[@id='continue']"));
	    conitnueButton.click();
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("Akku@1991");
	    WebElement  signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	    signin.click();
	    //takesscreenshot is an interface in selenium library
	    //by using we can capture ss of webdriver.
	   
//	    TakesScreenshot s = (TakesScreenshot) driver;//old object used.  //to take screenshot
//	    File source =  s.getScreenshotAs(OutputType.FILE);               //to take screenshot
//	    File dest = new File ("D:\\test123.jpeg");                        //to take screenshot
//	    FileHandler.copy(source, dest);
//	    
	      //to take screenshot
	    
	    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);               //to take screenshot
	    File dest = new File ("D:\\test1234.jpeg");                        //to take screenshot
	    FileHandler.copy(source, dest);
	   
	}
}
