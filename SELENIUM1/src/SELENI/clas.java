package SELENI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clas {
	
	public static void main(String[]args)throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
		
	Thread.sleep(5000);
	
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		{
			System.out.println(url);
		}
		String pn= driver.getTitle();
		{
			System.out.println(pn);
		}
		
		int a = 90;
		System.out.println();
	}

}
