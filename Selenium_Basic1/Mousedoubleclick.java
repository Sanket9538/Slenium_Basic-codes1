package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedoubleclick {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		///double click
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/article/div/article/div/section/div[2]/div[2]/iframe")));
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("/html/body/div"))).perform();

	}

}
