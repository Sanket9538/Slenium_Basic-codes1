package selenium_basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
 		
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://amazon.com");
	 	driver.manage().window().maximize();
	 	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("tshirts");
	 	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
	 	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
           driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	 	//x path options  or method and and method
	 	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @ class=//input[@id='twotabsearchtextbox']]")).sendKeys("tshirts");
	driver.findElement(By.xpath("//input[@name='nav-search-submit-button' and @ class='nav-input nav-progressive-attribute']")).click();
	 	// x path option contains method and starts.with method
	 	 driver.findElement(By.xpath("[//*contains@class,'nav-input nav-progressive-attribute')*]")).sendKeys("tshirt");
	 	driver.findElement(By.xpath("[//*contains@class,'nav-input nav-progressive-attribute']")).click();
	 	
	 	
	 	
	}

}
