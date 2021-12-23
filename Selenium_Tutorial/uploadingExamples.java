package Selenium_Tutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadingExamples {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("http://www.leafground.com/pages/download.html");
			
			WebElement uploadfile = driver.findElement(By.name("filename"));
			uploadfile.click();
			
			String file ="c:\\user\\download\\download.xls";
			StringSelection selection=new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
