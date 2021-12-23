package TestNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suiteExample {
WebDriver driver;
long startTime;
long endTime;
	@BeforeSuite
	public void lanuchbrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
        driver=new FirefoxDriver();
	}
	
	
	
	@Test
	public void openGoogle() {
		
		
        driver.navigate().to("https://www.google.co.in");
	}

	
	@Test
	public void openBing() {
		
        driver.navigate().to("https://www.bing.co.in");
	}

	
	@Test
	public void openYahoo() {
		
        driver.navigate().to("https://www.yahoo.co.in");
	}

	
	@AfterSuite
	public void trearDown() {
		endTime=System.currentTimeMillis();
		long totaltime=endTime-startTime;
		System.out.println(totaltime);
	}
	

}
