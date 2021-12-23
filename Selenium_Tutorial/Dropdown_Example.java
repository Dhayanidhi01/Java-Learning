package Selenium_Tutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement SelectByIdenx = driver.findElement(By.id("dropdown1"));
		Select select = new Select(SelectByIdenx);
		select.selectByIndex(1);

		WebElement SelectByText = driver.findElement(By.name("dropdown2"));
        Select select2 = new Select(SelectByText);
        select2.selectByVisibleText("UFT/QTP");

		WebElement SelectByValue = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(SelectByValue);
		select3.selectByValue("4");
        
		WebElement SelectByOptions = driver.findElement(By.className("dropdown"));
		
		Select select4 = new Select(SelectByOptions);
		List<WebElement> Options = select4.getOptions();
		int Counts = Options.size();
		System.out.println(Counts);
		
		
		WebElement Sendkeys = driver.findElement(By.xpath("//div[@class='example']//following::select[5]"));
		Sendkeys.sendKeys("Loadrunner");
		
		WebElement multipleselect = driver.findElement(By.xpath("//div[@class='example']//following::select[6]"));
		Select select5 = new Select(multipleselect);
		
		select5.selectByIndex(0);
		select5.selectByIndex(1);
		select5.selectByIndex(2);
		select5.selectByIndex(3);
	}

}
