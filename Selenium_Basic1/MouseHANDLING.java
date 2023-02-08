package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHANDLING {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
          
		WebElement desktop=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement mackkmenuitem=driver.findElement(By.xpath("//body//main//a[3]"));
		
		//mouse hover action
		Actions act= new Actions(driver);
		act.moveToElement(desktop).moveToElement(mackkmenuitem).click().perform();
		
		
	}

}
