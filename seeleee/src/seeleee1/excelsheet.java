Stpackage seeleee1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelsheet {

	 static screenshot a ; //global object refrance
		public static void main(String[]args) throws IOException 	{
			
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY LECTURES\\AUTOMATION\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			a = new screenshot();
		    WebDriver driver = new ChromeDriver();
		    driver.navigate().to("https://www.facebook.com//");

			   WebElement user = driver.findElement(By.xpath("//input[@type='text']"));

		//om shree shivay namahsthubhyam:
		    //how to get data from excel sheet
		    
	String path = "C:\\Users\\240739\\Downloads\\29JAN-2022 (Group-C) - 1 (1).xlsx\\"; 
		    
    FileInputStream file =  new FileInputStream(path);
    
   String value =  WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
     System.out.println(value);

     user.sendKeys(value);
     
     
     //double data =   WorkbookFactory.create(file).getSheet("Sheet1").getRow(0)
 
}}