package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTesting {

	@Test
	public void openGoogle() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");


	}

	@Test
	public void openBing() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.co.in");


	}
	@Test
	public void openyahoo() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.co.in");


	}

}
