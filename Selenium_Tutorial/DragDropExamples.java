package Selenium_Tutorial;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class DragDropExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
	WebElement	From = driver.findElement(By.id("draggable"));
	WebElement	To = driver.findElement(By.id("droppable"));
	
	Actions actions = new Actions(driver);
	//actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
	actions.dragAndDrop(From, To).build().perform();
	}

}
