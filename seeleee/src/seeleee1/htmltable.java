package seeleee1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmltable {

	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver ();
		
		driver.navigate().to("https:www.w3schools.com/html/html_tables.asp");
		
	   List<WebElement> cells    =  driver.findElements(By.xpath("//table[@id='customers']//td"));
		
	   for(int i = 0; i < 17 ; i++)
	   {
		   
	   String text = cells.get(i).getText();
	   
	    System.out.println(text);
	     
	   }
	    
	    
	}
}
