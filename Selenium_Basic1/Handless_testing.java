package Selenium_Basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Handless_testing {
       
      
	public static void main(String[] args) {
		
	//ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		
		
		EdgeOptions options=new EdgeOptions();
	     options.setHeadless(true);
	//if u have false argument your script will not get executed in headless mode.  
		//FirefoxOptions options=new FirefoxOptions();
		//options.setHeadless(true);
		
        System.setProperty("Webdriver.edge.driver", "D:\\selenum ROGRAM\\SanketSelenium\\REsources\\msedgedriver.exe");
        
		WebDriver driver=new EdgeDriver(options);
		driver.get("https:\\demo.nopcommerce.com");
         driver.manage().window().maximize(); 
         
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         
         
         
         

	}

}
