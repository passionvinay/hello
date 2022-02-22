import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class v51dropdownloopingui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\test work\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");

System.out.println(driver.getCurrentUrl());
	

//driver.findElement(By.cssSelector(".css-76zvg2.r-homxoj.r-ubezar.r-1ozqkpa")).click();




		
	}
	

}
