package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
				
		System.out.println("parent window id :" +parentWindowId);
		
		String childWindowId = it.next();
		
		System.out.println("child window id :" +childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("child window title:" +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("parent window title:" +driver.getTitle());
		
		
		
	}

}
