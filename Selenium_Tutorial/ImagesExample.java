package Selenium_Tutorial;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImagesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
	    WebElement clickElement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		clickElement.click();
		driver.navigate().back();

		WebElement BrokenImage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if (BrokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("This is broken image");
		}else {
			System.out.println("This is not Borken Image");
		}
	WebElement mouseclick = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/img"));	
	Actions actions = new Actions(driver);
	actions.click(mouseclick);
	actions.build().perform();
	driver.navigate().back();
	
	
	
	
	
	
	
	}

}
