package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_frames {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");//switch to first frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();//go to main page
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("packageFrame"); //switch to 2nd frame
		driver.findElement(By.linkText("HasAuthentication")).click();
		driver.switchTo().defaultContent(); //go to main page
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("classFrame");//switch to 3rd frame 
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		;
	}

}
