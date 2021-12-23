package Selenium_Tutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement checkBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[2]/input"));
		checkBox.click();

		WebElement DeSelect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		boolean uncheck1 = DeSelect.isSelected();
		System.out.println(uncheck1);

		WebElement unchecked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		if (unchecked.isSelected()) {
			unchecked.click();

//			WebElement multipleSelect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[1]/input"));
//			multipleSelect.click();
//
//			WebElement multipleSelect1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[3]/input"));
//			multipleSelect1.click();
			
			//Selected all check box
			
			List<WebElement> allboxchecked =	driver.findElements(By.xpath("//input[@type='checkbox']"));

			int size=allboxchecked.size();
			System.out.println(size);
			
			for (int checkbox = 0; checkbox < size; checkbox++) {
				allboxchecked.get(checkbox).click();
			}
		}


	}

}
