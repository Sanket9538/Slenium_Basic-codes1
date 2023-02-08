package selenium_basic3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_handling {       

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
          driver.switchTo().frame(0);//switch to frame
          
          //approch 1 using sendkeys method
          //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/10/2022");
		
          //using date picker
          driver.findElement(By.xpath("//input[@id='datepicker']")).click();//open the date picker
          String year="2025";
          String month="April";  
    String date="15";
    //select month and year
    while(true)
    {
     String mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
     String yer=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
    
     if(mon.equals(month) && yer.equals(year))
     {
    	 break;
     }
 
    	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next buttonn for future date
     }
     
     //date selection
    List<WebElement> alldates= driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
     
     for(WebElement dt: alldates) {
    	 if(dt.getText().equals(date)) {
    		 dt.click();
    		 break;
    	 }
     }
    }
    
     
     
	}


