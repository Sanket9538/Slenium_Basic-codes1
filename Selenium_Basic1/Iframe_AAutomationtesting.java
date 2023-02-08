package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_AAutomationtesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
		        
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Frames.html");
				driver.manage().window().maximize();
				
				
				driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
				
		WebElement outerframe=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div"));
		driver.switchTo().frame(outerframe);//switch to outer frame
		
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div"));
		driver.switchTo().frame(outerframe);//switch to innrer frame
		
      driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("welcome lavdu");
	
	}
}