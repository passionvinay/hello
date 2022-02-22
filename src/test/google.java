package test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("testing");
				
		//driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).submit();
		
		String done=driver.findElement(By.cssSelector("div[id='result-stats']")).getText();
		//String[] abc =done.split(",");
		
		
		
	//String abc=done.split(type name = new type(results));
	
		//done.trim().intern("results");
		//done.trim().replace(",",",");
		System.out.println(done);
		//System.out.println(abc);
		
		
	}

}
