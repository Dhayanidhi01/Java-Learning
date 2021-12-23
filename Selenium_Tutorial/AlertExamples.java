package Selenium_Tutorial;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		simpleAlert.click();
		
		Thread.sleep(3000);
		Alert alert1=driver.switchTo().alert();
        alert1.accept();
        
        
        WebElement confirmBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        confirmBox.click();
		Thread.sleep(3000);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        
        
        WebElement promptBox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
        promptBox.click();
		Thread.sleep(3000);
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Dhayanidhi");
        alert3.accept();
        
        WebElement LineBreak = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div[4]/div/div/button"));
        LineBreak.click();
        Alert alert4 = driver.switchTo().alert();
      boolean linebreak =  alert4.equals(alert4);
       System.out.println(linebreak);
        
	
	}

}
