package Selenium_Basic1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Popops {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
         Thread.sleep(5000);
       Alert myAlert = driver.switchTo().alert();
       System.out.println("myAlert.getText()");
   
        //myAlert.sendKeys("Welcome Lavdu");
       // myAlert.accept();//alert window get close by using window button
       // myAlert.dismiss();//close alert window by using cancel bUTTON
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	
	}

}
