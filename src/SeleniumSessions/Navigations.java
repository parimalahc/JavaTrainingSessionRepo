package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		

	}

}
