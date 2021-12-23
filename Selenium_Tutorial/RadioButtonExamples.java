package Selenium_Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.leafground.com/pages/radio.html");

		WebElement selected = driver.findElement(By.xpath("//div[@id='first']//following::*"));
		selected.click();

		WebElement unchecked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
		WebElement checked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		boolean status1 =	unchecked.isSelected();
		boolean status2 =	checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);

		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
	}

}
