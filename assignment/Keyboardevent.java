package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevent {

	private static Actions action;

	public static void main(String[] args) {

		System.setProperty(" webdriver.chrome.driver " , "D:\\\\cromedriver\\\\LICENSE.chromedriver\\");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/ ");
		
		Actions actions = new Actions(driver);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hello");
		
		
		 actions.sendKeys(Keys.TAB);
	     actions.build().perform();
		
	     WebElement password = driver.findElement(By.id("pass"));
	     password.sendKeys("hello");
	     
	     actions.sendKeys(Keys.TAB);
	     actions.build().perform();
	     
  WebElement login = driver.findElement(By.name("login"));
   login.click();
          
         // WebElement element = driver.findElement(By.name("login"));

          //action = null;
		//action.moveToElement(element).click();
	}

}
