package Selenium_Basic1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//Thread.sleep(8000);
		//click on the link
	//driver.findElement(By.linkText("Today's Deals")).click();
		//partial link text
		//driver.findElement(By.partialLinkText("Today's ")).click();
		//number of links
	List<WebElement> links=	driver.findElements(By.tagName("a"));
		System.out.println("Total links "+links.size());
		//print all the links name
		for(WebElement e:links) {
			System.out.println(e.getText());
			
		}
	}

}
