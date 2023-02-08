package selenium_basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
 		
	 	WebDriver driver=new ChromeDriver();
	 	//WebElement male=driver.findElement(By.xpath("//input[@id='FirstName']"));
	 	
	 	driver.get("https:www.snapdeal.com");
	 	driver.navigate().to("https://amazon.com");
	 	//driver.navigate().back();
	 	//driver.navigate().forward();
	 	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("tshirt");
	 	driver.navigate().refresh();
	 	
	}
}
