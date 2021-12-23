package SamplePorject;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class GoToLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String actualTitle=driver.getTitle();
		String ExceptedTitle ="Home Page";

		

		if (actualTitle.equalsIgnoreCase(ExceptedTitle)) {
			System.out.println("The test case is passed");
		} else {
			System.out.println("The test case is failed");
		}
		WebElement Mobile=driver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a"));
	    Mobile.click();


	    String actualTitleMobilePage=driver.getTitle();
	    String ExceptedMobileTitlePage="Mobile";
	    
	    if (actualTitleMobilePage.equals(ExceptedMobileTitlePage)) {
			
	    	System.out.println("The title is Mobile");
		} else {
System.out.println("The title is not matched");
		}
	    
WebElement Dropdownlist=driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
	    
	    Select select=new Select(Dropdownlist);
	    select.selectByIndex(1);
	    
	List<WebElement> MobileName = driver.findElements(By.xpath("//h2[@class='product-name']/a"));

	
	}

	

}
