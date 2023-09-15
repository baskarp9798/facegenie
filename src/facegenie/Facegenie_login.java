package facegenie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facegenie_login {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		driver = new FirefoxDriver();
	}
	@Test

	public void login() throws InterruptedException {
		   
		   driver.get("https://facegenie-ams-school.web.app/");
		   
		   driver.manage().window().maximize();
		   
		   System.out.println("The title of the page is" + driver.getTitle());
		   
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testbams@gmail.com");
		   
		   driver.findElement(By.cssSelector("input[name='password']")).sendKeys("facegenie");
		   
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		   
		   System.out.println("Logged in Succesfully");
		   
		   Thread.sleep(20000);
		   
		   driver.findElement(By.cssSelector("div:nth-child(8) div:nth-child(2) span:nth-child(1)")).click();
		   
		   driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		   
		   System.out.println(driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1xsto0d']")).getText());
		   
		   driver.quit();
		   
		   }
	@Test
	
	public void login1() throws InterruptedException {
		
		   driver.get("https://facegenie-ams-school.web.app/");
		   
		   driver.manage().window().maximize();
		   
		   System.out.println("The title of the page is" + driver.getTitle());
		   
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testbams1456@gmail.com");
		   
		   driver.findElement(By.cssSelector("input[name='password']")).sendKeys("FACEGENIE");
		   
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		   
		   Thread.sleep(1000);
		   
		   System.out.println("Output for Inv email and Password:" + driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1xsto0d']")).getText());
		   
		   driver.quit();
         }
	
	@Test
	
	public void login2() throws InterruptedException {
		
		driver.get("https://facegenie-ams-school.web.app/");
		   
		   driver.manage().window().maximize();
		   
		   System.out.println("The title of the page is" + driver.getTitle());
		   
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testbams@gmail.com");
		   
		   driver.findElement(By.cssSelector("input[name='password']")).sendKeys("FaceGenie");
		   
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		   
		   Thread.sleep(1000);
		   
		   System.out.println("Output for Valid email and Inv Password:" + driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1xsto0d']")).getText());
	
		   driver.quit();
	}
	
	@Test
	
	public void login3() throws InterruptedException {
		
		driver.get("https://facegenie-ams-school.web.app/");
		   
		   driver.manage().window().maximize();
		   
		   System.out.println("The title of the page is" + driver.getTitle());
		   
           driver.findElement(By.xpath("//input[@name='email']")).sendKeys("TESTBAMS@GMAIL.COM");
		   
		   driver.findElement(By.cssSelector("input[name='password']")).sendKeys("facegenie");
		   
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		   
		   System.out.println(driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1xsto0d']")).getText());
		   
		   Thread.sleep(2000);
		   
		   driver.quit();
	}
}

