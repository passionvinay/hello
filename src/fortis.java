import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class fortis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fortishealthcare.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//a[@class='super-top-nav'][normalize-space()='About']")).click();
		//driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[1]/div[2]/div/p[1]/text()")).getText();
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Fortis Healthcare Limited – an IHH Healthcare Berh')]")).getText());
		//System.out.println(driver.findElement(By.id("searchHospital")).getText());
		/*
		driver.findElement(By.className("dropdown-toggle.nav-speciality")).click();
		driver.findElement(By.className("nav-speciality")).click();
		driver.findElement(By.id("searchDoctor")).sendKeys("Abhishek Shrikhande");
		System.out.println(driver.findElement(By.id("searchSpecialist")).getText());
		System.out.println(driver.findElement(By.id("searchHospital")).getText());*/
		
		
	}

}
