package Selenium_Tutorial;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement download=driver.findElement(By.partialLinkText("Download"));
		download.click();
		
		File filelocation = new File("c:\\Downloads");
	File[] totalfiles =	filelocation.listFiles();
		
		for (File download1 : totalfiles) {
			if(download1.getName().equals("Download.xls")) {
				System.out.println("File is Downloaded");
				break;
			}
		}
		
	}

}
