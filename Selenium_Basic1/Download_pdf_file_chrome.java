package Selenium_Basic1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_pdf_file_chrome {

	public static void main(String[] args) {
		String location=System.getProperty("user.dir")+"\\Downloads";

		HashMap preference=new HashMap();//hashmaap contains key and value place
		preference.put("download.default_directory", location);
		preference.put("plugins.always_open_pdf_externally", true);
		
		ChromeOptions options=new ChromeOptions();//predefine class which have to import
		options.setExperimentalOption("prefs", preference);
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
        driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click(); 
		
		
	}

}
