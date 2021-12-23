package DropDownPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownJavaExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
        
       
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
         
        

      //Method 1 - Action class and using Send key method  
		/*
		 * WebElement allOptions =
		 * driver.findElement(By.xpath("//*[@id='state']/div/div[1]/div[1]")); Actions
		 * action = new Actions(driver);
		 * action.clickAndHold(allOptions).build().perform();
		 * action.moveToElement(allOptions).build().perform();
		 * action.sendKeys(allOptions, "Haryana \n").build().perform();
		 */ 
     
        //Method 2 - Looping concept and using Java method
        
        driver.findElement(By.xpath("//*[@id='state']/div/div[1]/div[1]")).click();
        
        List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id='state']/div/div[1]/div"));
	    System.out.println(allOptions.size());
	    
	    for(int i = 0; i<=allOptions.size()-1; i++) {
            
            
            if(allOptions.get(i).getText().contains("Rajasthan")) {
                 
                allOptions.get(i).click();
                break;
                 
            }
        }
	//
	    driver.findElement(By.xpath("//*[@class=' css-1wa3eu0-placeholder']")).click();
	    List<WebElement> allOptions1 = driver.findElements(By.xpath("//*[@id='city']/div/div"));
	    System.out.println(allOptions1.size());
	    
	    for (int i = 0; i < allOptions1.size(); i++) {
			
	    	if (allOptions1.get(i).getText().contains("Jaiselmer")) {
	    		allOptions1.get(i).click();
	    		break;
			}
		}
	    
	    
	 driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[2]")).click();
	    
	   
	    
	  	}

	
}
