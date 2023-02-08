package Selenium_Basic1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NormalDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpcountry=driver.findElement(By.xpath("//select[@id='input-country']"));
        Select drpButton=new Select(drpcountry);
        drpButton.selectByVisibleText("Iran");
        Thread.sleep(3000);
        
        drpButton.selectByValue("28");
        Thread.sleep(3000);
        
        drpButton.selectByIndex(10);
        Thread.sleep(3000);
        List<WebElement> allOptions=drpButton.getOptions();
      System.out.println(allOptions.size());
         
     // for(int i=0; i<=allOptions.size();i++) {
    	//  System.out.println(allOptions.get(i).getText());
    //  }
      
    //  for(WebElement option:allOptions) {
    	//  System.out.println(option.getText());
   //   }
       for(WebElement option:allOptions)
       {
    	 if(option.getText().equals("Iran"));
    	 {
    		 option.click();
    		 break;
    	 }
    	   
       }
      
      
	}

}
