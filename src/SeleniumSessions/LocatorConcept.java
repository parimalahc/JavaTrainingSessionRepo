package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Peter");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
				
		

	}

}
