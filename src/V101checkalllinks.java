import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import net.jodah.failsafe.internal.util.Assert;

public class V101checkalllinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	SoftAssert a =new SoftAssert();
	
		for(WebElement link:links)
		{
		String url=link.getAttribute("href");
	HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int code=conn.getResponseCode();
System.out.println(code);
//if(code>400)
//{
//System.out.println("this is broken link of"+link.getText() +"this is broken with code"+code);
a.assertTrue(code<400,"this is broken link of"+link.getText() +"this is broken with code"+ code);

		}		
		a.assertAll();	

		
		//
		
		
		
		
		
	}

}
