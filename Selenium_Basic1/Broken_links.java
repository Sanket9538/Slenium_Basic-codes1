package Selenium_Basic1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args, String url) throws MalformedURLException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
	 List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	 int BrokenLinks=0;
	   for(WebElement element:alllinks)
	   {
		   
		 String URL=  element.getAttribute("href");
		 if(URL==null|| URL.isEmpty())
		 {
			 System.out.println("URL is empty");
			 URL link=new URL(url);
			try
			{
			 HttpURLConnection HTTPConn =(HttpURLConnection) link.openConnection();
			 HTTPConn.connect();
			 
			 if(HTTPConn.getResponseCode()>=400)
			 {
				 System.out.println(HTTPConn.getResponseCode()+"URL"+"is brokenLink");
				 BrokenLinks++;
				 
			 }
			 else
			 {
				 System.out.println(HTTPConn.getResponseCode()+"URL"+"is not broken code");
			 }
			}
			 
				 catch(Exception e   ) {
			
				 }
			 
		 }
			 
			{
				System.out.println("Number of broken links"+BrokenLinks);
				driver.quit();
			}
		 }
	   }
	 
	 
	}


