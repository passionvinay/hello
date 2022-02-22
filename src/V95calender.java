import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V95calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.cssSelector("input[class='text form-control']")).click();
		// i need to select March 23 2022
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("March"))
		
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
			
		}
		List<WebElement> dates=driver.findElements(By.className("day"));	
		System.out.println(driver.findElements(By.className("day")).size());
		int count=driver.findElements(By.className("day")).size();
				
		for (int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
				
			}
				
		}
		 
		

		
		
		
	}

}
