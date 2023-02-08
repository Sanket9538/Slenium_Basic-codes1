package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_the_page {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
         driver.manage().window().maximize();
    JavascriptExecutor js=(JavascriptExecutor)driver;
    
    //scroll down page by pixel
      //   js.executeScript("window.scrollBy(0,3000)","");
     // long value= (long) js.executeScript("return window.pageYOffset;");
    
     //    System.out.println("Number of pixel moved "+ value);
         
    //scroll down the page till the element is visible
  //  WebElement flag=driver.findElement(By.xpath("//td[normalize-space()='India']"));
    
   // js.executeScript("arguments[0].scrollIntoView();",flag);
   // long value= (long) js.executeScript("return window.pageYOffset;");
  //  System.out.println("Number of pixel moved "+ value);
    
    //scroll down page till end
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    long value=(Long)js.executeScript("return window.pageYOffset;");
    
	}

}
