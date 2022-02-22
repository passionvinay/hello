import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;


public class v128relativelocatoroptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameeditbox=driver.findElement(By.cssSelector("[name='name']"));
	//driver.findElement(with(By.tagName("name")).above(nameeditbox)).getText();
	System.out.println(driver.findElement(with(By.tagName("label")).above(nameeditbox)).getText());
	WebElement birth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
	driver.findElement(with(By.tagName("input")).below(birth)).click();
	//System.out.println(driver.findElement(with(By.tagName("input")).below(birth)).click());
	WebElement click=driver.findElement(By.xpath("//label [text()='Check me out if you Love IceCreams!']"));
	driver.findElement(with(By.tagName("input")).toLeftOf(click)).click();
	WebElement cl=driver.findElement(By.cssSelector("input[id='inlineRadio1']"));
	driver.findElement(with(By.tagName("label")).toRightOf(cl)).click();
	Thread.sleep(2000);
	WebElement cl1=driver.findElement(By.cssSelector("input[id='inlineRadio2']"));
	driver.findElement(with(By.tagName("label")).toRightOf(cl1)).click();
	

	

		
	}

}
