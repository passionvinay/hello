package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://customercare.bngbg:fortis@321@helpdesk.myfortishealthcare.com");
		//driver.get("https://www.google.co.in");
		
		
		driver.findElement(By.cssSelector("button[class='btn']")).click();
		driver.findElement(By.cssSelector("div[class='disp-c fw vmiddle pl10 pt3']")).click();
		driver.findElement(By.cssSelector("div[class='disp-c fw vmiddle pl10 pt3']")).click();
		
		
		
	}

}
