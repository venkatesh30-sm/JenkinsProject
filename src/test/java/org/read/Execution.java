package org.read;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Execution{
    
	static WebDriver driver;
	
	
	@BeforeMethod
	public void tear() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sM\\eclipse-workspace\\ProjectMaven\\d\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
	}
	@Test
	public void test1() throws InterruptedException {
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		Thread.sleep(2000);
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void test2() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	}
	

	@Test
	public void test3() throws InterruptedException {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Camera");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(false);
	}
	
	
	 
		
		
}
