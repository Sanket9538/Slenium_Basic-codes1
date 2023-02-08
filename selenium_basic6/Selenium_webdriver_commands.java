package selenium_basic6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_webdriver_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
 		
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://amazon.com");
	 	System.out.println(driver.getTitle());
	 	System.out.println(driver.getCurrentUrl());
	 	
		System.out.println(driver.getPageSource());
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	}

}
