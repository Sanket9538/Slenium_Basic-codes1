package Selenium_Basic1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
         driver.manage().window().maximize();
         
         
         
         Actions act=new Actions (driver);
         //single action keys
        // act.sendKeys(Keys.ENTER).perform();
        // Thread.sleep(5000);
         act.sendKeys(Keys.ESCAPE).perform();
         Thread.sleep(5000);
         act.sendKeys(Keys.SPACE).perform();
	}

}
