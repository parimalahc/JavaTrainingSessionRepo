package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		System.out.println("Title before login==>" + driver.getTitle());
		
		
		
		driver.findElement(By.name("email")).sendKeys("cheerfulpari@yahoo.ca");
		driver.findElement(By.name("pass")).sendKeys("lifeisgood");
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Title after login==>" +driver.getTitle() );
		
		

	}

}
