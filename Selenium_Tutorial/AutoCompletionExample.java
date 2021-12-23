package Selenium_Tutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoCompletionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("W");

		List<WebElement> options = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));

		
		  
		  for (WebElement webElement : options) {
		  
		  if (webElement.getText().equals("Web Services")) { webElement.click(); break;
		  } }
		  
		 
	}

}
