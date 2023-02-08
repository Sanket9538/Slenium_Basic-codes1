package Selenium_Basic1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
		        
				WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
			//	String	windowid =driver.getWindowHandle();
				//System.out.println(	windowid);//CDwindow-292E241CF6F3D49636FB38D6A18AC9BC
				driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
				
	//	Set<String> windowid=driver.getWindowHandles();
			//approach 1
	//	List<String> windowIdList=new ArrayList(windowid);
	//	String Parentwindowid=windowIdList.get(0);//windows id of parent window
		//String childwindowid =windowIdList.get(1);//windows id of child window
		//System.out.println(Parentwindowid);
		//System.out.println( childwindowid);
}
}