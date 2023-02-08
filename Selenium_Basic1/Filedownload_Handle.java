package Selenium_Basic1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Filedownload_Handle {

	public static void main(String[] args) {
		
		String location=System.getProperty("user.dir")+"\\Downloads";
		
			
			        //chrome
			HashMap preference=new HashMap();//hashmap contains key and value place
			preference.put("download.default_directory", location);//download default directory is a key(predefined value)value is a path where we want to downloaded
			
			
			
			ChromeOptions options=new ChromeOptions();//predefine class which have to import
			options.setExperimentalOption("prefs", preference);//predefined method(prefs=predefined variable.it is the key.value of the key is the preferences.
			
			System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
			
					WebDriver driver=new ChromeDriver(options);//if dont pass the options,this above settings will not applicable for the browser which we are launching 
					driver.manage().window().maximize();
					driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
                    driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click(); 
					
					
					
	}

}
