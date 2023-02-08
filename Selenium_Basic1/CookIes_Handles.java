package Selenium_Basic1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookIes_Handles {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\demo.nopcommerce.com");
         driver.manage().window().maximize();  
           //how to capture cookies from browser
         
        Set<Cookie> cookies=driver.manage().getCookies();
         
        System.out.println( cookies.size());
        //how to print cookies from the browser
        
        for(Cookie c:cookies) 
        {
        	System.out.println(c.getName()+":"+c.getValue());
        }
         //how to add cookies to the browser
        
        Cookie cookieObj=new Cookie("Mycookiis","123456");
        driver.manage().addCookie(cookieObj);
        cookies =driver.manage().getCookies();
         
        System.out.println("size of cookies after adding new one:"+cookies.size());
         
         //how to delete the cookies from the browser
        driver.manage().deleteCookie(cookieObj);
        cookies=driver.manage().getCookies();
        System.out.println("Size of the cookies after del new one:"+ cookies.size());
         
         //how to delete all cookies method
        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();
        System.out.println("Size of the cookies after deleting  new one:"+ cookies.size());
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
