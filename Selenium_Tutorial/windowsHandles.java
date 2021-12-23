package Selenium_Tutorial;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		String oldwindow=driver.getWindowHandle();

		WebElement HomePage = driver.findElement(By.id("home"));
		HomePage.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newwindows : handles) {

			driver.switchTo().window(newwindows);

		}

		WebElement editbutton=	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a"));

		editbutton.click();
		driver.close();

        driver.switchTo().window(oldwindow);
        
        WebElement openmultiple = driver.findElement(By.xpath("//*[@id='color']"));
        
        openmultiple.click();
        
        int numberofwindows = driver.getWindowHandles().size();
        System.out.println("No of opended: "+numberofwindows);
        
        WebElement donotCloseMe = driver.findElement(By.id("color"));
        
        donotCloseMe.click();
        Set<String> newwindows =  driver.getWindowHandles();
        for (String allwindows : newwindows) {
			if (!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
		}


	}

}
