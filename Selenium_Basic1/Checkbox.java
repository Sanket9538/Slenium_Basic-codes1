package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
WebDriver driver=new ChromeDriver();
	 	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	 	driver.manage().window().maximize();
	 	//case1=how to select specific checkbox
	 	driver.findElement(By.xpath("//input[@id='monday']")).click();
	 	
}
}