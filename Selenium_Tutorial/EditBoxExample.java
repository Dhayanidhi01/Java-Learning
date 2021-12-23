package Selenium_Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Edit.html");
		
		
		WebElement EnterEmailFelid = driver.findElement(By.id("email"));
		EnterEmailFelid.sendKeys("dhayanidhi.d@gmail.com");
		
		WebElement AppendBox = driver.findElement(By.xpath("//input[@type='text'][@value='Append ']"));
		AppendBox.sendKeys("Dhayanidhi");
		
		WebElement GetDefauktText=driver.findElement(By.name("username"));
		String DefaultText = GetDefauktText.getAttribute("value");
	    System.out.println(DefaultText);
	    
	    WebElement clearmeBox = driver.findElement(By.xpath("//*[@name='username']//following::input[1]"));
	    		clearmeBox.clear();
	
	    WebElement disabledbox = driver.findElement(By.xpath("//*[@name='username']//following::input[2]"));
boolean disabled = 	disabledbox.isEnabled();
	System.out.println(disabled);
	
	WebElement GetDefauktText1=driver.findElement(By.name("username"));
	String DefaultText1 = GetDefauktText1.getDomAttribute("type");
System.out.println(DefaultText1);
	
	}

}
