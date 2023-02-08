package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download_pdf_file_using_firefox {

	public static void main(String[] args) {
String location=System.getProperty("user.dir")+"\\Downloads";
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.helperapps.neverAsk.saveToDisk","application/msword" );
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", location);
		
        FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		System.setProperty("Webdriver.gecko.driver", "C:\\selenium Webdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div[2]/div/div/table/tbody/tr[1]/td[5]/a")).click();

	}

}
