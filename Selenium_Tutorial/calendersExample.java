package Selenium_Tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calendersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement SelectDate=driver.findElement(By.id("datepicker"));
		//SelectDate.sendKeys("11/10/2021 \n");
		SelectDate.click();
		WebElement Nextbutton=driver.findElement(By.xpath("//a[@data-event='click'][@title='Next']"));
	    Nextbutton.click();
		WebElement datatobegiven=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[6]/a"));
		//datatobegiven.click();
		
		Actions actioncalender=new Actions(driver);
		actioncalender.clickAndHold();
		actioncalender.moveToElement(datatobegiven).click();
		actioncalender.build().perform();
	}

}
