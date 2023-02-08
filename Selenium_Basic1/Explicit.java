package Selenium_Basic1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
 		
	 	WebDriver driver=new ChromeDriver();
	 	//declaration of explicit wait
	 	WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
	 	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	 
	 	
	 	

	}

}
