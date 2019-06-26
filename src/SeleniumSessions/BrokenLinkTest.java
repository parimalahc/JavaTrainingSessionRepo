package SeleniumSessions;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total Number of links and images" +linkslist.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i =0;i<linkslist.size();i++) {
			if(linkslist.get(i).getAttribute("href")!=null && (!linkslist.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkslist.get(i));
			}
		}
		
		System.out.println("Total number of active links and images" +activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++) {
			
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activeLinks.get(j).getAttribute("href") + "====>" + response);
			
		}

	}

}
