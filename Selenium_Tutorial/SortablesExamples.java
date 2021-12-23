package Selenium_Tutorial;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortablesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://www.leafground.com/pages/sortable.html");

List<WebElement> sortable=driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement fromElement=sortable.get(6);
		WebElement toElements=sortable.get(1);
		
		Actions actions=new Actions(driver);
	//	actions.clickAndHold(fromElement).moveToElement(toElements).build().perform();
		actions.dragAndDrop(fromElement, toElements).build().perform();
		
	}

}
