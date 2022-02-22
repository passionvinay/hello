package test;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class V115performingwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Test work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//tr/td[1]")).click();
		
		//capture all webelement into list
		List<WebElement> kart=driver.findElements(By.xpath("//tr/td[1]"));
			
		//capture text of all webelement into new list(orginal list)
		List<String> original =kart.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort in theoriginal  list of step3->sorted list
		//List<WebElement> sort=driver.findElements(By.xpath("//tr/td[1]"));
		//List<String> websort= original.stream().sorted().map(s->s.getText()).collect(Collectors.toList());
		//System.out.println(websort);
		
		List<String>so=original.stream().sorted().collect(Collectors.toList());
		//System.out.println(so);
		//System.out.println(original);
		
		//campare original list and sorted list
		
		//Assert.assertTrue(original.equals(so));
		
		kart.stream().filter(s->s.getText().contains("Potato")).map(s->vegieprice(s)).collect(Collectors.toList()).forEach(a->System.out.println(a));

		
	}

	private static Object vegieprice(WebElement s) {
		
		// TODO Auto-generated method stub
		
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

	
}

