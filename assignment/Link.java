package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
public static void main(String[] args) {
	System.setProperty(" webdriver.chrome.driver " , "D:\\\\cromedriver\\\\LICENSE.chromedriver\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium_webdriver/selenium_webdriver_handling_links.htm#:~:text=Selenium%20can%20be%20used%20to%20handle%20links%20on,for%20its%20identification%20and%20utilize%20the%20method%20find_element_by_link_text.");
   driver.manage().window().maximize();
	
	WebElement pack = driver.findElement(By.linkText("Prime Packs"));
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   pack.click();
    
   
   WebElement course = driver.findElement(By.partialLinkText("Courses"));
   try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   course.click();


}
}
