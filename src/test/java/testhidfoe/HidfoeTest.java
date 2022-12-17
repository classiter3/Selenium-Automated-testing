package testhidfoe;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidfoeTest {
	WebDriver driver;
	
  @Test
  public void login1() {
//Instantiate the WebBrowser 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\craig\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe"); {
	ChromeDriver driver = new ChromeDriver();
	
//Open the AUI	
	driver.get("http://hidfoe.com/");
	String url = driver.getCurrentUrl();
	System.out.println("Current URL :" + url);
	String pageTitle = driver.getTitle();

	
	
	
	
//Find Title Test Case1	
if("HIDFOE".equals(pageTitle)) {
		
		System.out.println("Test Case1 passed");
	} else {
		System.out.println("Test Case1 failed");
		
	}
	
	
//Test Case2
	driver.findElement(By.id("navbarDropdown1")).click();	
	driver.findElement(By.className("dropdown-item")).click();
	
//Iterator String
	 Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		
		
//Login test1
	
	driver.findElement(By.name("username1")).sendKeys("1");
	driver.findElement(By.name("password1")).sendKeys("1");
	driver.findElement(By.name("submit")).click();
	
	driver.findElement(By.id("selenium tutorial")).click();
	driver.findElement(By.id("selenium tutorial 2")).click();
	
	
	
	
	String url1 = driver.getCurrentUrl();
	System.out.println("Current URL :" + url1);
	String pageTitle1 =driver.getTitle();
	
if("HIDFOE VIDEOS".equals(pageTitle1)) {
		
		System.out.println("Test Case2 passed");
	} else {
		System.out.println("Test Case2 failed");
		
	}}
	

}





@Test
public void login2() {
		//Instantiate the WebBrowser 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\craig\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe"); {
	ChromeDriver driver = new ChromeDriver();
	
	//Open the AUI	
	driver.get("http://hidfoe.com/");
	String url = driver.getCurrentUrl();
	System.out.println("Current URL :" + url);
	String pageTitle1 = driver.getTitle();

	
	
	
	
	//Find Title Test Case1	
if("HIDFOE".equals(pageTitle1)) {
		
		System.out.println("Page title test1 passed");
	} else {
		System.out.println("Page title test2 passed failed");
		
	}
	
	
//Find Title Test Case2
	driver.findElement(By.id("navbarDropdown1")).click();	
	driver.findElement(By.className("dropdown-item")).click();
	
	//Iterator String
	 Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator =windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow = iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		

//Login test2
	
	
	driver.findElement(By.id("navbarDropdown1")).click();
	driver.findElement(By.className("dropdown-item")).click();
	
	driver.findElement(By.name("username1")).sendKeys("2");
	driver.findElement(By.name("password1")).sendKeys("2");
	driver.findElement(By.name("submit")).click();
	
	driver.findElement(By.id("selenium tutorial")).click();
	driver.findElement(By.id("selenium tutorial 2")).click();
	
	
	

}}}