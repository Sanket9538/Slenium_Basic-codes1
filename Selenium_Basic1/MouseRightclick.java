package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement linkvariable=driver.findElement(By.xpath("//a[contains(text(),'निजता')]"));
	Actions act=new Actions(driver);
		act.contextClick(linkvariable).perform();
		
		
		
	}

}
