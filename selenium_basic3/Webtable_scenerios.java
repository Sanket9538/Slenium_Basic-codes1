package selenium_basic3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_scenerios {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		//how many rows in a table
		//how many columns in a table
		//retrive the specific row/column data
		//retrieve all the data from the table
		driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();
			
			////how many rows in a table
		int rows=	driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
			
		System.out.println("Number of rows in table"+      rows);
		
			//how many columns in a table
		int columns=	driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size(); 
	System.out.println("Number of columns in table"+":"+ columns);
	
	//retrieve the specific row/column data
		
	String value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
		System.out.print("the value is"+":"+ value);
		
			
			//retrieve all the data from the table
		
			for(int r=1; r<=rows; r++)
			{
				for(int c=1; c<=columns; c++)
				{
					 value=driver.findElement(By.xpath("//table[@id=\\\"customers\\\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
							
			            System.out.println(value+"                ");
		
				}
		
			System.out.println();
			
			}
			
			
			
	
			
	}

}
