package assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FacebookLoginTest {
	
	WebDriver driver; 

	  @BeforeClass
	  public void beforeClass() {
		  
		  {
			  System.setProperty(" webdriver.chrome.driver " , "D:\\cromedriver\\LICENSE.chromedriver\\");

			  driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.manage().window().maximize();
	  }
	  }
	
  @BeforeMethod
  public void openBrowser() {
	  driver.get("https://www.facebook.com/");
	  
	  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	  
  }
  
  @Test(description="This method validates the login functionality")
  
  public void login()
  {
	  driver.findElement(By.id("email")).sendKeys("7600954380");
		driver.findElement(By.id("pass")).sendKeys("Mani27#");
		driver.findElement(By.name("login")).click();
		String msg = driver.findElement(By.className("")).getText();
		System.out.println(msg);
  }

  @AfterMethod
  public void postSignUp() {
	  
	  System.out.println(driver.getCurrentUrl());
  }


  @AfterClass
  public void afterClass() {
	  driver.quit();
  }


}
