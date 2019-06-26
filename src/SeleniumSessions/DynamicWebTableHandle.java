package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("parimalapawankumar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mantra1$");
		
		driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
		
//		driver.switchTo().frame("downloadFrame");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class = 'users icon']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//td[contains(text(),'test test 2')]//preceding-sibling::td//input[@type = 'checkbox']")).click();
		
		WebElement element = driver.findElement(By.xpath("//td[contains(text(),'test test 2')]//preceding-sibling::td//input[@type = 'checkbox']"));
		
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
		
		WebElement element1 = driver.findElement(By.xpath("//td[contains(text(),'pari1 par')]//preceding-sibling::td//input[@type = 'checkbox']"));
		
		
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("arguments[0].click();", element1);
		
		
	}
	
	
}
















