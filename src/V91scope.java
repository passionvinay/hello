import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V91scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//website : http://qaclickacademy.com/practice.php
		//1. Give me the count of links on the page.
		//2. Count of footer section
		//3.count of footersection and open in saperate windows 
		//4.//4- click on each link in the coloumn and check if the pages are opening-
				
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		//1. Give me the count of links on the page.
		driver.findElement(By.tagName("a")).getSize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2. Count of footer section
		driver.findElements(By.id("gf-BIG")).size();
		WebElement Lowerfooter=driver.findElement(By.id("gf-BIG"));
		System.out.println(Lowerfooter.findElements(By.tagName("a")).size());
		
		
		//3.count of footersection and open in saperate windows 
		
		WebElement Lower=Lowerfooter.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Lower.findElements(By.tagName("a")).size());
		
		for(int i=1;i<Lower.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			Lower.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}
		Set<String> abcd= driver.getWindowHandles();
		Iterator <String> it=abcd.iterator();
		
		
		
		while (it.hasNext())
		{
			
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
			

			
		}		
	
	}
}

		
		
		
		
		
		
		
		
		
		
		
	
