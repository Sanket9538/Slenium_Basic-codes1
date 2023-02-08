package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleTextkeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
		        
				WebDriver driver=new ChromeDriver();
				driver.get("https://text-compare.com/");
		         driver.manage().window().maximize();
		       //multiple key action
		       
		         
		  WebElement input1  =   driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));  
		  WebElement input2  =   driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));  
		  input1.sendKeys("Welcome to selenium");
		  Actions act=new Actions(driver);
		  //1st operation control+a
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("a");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		  //2nd  ctrl+c
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("c");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		  //press tab key to navigate second input box
		  act.sendKeys(Keys.TAB);
		  act.perform(); 
		  //3rd ctrl+v  
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("v");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
	
		  
}
}