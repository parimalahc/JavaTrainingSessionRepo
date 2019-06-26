package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("window-size=1400,800");
//		options.addArguments("headless");
		
		driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
	}

	@Test(priority=2,groups="Title")
	public void googleTitleTest(){
//		if(driver!=null) {
		String title = driver.getTitle();
//		
//		String titleUTF8=new String(title.getBytes(), "iso-8859-1");
//		
//		char[] titleArr=titleUTF8.toCharArray();
//		
//		System.out.println();
//		
//	    PrintStream out = new PrintStream(System.out, true, "UTF-8");
//	    
//		
//		for(char ch:titleArr) {
//			out.println(ch);
//		}
//		
//		System.out.println();
//		
		System.out.println(title);
		Assert.assertEquals(title, "Google123","title does not match");
	}
	
	@Test(priority=3,groups="logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, false);
	}
	
	@Test(priority=1,groups="Link test")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}

	@AfterMethod
	public void tearDown() {
//		if(driver!=null) {
		driver.close();

	}

}
