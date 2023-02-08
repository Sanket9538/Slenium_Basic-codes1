package Selenium_Basic1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen {

	public static void main(String[] args) throws IOException {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
         driver.manage().window().maximize();

         //screenshot of the page
        // TakesScreenshot ts= (TakesScreenshot)driver;
        //File src= ts.getScreenshotAs(OutputType.FILE);
        // File trg=new File(System.getProperty("user.dir")+"\\Screenshots\\homepage.png");
         //FileUtils.copyFile(src,trg);
         //download apache.commons.io
         
     //  WebElement pagesection= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
       //File src= pagesection.getScreenshotAs(OutputType.FILE);
        //File trg=new File(System.getProperty("user.dir")+"\\Screenshots\\feature product.png");
        //FileUtils.copyFile(src,trg);
         
        //Screenshot of the element
         WebElement logo= driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
         File src= logo.getScreenshotAs(OutputType.FILE);
          File trg=new File("D:\\selenum ROGRAM\\SanketSelenium\\Screenshots\\sanket.png");
          FileUtils.copyFile(src,trg);
        
        
          
       
	}

}
