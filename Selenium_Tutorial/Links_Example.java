package Selenium_Tutorial;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Links_Example {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.geko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		WebElement GotoHomePage =	driver.findElement(By.linkText("Go to Home Page"));
		GotoHomePage.click();

		driver.navigate().back();
		

		WebElement wheretogo = driver.findElement(By.partialLinkText("Find where"));
		String url=wheretogo.getAttribute("href");
		System.out.println(url);

		WebElement Brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
		Brokenlink.click();

		String TitleName = driver.getTitle();

		if (TitleName.contains("404")) {

			System.out.println("Link is Broken");

		}

		driver.navigate().back();
		
		WebElement GotoHomePage1=driver.findElement(By.partialLinkText("Go to Home Page"));
		GotoHomePage1.click();

		driver.navigate().back();
				List<WebElement> totallinks= driver.findElements(By.tagName("a"));

		int linkcounts = totallinks.size();
		System.out.println(linkcounts);


	}

}
