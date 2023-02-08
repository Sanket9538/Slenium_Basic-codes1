package selenium_basic5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement_vs_elements {
    public static void main(String[] args) {
		
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
 		
	 	WebDriver driver=new ChromeDriver();
    	driver.get("https://amazon.com");
    	//WebElement element=driver.findElement(By.xpath("//input[@id='issprefix']"));
    	//element.click();
    	WebElement link=driver.findElement(By.xpath("//div[normalize-space()='Get to Know Us']"));
    	System.out.println(       link.getText());
	}
}
