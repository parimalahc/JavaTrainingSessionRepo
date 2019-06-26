package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	
	static WebDriver driver; 

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\JavaTrainingSession\\src\\SeleniumSessions\\config.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstnamexpath"))).sendKeys(prop.getProperty("firstname"));
		
		driver.findElement(By.id(prop.getProperty("lastnameid"))).sendKeys(prop.getProperty("lastname"));
		
		driver.findElement(By.xpath(prop.getProperty("emailidxpath"))).sendKeys(prop.getProperty("email"));
		
		driver.findElement(By.xpath(prop.getProperty("passwordxpath"))).sendKeys(prop.getProperty("password"));
		
		
		
		
		
		
		

	}

}
