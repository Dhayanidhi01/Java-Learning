package Selenium_Tutorial;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tableExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium_Training\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
List<WebElement> columnscount=driver.findElements(By.xpath("//*[@id='table_id']/tbody/tr[1]/th"));
	    int count=columnscount.size();	    
	    System.out.println(count);
	    List<WebElement> rowcount=driver.findElements(By.xpath("//*[@id='table_id']/tbody/tr"));	
	    int countofrow=rowcount.size();
	    System.out.println(countofrow);
	    
	    //td[normalize-space=Learn to interact with Elements]//following::td[2]
	    
	    WebElement progressvalue= driver.findElement(By.xpath("//tr[3]//td[2]"));
	  String value =  progressvalue.getText();
	  System.out.println(value);
	  
	 List<WebElement> Progress = driver.findElements(By.xpath("//td[2]"));
	 
	 List<Integer> numberList=new ArrayList<Integer>();
	 for (WebElement webElement : Progress) {
		 String individulvalue = webElement.getText().replace("%", "");
		 numberList.add(Integer.parseInt(individulvalue));
	}
	System.out.println(numberList);
	
	int smallvalue=Collections.min(numberList);
	System.out.println(smallvalue);
	
	String  smallValueString = Integer.toString(smallvalue);
	
	String finalxpath="//td[text()="+"\"" + smallValueString + "%"+"\"]//following::td[1]";
	System.out.println(finalxpath);
	Thread.sleep(25);
	WebElement check = driver.findElement(By.xpath(finalxpath));
	Actions actions=new Actions(driver);
	actions.click(check).build().perform();
	
	}

}
