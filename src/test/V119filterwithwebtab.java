package test;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class V119filterwithwebtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("input[id='search-field']")).click();
		driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys("Tomato");
		List<WebElement>iteams=driver.findElements(By.xpath("//tr/td[1]"));
		//System.out.println(iteams);
		List<WebElement>vegit=iteams.stream().filter(vegi->vegi.getText().contains("Tomato")).collect(Collectors.toList());
		
	//System.out.println(vegit);
		

		Assert.assertEquals(iteams.size(),vegit.size());
		
		
		
		
		
		
	}

}
