package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclaVsACTIONINTR {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
         driver.manage().window().maximize();
         WebElement womencloth=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
         Actions act=new Actions(driver);
         act.moveToElement(womencloth).build().perform();

	}

}
