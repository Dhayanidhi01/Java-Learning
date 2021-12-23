package Selenium_Tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
	
		String browser=properties.getProperty("browser");
		String driverLocation = properties.getProperty("DirverLocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver=new ChromeDriver();
		} else if (browser.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.geko.driver", driverLocation);
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.co.in");
	}

}
