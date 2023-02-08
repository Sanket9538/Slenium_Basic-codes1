package Selenium_Basic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getttxtattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
 		
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://admin-demo.nopcommerce.com/login");
	 	WebElement emailInputBox =driver.findElement(By.xpath("//input[@id='Email"));
	 	emailInputBox.clear();
	 	// emailInputBox.sendKeys("admin@yourstore.com");
	 	System.out.println("result of getText()"+emailInputBox.getText());
	 	System.out.println("result of getAttribute()"+emailInputBox.getAttribute("value"));
	}

}
