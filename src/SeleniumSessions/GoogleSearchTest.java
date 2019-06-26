package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("testing");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']/li[@class = 'sbct']/descendant::div[@class= 'sbl1']/span"));
		
		System.out.println("Total number of suggestions ===> :" +list.size());
		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing interview questions")) {
				list.get(i).click();
				break;
			}
		}
	}

}
