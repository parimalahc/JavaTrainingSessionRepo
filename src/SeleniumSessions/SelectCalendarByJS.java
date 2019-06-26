package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarByJS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class = 'ui-datepicker-trigger']")).click();
		
		//WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal = "26/06";
		
		selectDateByJS(driver,dateVal);
		
		//driver.navigate().refresh();

	}
	
	public static void selectDateByJS(WebDriver driver,String dateVal) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='"+dateVal+"';");
		
	}

}
