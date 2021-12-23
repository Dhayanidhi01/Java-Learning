package configPropertiesOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class configPropertiesExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);

		String browser =properties.getProperty("browser");
		String driverlocation =properties.getProperty("DirverLocation");

		if(browser.equalsIgnoreCase("fireFox")){
			System.setProperty("WebDriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("WebDriver.chrome.driver", driverlocation);
			driver=new ChromeDriver();

		}
		driver.get("https:www.google.com");
	}

}
