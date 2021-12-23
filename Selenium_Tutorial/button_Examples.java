package Selenium_Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class button_Examples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Testing\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");


		WebElement getPostion = driver.findElement(By.id("position"));
		Point xyvalue = getPostion.getLocation();
		int xvalue=xyvalue.getX();
		int yvalue=xyvalue.getY();

		System.out.println("x postion: " +xvalue);
		System.out.println("y postion: " +yvalue);

		WebElement getColorName = driver.findElement(By.id("color"));
		String ColorName=getColorName.getCssValue("background-color");
		System.out.println("Color Vlue: " +ColorName);

		WebElement getWidthHight=driver.findElement(By.id("size"));

		int Hight =	getWidthHight.getSize().getHeight();
		int Width = getWidthHight.getSize().getWidth();	
System.out.println("My Hight Size: "+Hight);
System.out.println("My Widhtt Size: " +Width);


WebElement ClickHomePageButton = driver.findElement(By.id("home"));
ClickHomePageButton.click();

Thread.sleep(3000);

driver.close();

	}

}
