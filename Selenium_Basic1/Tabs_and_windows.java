package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs_and_windows {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		//driver.get("https:\\demo.nopcommerce.com");
        // driver.manage().window().maximize(); 
         
         //open link in the another tab
        //String reglink= Keys.chord(Keys.CONTROL,Keys.RETURN);
         //driver.findElement(By.linkText("Register")).sendKeys(reglink);
          
         
         //new tab
         
       // driver.get("https://opencart.com/");
        //driver.switchTo().newWindow(WindowType.TAB);
       // driver.get("https://orangehrm.com/");
  
      //new window
        driver.get("https://opencart.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://orangehrm.com/");
  
	}

}
