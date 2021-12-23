package Selenium_Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/tooltip.html");
		
	WebElement GetTitleName =	driver.findElement(By.id("age"));
String Name =	GetTitleName.getAttribute("title");	
	
System.out.println(Name);
	}

}
