package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		boolean b1 = driver.findElement(By.id("u_0_15")).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.id("u_0_15")).isEnabled();
		System.out.println(b2);
		
		boolean b3 = driver.findElement(By.cssSelector("#u_0_8")).isSelected();
		System.out.println(b3);
		
		driver.findElement(By.cssSelector("#u_0_8")).click();
		boolean b4 = driver.findElement(By.cssSelector("#u_0_8")).isEnabled();
		System.out.println(b4);
		
		boolean b5 = driver.findElement(By.cssSelector("#u_0_8")).isSelected();
		System.out.println(b5);
		
		

	}

}
