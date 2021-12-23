package Selenium_Tutorial;

import java.awt.AWTException;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
         
        Thread.sleep(3000);
        //scroll down the page
         
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
         
        //Click on Country Dropdown
  
        WebElement ele= driver.findElement(By.name("country"));
         
        //SELECT VALUE FROM DROPDOWN LIST using selectByValue method
         
        Select s = new Select(ele);
        s.selectByValue("ZAMBIA");
 
 
 
           // Same like using selectByIndex method
 
       //      Select s1 = new Select(ele);
      //  s1.selectByIndex(4);
 
 
          // Same like using selectByvisibleText method
 
             Select s2 = new Select(ele);
        s2.selectByVisibleText("ZAMBIA");
		
	}

}
