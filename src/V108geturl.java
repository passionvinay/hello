import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V108geturl {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//$('a[href*="SoapUI"]')
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		conn.getURL();
		int Responsecode=conn.getResponseCode();
		System.out.println(Responsecode);
		System.out.println(conn);
		
		
		String soft=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpURLConnection connec =(HttpURLConnection) new URL(soft).openConnection();
		connec.setRequestMethod("HEAD");
		connec.connect();
		int rs=connec.getResponseCode();
		System.out.println(rs);
		
		
		
		
		
		
		
	}

}
