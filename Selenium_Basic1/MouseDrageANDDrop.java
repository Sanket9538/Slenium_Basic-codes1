package Selenium_Basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrageANDDrop {

	public static void main(String[] args) {
System.setProperty("Webdriver.chrome.driver", "C:\\selenium Webdriver\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//mouse drag and drop
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	    WebElement rome=driver.findElement(By.id("box6"));
	    WebElement itly=driver.findElement(By.id("box106"));
	    act.dragAndDrop(rome, itly).perform();

	    WebElement madrid=driver.findElement(By.id("box7"));
	    WebElement spain=driver.findElement(By.id("box107"));
	    act.dragAndDrop(madrid, spain).perform();
	    
	}

}
