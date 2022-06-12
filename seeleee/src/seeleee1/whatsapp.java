package seeleee1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;
import org.openqa.selenium.support.FindAll;

public class whatsapp {
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");

		
	    WebDriver driver = new ChromeDriver();
		  
	    driver.navigate().to("https://www.facebook.com//");
	   
	    ////button[@name='login']
//	    
//	    Thread.sleep(2000);
//        driver.get("https://www.instagram.com/accounts/login/?hl=en");
//        
//        WebElement eamilid = driver.findElement(By.xpath("//input[@autocapitalize='off'])[1]"));
//	    eamilid.click();
//	    eamilid.sendKeys("pawan_sidlambe");
	    
	}

}