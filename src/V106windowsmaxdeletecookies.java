import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V106windowsmaxdeletecookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		
	}

}
