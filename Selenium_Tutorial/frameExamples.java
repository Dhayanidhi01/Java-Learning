package Selenium_Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);

		WebElement clickme = driver.findElement(By.id("Click"));
		clickme.click();

		String text =	driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();

		driver.switchTo().defaultContent();

		List<WebElement> total =	driver.findElements(By.tagName("iframe"));
		int totalframes =	total.size();

		System.out.println(totalframes);
	}

}
