package selenium_basic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("patilsanket792@gmail.com");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("9503200610");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("patilsanket792@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=\"royal_email\"]")).sendKeys("patilsanke792@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=\"royal_pass\"]")).sendKeys("patilsanke123");
		driver.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click(); 
		
	}

}
