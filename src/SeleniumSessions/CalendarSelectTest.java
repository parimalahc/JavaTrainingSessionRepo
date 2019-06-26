package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectTest {

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
		
		driver.findElement(By.xpath("//i[@class = 'calendar icon']")).click();
		
		Thread.sleep(3000);
		
		String date = "15-June-2019";
		String date1[] = date.split("-");
		String day = date1[0];
		String month = date1[1];
		String year = date1[2];
		
		
	
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/div[6]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/div[6]
		//driver.findElement(By.xpath("*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]")).click();
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]
		String beforeXpath = "*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[";
		String afterXpath = "]/div[1]/div[";
		
		final int totalWeekDays = 7;
		boolean flag = false;
		String dayVal = null;
		
		for(int rowNum=2;rowNum<=7;rowNum++) {
			for(int colNum=1;colNum<=totalWeekDays;colNum++) {
				try {
				dayVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				}catch(NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal .equals(day)) {
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}
			}
			
		
		if(flag) {
			break;
		}
	}

}
}
