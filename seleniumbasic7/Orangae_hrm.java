package seleniumbasic7;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangae_hrm {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\selenium Webdriver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com");
	  //driver.findElement(By.id("Search for products, brands and more")).sen====dKeys("iphone");
	  
	 // driver.findElement(By.name("q")).click();
	List<WebElement> sliders=  driver.findElements(By.className("kJjFO0 _3DIhEh"));	  
	}

}
