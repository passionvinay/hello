import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;


public class V100scrolingdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		int sum=0;
	
		List<WebElement> top=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	
		for (int i=0;i<top.size();i++)
		{
		System.out.println(Integer.parseInt(top.get(i).getText()));
		Integer.parseInt(top.get(i).getText());
		sum = sum + Integer.parseInt(top.get(i).getText());
		
		
		
		
		}
		
		System.out.println(sum);
		
		driver.findElement(By.className("totalAmount")).getText();
		
			int abc=Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
			System.out.println(abc);
			
		
	
		
		
	}
}
