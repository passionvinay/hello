import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class v131navigatewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String>handler=driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
		String parentwindows=it.next();
		String childwindwos =it.next();
		driver.switchTo().window(childwindwos);
		driver.get("https://www.rahulshettyacademy.com/");
		String weblink=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(3).getText();
		driver.switchTo().window(parentwindows);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(weblink);
		
		
	}

}
