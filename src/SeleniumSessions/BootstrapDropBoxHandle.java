package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle btn btn-default')]"))
				.click();

		List<WebElement> li = driver
				.findElements(By.xpath("//ul[@class = 'multiselect-container dropdown-menu']//li//a//label"));

		System.out.println(li.size());

//		for(int i =0;i<li.size();i++) {
//			System.out.println(li.get(i).getText());
//			if(li.get(i).getText().equals("Angular")) {
//				li.get(i).click();
//				break;
//			}
//		}

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
			li.get(i).click();

		}

	}
}
