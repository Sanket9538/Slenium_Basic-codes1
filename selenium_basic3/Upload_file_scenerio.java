package selenium_basic3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file_scenerio {

	public static void main(String[] args) throws AWTException {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com");
		driver.manage().window().maximize();
		
		//approach 1 using send keys method
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
      //driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("D:\\selenum ROGRAM\\Sanket Patil Resume 1.pdf");
		
		//approach 2 using robot class
		
		//driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).click();//open window but not working
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"file-upload\"]")));
		
		StringSelection ss=new StringSelection("D:\\selenum ROGRAM\\Sanket Patil Resume 1.pdf");//copying the path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//copying and pasting
		
		//robot class
		Robot rb=new Robot();
		rb.delay(300);
		
		//ctrl v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		//press enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
