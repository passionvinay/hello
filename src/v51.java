import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class v51 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		//select dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown=new Select(staticDropdown);
		
		
		

		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByVisibleText("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.selectByVisibleText("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		

				
		
		
		
		
		
		
		
		//Thread.sleep(10000);
		
	//	driver.close();
		


		
		
		
	}

}
