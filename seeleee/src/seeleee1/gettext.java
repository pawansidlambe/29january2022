package seeleee1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
	
	
	public static void main(String[]args) {
		
System.setProperty("webdriver.chrome.driver","D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver.exe\\chromedriver.exe");
		
		
	   WebDriver driver = new ChromeDriver();
		
	   driver.navigate().to("https://www.facebook.com//");
	   
	   WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
   WebElement password = driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]"));
   WebElement loginInButton = driver.findElement(By.xpath("//button[@type='submit']"));
 WebElement createNewAccBuuton= driver.findElement(By.xpath("//input[@type='text']"));  
    
   String text = loginInButton.getText();
   boolean result = text.equals("Login");
    if (result == true);
    {
      System.out.println("pass");
    }
    String value=   user.getAttribute("placeholder");
    
//    
//    boolean result = text.equals("Email address or phone number");
//     if (result == true);
//     {
//       System.out.println("pass");
//     }
  
	
    
}}
